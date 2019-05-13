package com.softtest.softtest.ControlUtilTest;

import com.softtest.softtest.entity.QuestionInfo;
import com.softtest.softtest.util.ControlUtil;
import com.softtest.softtest.util.errCode.sub.BlackAuthorException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class BlackAuthorTest {
    private static ArrayList<String> mBlackAuthorList;
    private static ControlUtil mControl;

    @BeforeClass
    public static void init() {
        mBlackAuthorList = new ArrayList<String>() {{
            add("testuser1");
            add("testuser2");
            add("testuser3");
            add("sa");
        }};
        mControl = new ControlUtil();
    }

    @Test
    public void checkTrue() {
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put("单选题", new ArrayList<QuestionInfo>() {{
                    add(QuestionInfoFactory.createQuestionInfoByAuthor("user1"));
                }});
            }}, mBlackAuthorList);
        } catch (Exception e) {
            assertFalse(e instanceof BlackAuthorException);
        }
    }

    /**
     * 传入空指针
     */
    @Test
    public void checkNullList() {
        try {
            mControl.checkBlackAuthor(new HashMap<>(), null);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
        try {
            mControl.checkBlackAuthor(null, mBlackAuthorList);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
        try {
            mControl.checkBlackAuthor(null, null);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

    /**
     * 重复添加作者到黑名单
     */
    @Test
    public void checkRepeatBlackAuthor() {
        try {
            mControl.checkBlackAuthor(new HashMap<>(), new ArrayList<String>() {{
                add("user");
                add("user");
            }});
        } catch (Exception e) {
            assertTrue(e instanceof BlackAuthorException);
            assertTrue(((BlackAuthorException) e).getDetails().equals("重复添加作者到黑名单"));
        }
    }

    /**
     * 正确的黑名单
     */
    @Test
    public void checkBlackAuthorList() {
        try {
            mControl.checkBlackAuthor(new HashMap<>(), mBlackAuthorList);
        } catch (BlackAuthorException e) {
            fail();
        }
    }

    /**
     * 某一题型的作者在黑名单中
     * 单选题
     * 多选题
     * 填空题
     * 情景题
     * 视频题
     * 问答题
     */
    @Test
    public void checkInBlackListOnQuestionType() {
        ArrayList<String> questionTypeList = new ArrayList<String>() {{
            add("单选题");
            add("多选题");
            add("情景题");
            add("视频题");
        }};
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put(questionTypeList.get(0), new ArrayList<QuestionInfo>() {{
                    for (int i = 0; i < 5; i++) {
                        add(QuestionInfoFactory.createQuestionInfoByType(mBlackAuthorList.get(0), questionTypeList.get(0)));
                    }
                }});
            }}, mBlackAuthorList);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof BlackAuthorException);
        }
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put(questionTypeList.get(1), new ArrayList<QuestionInfo>() {{
                    for (int i = 0; i < 5; i++) {
                        add(QuestionInfoFactory.createQuestionInfoByType(mBlackAuthorList.get(1), questionTypeList.get(1)));
                    }
                }});
            }}, mBlackAuthorList);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof BlackAuthorException);
        }
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put(questionTypeList.get(2), new ArrayList<QuestionInfo>() {{
                    for (int i = 0; i < 5; i++) {
                        add(QuestionInfoFactory.createQuestionInfoByType(mBlackAuthorList.get(2), questionTypeList.get(2)));
                    }
                }});
            }}, mBlackAuthorList);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof BlackAuthorException);
        }
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put(questionTypeList.get(3), new ArrayList<QuestionInfo>() {{
                    for (int i = 0; i < 5; i++) {
                        add(QuestionInfoFactory.createQuestionInfoByType(mBlackAuthorList.get(3), questionTypeList.get(3)));
                    }
                }});
            }}, mBlackAuthorList);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof BlackAuthorException);
        }
    }


    /**
     * 测试，一个作者被添加到黑名单，那么他已经出的相关知识点题目也应该在黑名单中
     */
    @Test
    public void checkInBlackListOnKnowledge() {
        ArrayList<String> knowledgeList = new ArrayList<String>() {{
            add("通过具体的例子，描述软件中的缺陷会以什么样的方式损害个人、损害环境或者损害公司利益");
            add("区分引起缺陷的根本原因及其影响");
            add("通过举例的方式说明为什么需要测试");
        }};
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put(knowledgeList.get(0), new ArrayList<QuestionInfo>() {{
                    for (int i = 0; i < 5; i++) {
                        add(QuestionInfoFactory.createQuestionInfoByKnowledgePoint(mBlackAuthorList.get(0), knowledgeList.get(0)));
                    }
                }});
            }}, mBlackAuthorList);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof BlackAuthorException);
        }
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put(knowledgeList.get(1), new ArrayList<QuestionInfo>() {{
                    for (int i = 0; i < 5; i++) {
                        add(QuestionInfoFactory.createQuestionInfoByKnowledgePoint(mBlackAuthorList.get(1), knowledgeList.get(1)));
                    }
                }});
            }}, mBlackAuthorList);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof BlackAuthorException);
        }
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put(knowledgeList.get(2), new ArrayList<QuestionInfo>() {{
                    for (int i = 0; i < 5; i++) {
                        add(QuestionInfoFactory.createQuestionInfoByKnowledgePoint(mBlackAuthorList.get(2), knowledgeList.get(2)));
                    }
                }});
            }}, mBlackAuthorList);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof BlackAuthorException);
        }
    }

    /**
     * 测试，一个作者被添加到黑名单，那么他负责的所有项目都将被添加到黑名单
     */
    @Test
    public void checkInBlackListOnProject() {
        ArrayList<String> projectList = new ArrayList<String>() {{
            add("测试技术");
            add("测试概念");
        }};
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put(projectList.get(0), new ArrayList<QuestionInfo>() {{
                    for (int i = 0; i < 5; i++) {
                        add(QuestionInfoFactory.createQuestionInfoByProject(mBlackAuthorList.get(0), projectList.get(0)));
                    }
                }});
            }}, mBlackAuthorList);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof BlackAuthorException);
        }
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put(projectList.get(1), new ArrayList<QuestionInfo>() {{
                    for (int i = 0; i < 5; i++) {
                        add(QuestionInfoFactory.createQuestionInfoByProject(mBlackAuthorList.get(1), projectList.get(1)));
                    }
                }});
            }}, mBlackAuthorList);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof BlackAuthorException);
        }
    }

    /**
     * 测试该作者是否在黑名单内
     */
    @Test
    public void checkInBlackListOnAuthor() {
        ArrayList<String> authorList = new ArrayList<String>() {{
            add(mBlackAuthorList.get(0));
            add("user1");
        }};
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put(authorList.get(0), new ArrayList<QuestionInfo>() {{
                    for (int i = 0; i < 5; i++) {
                        add(QuestionInfoFactory.createQuestionInfoByAuthor(authorList.get(0)));
                    }
                }});
            }}, mBlackAuthorList);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof BlackAuthorException);
        }
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put(authorList.get(1), new ArrayList<QuestionInfo>() {{
                    for (int i = 0; i < 5; i++) {
                        add(QuestionInfoFactory.createQuestionInfoByAuthor(authorList.get(1)));
                    }
                }});
            }}, mBlackAuthorList);
        } catch (Exception e) {
            assertFalse(e instanceof BlackAuthorException);
        }
    }

    /**
     * 测试，不因特定语言而产生不同判断
     */
    @Test
    public void checkInBlackListOnLanguage() {
        ArrayList<String> languageList = new ArrayList<String>() {{
            add("中文");
            add("英文");
            add("法文");
        }};
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put("单选题", new ArrayList<QuestionInfo>() {{
                    for (int i = 0; i < 5; i++) {
                        add(QuestionInfoFactory.createQuestionInfoByLanguage(mBlackAuthorList.get(0), languageList.get(0)));
                    }
                }});
            }}, mBlackAuthorList);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof BlackAuthorException);
        }
    }

    /**
     * 混合测试
     */
    @Test
    public void checkInBlackListOnMixed() {
        ArrayList<Boolean> expected = new ArrayList<>();
        try {
            mControl.checkBlackAuthor(new HashMap<String, List<QuestionInfo>>() {{
                put("单选题", new ArrayList<QuestionInfo>() {{
                    add(QuestionInfoFactory.createQuestionInfoByAuthor(mBlackAuthorList.get(0)));
                    add(QuestionInfoFactory.createQuestionInfoByLanguage(mBlackAuthorList.get(1), "中文"));
                    add(QuestionInfoFactory.createQuestionInfoByProject(mBlackAuthorList.get(2), "项目"));
                    add(QuestionInfoFactory.createQuestionInfoByKnowledgePoint(mBlackAuthorList.get(3), ""));
                }});
                put("多选题", new ArrayList<QuestionInfo>() {{
                    add(QuestionInfoFactory.createQuestionInfoByType(mBlackAuthorList.get(0), ""));
                    add(QuestionInfoFactory.createQuestionInfoByStatus(mBlackAuthorList.get(1), ""));
                    add(QuestionInfoFactory.createQuestionInfoByStem(mBlackAuthorList.get(2), ""));
                    add(QuestionInfoFactory.createQuestionInfoByKnowledgePoint(mBlackAuthorList.get(3), ""));
                }});
            }}, mBlackAuthorList);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof BlackAuthorException);
        }
    }


    static class QuestionInfoFactory {
        static QuestionInfo createQuestionInfoByType(String author, String type) {
            return new QuestionInfo(new Random().nextInt(),
                    "",
                    type,
                    "",
                    "",
                    1,
                    1,
                    "",
                    author,
                    "");
        }

        static QuestionInfo createQuestionInfoByKnowledgePoint(String author, String knowledgePoint) {
            return new QuestionInfo(new Random().nextInt(),
                    "",
                    "",
                    "",
                    knowledgePoint,
                    1,
                    1,
                    "",
                    author,
                    "");
        }

        static QuestionInfo createQuestionInfoByStatus(String author, String status) {
            return new QuestionInfo(new Random().nextInt(),
                    "",
                    "",
                    status,
                    "",
                    1,
                    1,
                    "",
                    author,
                    "");
        }

        static QuestionInfo createQuestionInfoByStem(String author, String stem) {
            return new QuestionInfo(new Random().nextInt(),
                    stem,
                    "",
                    "",
                    "",
                    1,
                    1,
                    "",
                    author,
                    "");
        }

        static QuestionInfo createQuestionInfoByDifficulty(String author, Integer difficulty) {
            return new QuestionInfo(new Random().nextInt(),
                    "",
                    "",
                    "",
                    "",
                    difficulty,
                    1,
                    "",
                    author,
                    "");
        }

        static QuestionInfo createQuestionInfoByProject(String author, String project) {
            return new QuestionInfo(new Random().nextInt(),
                    "",
                    "",
                    "",
                    "",
                    1,
                    1,
                    project,
                    author,
                    "");
        }

        static QuestionInfo createQuestionInfoByLanguage(String author, String language) {
            return new QuestionInfo(new Random().nextInt(),
                    "",
                    "",
                    "",
                    "",
                    1,
                    1,
                    "",
                    author,
                    language);
        }

        static QuestionInfo createQuestionInfoByAuthor(String author) {
            return new QuestionInfo(new Random().nextInt(),
                    "",
                    "",
                    "",
                    "",
                    1,
                    1,
                    "",
                    author,
                    "");
        }
    }

}