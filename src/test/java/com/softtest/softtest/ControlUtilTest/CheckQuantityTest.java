package com.softtest.softtest.ControlUtilTest;

import com.softtest.softtest.entity.Question;
import com.softtest.softtest.entity.QuestionInfo;
import com.softtest.softtest.util.ControlUtil;
import com.softtest.softtest.util.errCode.sub.WrongQuantityException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert.*;

import java.util.*;

@RunWith(Parameterized.class)
public class CheckQuantityTest {

    private QuestionMapNode node;

    @Parameterized.Parameters
    public static Collection<QuestionMapNode[]> getTestData() {
        List<QuestionMapNode[]> data = new ArrayList<>();

        // 第一个分支
        // map == null
        data.add(new QuestionMapNode[] {new QuestionMapNode("map empty", null)});

        List<TestCaseNode> cases = new ArrayList<>();

        // 正常case
        List<QuantityNode> case1 = new ArrayList<QuantityNode>(){{
            add(new QuantityNode("单选题", 4));
            add(new QuantityNode("多选题", 5));
            add(new QuantityNode("填空题", 5));
            add(new QuantityNode("情景题", 2));
            add(new QuantityNode("视频题", 2));
            add(new QuantityNode("问答题", 2));
        }};
        cases.add(new TestCaseNode("normal result", case1));

        // 异常case
        // questionList == null
        List<QuantityNode> case2 = new ArrayList<QuantityNode>(){{
            add(new QuantityNode("单选题", -1));
            add(new QuantityNode("多选题", 5));
            add(new QuantityNode("填空题", 5));
            add(new QuantityNode("情景题", 2));
            add(new QuantityNode("视频题", 2));
            add(new QuantityNode("问答题", 2));
        }};
        cases.add(new TestCaseNode("no question type: 单选题", case2));

        // 异常case
        // questionList.size == 0
        List<QuantityNode> case3 = new ArrayList<QuantityNode>(){{
            add(new QuantityNode("单选题",  0));
            add(new QuantityNode("多选题", 5));
            add(new QuantityNode("填空题", 5));
            add(new QuantityNode("情景题", 2));
            add(new QuantityNode("视频题", 2));
            add(new QuantityNode("问答题", 2));
        }};
        cases.add(new TestCaseNode("no question type: 单选题", case3));

        // 异常case
        // quantity too many
        List<QuantityNode> case4 = new ArrayList<QuantityNode>(){{
            add(new QuantityNode("单选题",  6));
            add(new QuantityNode("多选题", 5));
            add(new QuantityNode("填空题", 5));
            add(new QuantityNode("情景题", 2));
            add(new QuantityNode("视频题", 2));
            add(new QuantityNode("问答题", 2));
        }};
        cases.add(new TestCaseNode("too many questions", case4));

        // 异常case
        // quantity too few
        List<QuantityNode> case5 = new ArrayList<QuantityNode>(){{
            add(new QuantityNode("单选题",  1));
            add(new QuantityNode("多选题", 5));
            add(new QuantityNode("填空题", 5));
            add(new QuantityNode("情景题", 2));
            add(new QuantityNode("视频题", 2));
            add(new QuantityNode("问答题", 2));
        }};
        cases.add(new TestCaseNode("too few questions", case5));

        // 异常case
        // 总数量太多
        List<QuantityNode> case6 = new ArrayList<QuantityNode>(){{
            add(new QuantityNode("单选题",  5));
            add(new QuantityNode("多选题", 5));
            add(new QuantityNode("填空题", 5));
            add(new QuantityNode("情景题", 3));
            add(new QuantityNode("视频题", 3));
            add(new QuantityNode("问答题", 3));
        }};
        cases.add(new TestCaseNode("too many questions in total", case6));

        // 异常case
        // 总数量太多
        List<QuantityNode> case7 = new ArrayList<QuantityNode>(){{
            add(new QuantityNode("单选题",  4));
            add(new QuantityNode("多选题", 4));
            add(new QuantityNode("填空题", 4));
            add(new QuantityNode("情景题", 2));
            add(new QuantityNode("视频题", 2));
            add(new QuantityNode("问答题", 2));
        }};
        cases.add(new TestCaseNode("too few questions in total", case7));

        // 正常case
        List<QuantityNode> case8 = new ArrayList<QuantityNode>(){{
            add(new QuantityNode("单选题", 5));
            add(new QuantityNode("多选题", 5));
            add(new QuantityNode("填空题", 5));
            add(new QuantityNode("情景题", 2));
            add(new QuantityNode("视频题", 2));
            add(new QuantityNode("问答题", 2));
        }};
        cases.add(new TestCaseNode("normal result", case8));

        // 正常case
        List<QuantityNode> case9 = new ArrayList<QuantityNode>(){{
            add(new QuantityNode("单选题", 5));
            add(new QuantityNode("多选题", 5));
            add(new QuantityNode("填空题", 5));
            add(new QuantityNode("情景题", 3));
            add(new QuantityNode("视频题", 2));
            add(new QuantityNode("问答题", 2));
        }};
        cases.add(new TestCaseNode("normal result", case9));


        for (TestCaseNode testCaseNode: cases) {
            // 不同的测试用例
            Map<String, List<QuestionInfo>> map = new HashMap<>();
            List<QuantityNode> testCase = testCaseNode.getTestCase();
            for (QuantityNode node: testCase) {
                // 测试用例中的 题型+数量
                List<QuestionInfo> questionList = new ArrayList<>();
                for (int i = 0; i < node.getQuantity(); i++) {
                    QuestionInfo questionInfo = new QuestionInfo(node.getType(), 1);
                    questionList.add(questionInfo);
                }
                if (node.getQuantity() == -1) {
                    // 测试 questionList == null分支
                    map.put(node.getType(), null);
                    continue;
                }
                map.put(node.getType(), questionList);
            }
            data.add(new QuestionMapNode[] {new QuestionMapNode(testCaseNode.getExpected(), map)});
        }

        return data;
    }

    public CheckQuantityTest(QuestionMapNode node) {
        this.node = node;
    }

    static class QuantityNode {
        String type;
        int quantity;
        public QuantityNode(String type, int quantity) {
            this.type = type;
            this.quantity = quantity;
        }

        public String getType() {
            return type;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    static class QuestionMapNode {
        Map<String, List<QuestionInfo>> questionMap;
        String expectedResult;

        public QuestionMapNode(String expectedResult , Map<String, List<QuestionInfo>> questionMap) {
            this.expectedResult = expectedResult;
            this.questionMap = questionMap;
        }

        public Map<String, List<QuestionInfo>> getQuestionMap() {
            return questionMap;
        }

        public String getExpectedResult() {
            return expectedResult;
        }
    }

    static class TestCaseNode {
        List<QuantityNode> testCase;
        String expected;
        public TestCaseNode (String expected, List<QuantityNode> testCase) {
            this.expected = expected;
            this.testCase = testCase;
        }

        public List<QuantityNode> getTestCase() {
            return testCase;
        }

        public String getExpected() {
            return expected;
        }
    }
    @Test
    public void Test() {
        try {
            ControlUtil.checkQuestionQuantity(node.getQuestionMap());

            System.out.println("normal result");
            if (!node.getExpectedResult().equals("normal result")) {
                assert false;
            }
        } catch (WrongQuantityException e) {
            System.out.println(e.getDetails());
            if (!node.getExpectedResult().equals(e.getDetails())) {
                assert false;
            }
        }
    }
}
