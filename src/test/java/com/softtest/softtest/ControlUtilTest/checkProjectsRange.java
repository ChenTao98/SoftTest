package com.softtest.softtest.ControlUtilTest;

import com.softtest.softtest.entity.QuestionInfo;
import com.softtest.softtest.util.ControlUtil;
import com.softtest.softtest.util.errCode.sub.BeyondProjectsException;
import com.softtest.softtest.util.errCode.sub.WrongScoreException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class checkProjectsRange {

    private Map<String, List<QuestionInfo>> map;
    private Map<String, List<QuestionInfo>> noMap;
    private ControlUtil controlUtil = new ControlUtil();
    private List<String> projectName;

    @Before
    public void init() {
        projectName = new ArrayList<>();
        projectName.add("测试技术");
        projectName.add("testProject1");
        projectName.add("test1");
        projectName.add("test02");
        projectName.add("test03");
        projectName.add("test04");
        projectName.add("2234");
        map = new HashMap<>();
        noMap = new HashMap<>();


        noMap.put("单选题", initList("22"));
        noMap.put("情景题", initList("33"));
        noMap.put("图像题", initList("223"));

    }

    @Test
    public void testExist1() {
        try {
            map.put("单选题", initList("测试技术"));
            controlUtil.checkProjectsRange(map, projectName);
        } catch (BeyondProjectsException e) {
            fail();
        }
    }
    @Test
    public void testExist2() {
        try {
            map.put("情景题", initList("test02"));
            controlUtil.checkProjectsRange(map, projectName);
        } catch (BeyondProjectsException e) {
            fail();
        }

    }


    @Test
    public void testExist3() {
        try {
            map.put("图像题", initList("2234"));
            controlUtil.checkProjectsRange(map, projectName);
        } catch (BeyondProjectsException e) {
            fail();
        }
    }
    @Test
    public void testExist4() {
        try {
            map.put("图像题", initList("test1"));
            controlUtil.checkProjectsRange(map, projectName);
        } catch (BeyondProjectsException e) {
            fail();
        }
    }
    @Test
    public void testExist5() {
        try {
            map.put("图像题", initList("test03"));
            controlUtil.checkProjectsRange(map, projectName);
        } catch (BeyondProjectsException e) {
            fail();
        }
    }


    @Test
    public void testNoExist1() {

        try {
            controlUtil.checkProjectsRange(noMap, projectName);
            fail();
        } catch (BeyondProjectsException e) {
            assertEquals("题目在制定项目范围外", e.getDetails());
        }
    }    @Test
    public void testNoExist2() {

        try {
            noMap.put("图像题", initList("test11"));
            controlUtil.checkProjectsRange(noMap, projectName);
            fail();
        } catch (BeyondProjectsException e) {
            assertEquals("题目在制定项目范围外", e.getDetails());
        }
    }    @Test
    public void testNoExist3() {

        try {
            noMap.put("图像题", initList("test112"));
            controlUtil.checkProjectsRange(noMap, projectName);
            fail();
        } catch (BeyondProjectsException e) {
            assertEquals("题目在制定项目范围外", e.getDetails());
        }
    }    @Test
    public void testNoExist4() {

        try {
            noMap.put("图像题", initList("test113"));
            controlUtil.checkProjectsRange(noMap, projectName);
            fail();
        } catch (BeyondProjectsException e) {
            assertEquals("题目在制定项目范围外", e.getDetails());
        }
    }    @Test
    public void testNoExist5() {

        try {
            noMap.put("图像题", initList("test114"));
            controlUtil.checkProjectsRange(noMap, projectName);
            fail();
        } catch (BeyondProjectsException e) {
            assertEquals("题目在制定项目范围外", e.getDetails());
        }
    }

    private List<QuestionInfo> initList(String type) {
        List<QuestionInfo> result = new ArrayList<>();
        result.add(new QuestionInfo(type));
        return result;
    }
}
