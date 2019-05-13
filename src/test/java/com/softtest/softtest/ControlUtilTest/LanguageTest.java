package com.softtest.softtest.ControlUtilTest;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.softtest.softtest.entity.QuestionInfo;
import com.softtest.softtest.util.errCode.sub.WrongDifficultyException;
import com.softtest.softtest.util.errCode.sub.WrongLanguageException;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

import com.softtest.softtest.util.ControlUtil;

import static org.junit.Assert.assertEquals;

/**
 * @author : ChenLeiyuan
 * @version : 1.0.0
 * @date : 2019-05-13 15:00
 **/

public class LanguageTest {
    //1.测试语言只含中文
    @Test
    public void Test1(){
        List<QuestionInfo> list=new ArrayList<>();
        QuestionInfo t1=new QuestionInfo("p1","中文");
        list.add(t1);
        QuestionInfo t2=new QuestionInfo("p2","中文");
        list.add(t2);
        QuestionInfo t3=new QuestionInfo("p3","中文");
        list.add(t3);
        Map<String, List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list);
        try {
            ControlUtil.checkLanguage(map);
        }catch (WrongLanguageException e) {
            e.printStackTrace();
        }

}
    //2.包含中文和英文
    @Test
    public void Test2(){
        List<QuestionInfo> list=new ArrayList<>();
        QuestionInfo t1=new QuestionInfo("p1","中文");
        list.add(t1);
        QuestionInfo t2=new QuestionInfo("p2","英文");
        list.add(t2);
        QuestionInfo t3=new QuestionInfo("p3","英文");
        list.add(t3);
        Map<String, List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list);
        try {
            ControlUtil.checkLanguage(map);
        }catch (WrongLanguageException e) {
            e.printStackTrace();
        }
    }
    //包含中文英文法文
    @Test
    public void Test3(){
        List<QuestionInfo> list=new ArrayList<>();
        QuestionInfo t1=new QuestionInfo("p1","中文");
        list.add(t1);
        QuestionInfo t2=new QuestionInfo("p2","英文");
        list.add(t2);
        QuestionInfo t3=new QuestionInfo("p3","法文");
        list.add(t3);
        Map<String, List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list);
        try {
            ControlUtil.checkLanguage(map);
        }catch (WrongLanguageException e) {
            assertEquals(e.getDetails(),"有三种或三种以上语言");
            e.printStackTrace();
        }
    }
    //包含英文和法文
    @Test
    public void Test4(){
        List<QuestionInfo> list=new ArrayList<>();
        QuestionInfo t1=new QuestionInfo("p1","英文");
        list.add(t1);
        QuestionInfo t2=new QuestionInfo("p2","英文");
        list.add(t2);
        QuestionInfo t3=new QuestionInfo("p3","法文");
        list.add(t3);
        Map<String, List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list);
        try {
            ControlUtil.checkLanguage(map);
        }catch (WrongLanguageException e) {
            assertEquals(e.getDetails(),"有两种语言且不含中文");
            e.printStackTrace();
        }
    }
    //包含多种题型 只有中文
    @Test
    public void Test5(){
        List<QuestionInfo> list1 = new ArrayList<>();
        List<QuestionInfo> list2 = new ArrayList<>();
        QuestionInfo t1=new QuestionInfo("p1","中文");
        list1.add(t1);
        QuestionInfo t2=new QuestionInfo("p2","中文");
        list1.add(t2);
        QuestionInfo t3=new QuestionInfo("p3","中文");
        list2.add(t3);
        Map<String, List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list1);
        map.put("多选题",list2);
        try {
            ControlUtil.checkLanguage(map);
        }catch (WrongLanguageException e) {
            e.printStackTrace();
        }

    }
    //包含多种题型，含中文英文
    @Test
    public void Test6(){
        List<QuestionInfo> list1 = new ArrayList<>();
        List<QuestionInfo> list2 = new ArrayList<>();
        QuestionInfo t1=new QuestionInfo("p1","中文");
        list1.add(t1);
        QuestionInfo t2=new QuestionInfo("p2","中文");
        list1.add(t2);
        QuestionInfo t3=new QuestionInfo("p3","英文");
        list2.add(t3);
        Map<String, List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list1);
        map.put("多选题",list2);
        try {
            ControlUtil.checkLanguage(map);
        }catch (WrongLanguageException e) {
            e.printStackTrace();
        }

    }
    //7包含多种题型 有中文 英文法文
    @Test
    public void Test7(){
        List<QuestionInfo> list1 = new ArrayList<>();
        List<QuestionInfo> list2 = new ArrayList<>();
        QuestionInfo t1=new QuestionInfo("p1","中文");
        list1.add(t1);
        QuestionInfo t2=new QuestionInfo("p2","法文");
        list1.add(t2);
        QuestionInfo t3=new QuestionInfo("p3","英文");
        list2.add(t3);
        Map<String, List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list1);
        map.put("多选题",list2);
        try {
            ControlUtil.checkLanguage(map);
        }catch (WrongLanguageException e) {
            assertEquals(e.getDetails(),"有三种或三种以上语言");
            e.printStackTrace();
        }

    }
    //包含多种题型 有英文和法文
    @Test
    public void Test8(){
        List<QuestionInfo> list1 = new ArrayList<>();
        List<QuestionInfo> list2 = new ArrayList<>();
        QuestionInfo t1=new QuestionInfo("p1","法文");
        list1.add(t1);
        QuestionInfo t2=new QuestionInfo("p2","法文");
        list1.add(t2);
        QuestionInfo t3=new QuestionInfo("p3","英文");
        list2.add(t3);
        Map<String, List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list1);
        map.put("多选题",list2);
        try {
            ControlUtil.checkLanguage(map);
        }catch (WrongLanguageException e) {
            assertEquals(e.getDetails(),"有两种语言且不含中文");
            e.printStackTrace();
        }
    }
    //测试包含法语和葡萄牙语
    @Test
    public void Test9(){
        List<QuestionInfo> list=new ArrayList<>();
        QuestionInfo t1=new QuestionInfo("p1","法语");
        list.add(t1);
        QuestionInfo t2=new QuestionInfo("p2","法语");
        list.add(t2);
        QuestionInfo t3=new QuestionInfo("p3","葡萄牙语");
        list.add(t3);
        Map<String, List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list);
        try {
            ControlUtil.checkLanguage(map);
        }catch (WrongLanguageException e) {
            assertEquals(e.getDetails(),"有两种语言且不含中文");
            e.printStackTrace();
        }
    }
    //只包含西班牙语
    @Test
    public void Test10(){
        List<QuestionInfo> list=new ArrayList<>();
        QuestionInfo t1=new QuestionInfo("p1","西班牙语");
        list.add(t1);
        QuestionInfo t2=new QuestionInfo("p2","西班牙语");
        list.add(t2);
        QuestionInfo t3=new QuestionInfo("p3","西班牙语");
        list.add(t3);
        Map<String, List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list);
        try {
            ControlUtil.checkLanguage(map);
        }catch (WrongLanguageException e) {
            e.printStackTrace();
        }
    }

}
