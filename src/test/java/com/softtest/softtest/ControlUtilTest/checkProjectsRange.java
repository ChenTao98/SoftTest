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
        map.put("单选题", initList("测试技术"));
        map.put("情景题", initList("test02"));
        map.put("图像题", initList("2234"));
        noMap.put("单选题", initList("22"));
        noMap.put("情景题", initList("33"));
        noMap.put("图像题", initList("223"));

    }

    @Test
    public void testExist() {
        try {
            controlUtil.checkProjectsRange(map, projectName);
        } catch (BeyondProjectsException e) {
            fail();
        }
    }


    @Test
    public void testNoExist() {

        try {
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
