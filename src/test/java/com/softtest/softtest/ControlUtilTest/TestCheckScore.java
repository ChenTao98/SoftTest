package com.softtest.softtest.ControlUtilTest;

import com.softtest.softtest.entity.QuestionInfo;
import com.softtest.softtest.util.ControlUtil;
import com.softtest.softtest.util.errCode.sub.WrongScoreException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class TestCheckScore {
    private Map<String, List<QuestionInfo>> map;
    private ControlUtil controlUtil = new ControlUtil();

    @Before
    public void init() {
        map = new HashMap<>();
        map.put("单选题", initList("单选题", 5));
        map.put("多选题", initList("多选题", 5));
        map.put("填空题", initList("填空题", 4));
        map.put("情景题", initList("情景题", 2));
        map.put("视频题", initList("视频题", 2));
        map.put("问答题", initList("问答题", 2));
    }

    @Test
    public void testSomeQuestionNull() {
        map.replace("情景题", new ArrayList<>());
        map.remove("情景题");
        try {
            controlUtil.checkScore(map);
            fail();
        } catch (WrongScoreException e) {
            assertEquals("题型：情景题没有加入", e.getDetails());
        }
        init();
        map.remove("情景题");
        try {
            controlUtil.checkScore(map);
            fail();
        } catch (WrongScoreException e) {
            assertEquals("题型：情景题没有加入", e.getDetails());
        }
    }

    @Test
    public void testQuestionLessScore() {
        List<QuestionInfo> list = map.get("填空题");
        list.remove(0);
        try {
            controlUtil.checkScore(map);
            fail();
        } catch (WrongScoreException e) {
            assertEquals("题型：填空题分数小于最低分数", e.getDetails());
        }
    }

    @Test
    public void testQuestionMoreScore() {
        List<QuestionInfo> list = map.get("填空题");
        list.add(new QuestionInfo("填空题", 2));
        try {
            controlUtil.checkScore(map);
            fail();
        } catch (WrongScoreException e) {
            assertEquals("题型：填空题分数高于最高分数", e.getDetails());
        }
    }

    @Test
    public void testTotalLessScore() {
        List<QuestionInfo> list = map.get("单选题");
        list.remove(0);
        try {
            controlUtil.checkScore(map);
            fail();
        } catch (WrongScoreException e) {
            assertEquals("总分数过低", e.getDetails());
        }
    }

    @Test
    public void testTotalMoreScore() {
        List<QuestionInfo> list = map.get("填空题");
        list.add(new QuestionInfo("填空题", 1));
        try {
            controlUtil.checkScore(map);
            fail();
        } catch (WrongScoreException e) {
            assertEquals("总分数过高", e.getDetails());
        }
    }

    @Test
    public void testTotalScoreRight() {
        try {
            controlUtil.checkScore(map);
            assertTrue(true);
        } catch (WrongScoreException e) {
            fail();
        }
    }

    private List<QuestionInfo> initList(String type, int score) {
        List<QuestionInfo> result = new ArrayList<>();
        for (int i = 0; i < score; i++) {
            result.add(new QuestionInfo(type, 1));
        }
        return result;
    }
}
