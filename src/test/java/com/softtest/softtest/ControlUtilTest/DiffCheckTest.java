package com.softtest.softtest.ControlUtilTest;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.softtest.softtest.entity.QuestionInfo;
import com.softtest.softtest.util.errCode.sub.WrongDifficultyException;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.softtest.softtest.util.ControlUtil;

import static org.junit.Assert.assertEquals;

/**
 * @author : wqruan
 * @version : 1.0.0
 * @date : 2019-05-12 19:58
 **/

public class DiffCheckTest {
    //测试单选题难度大于3
    @Test
    public void Test1(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","单选题","a","1",4,4,"as","12","as");
        list.add(t1);
        Map<String, List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"单选题难度不在范围内");
            return;
        }
        assertEquals("as","qw");
    }
    //测试正常的单选题难度
    @Test
    public void Test2(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","单选题","a","1",2,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (Exception e){
            assertEquals("as","qw");
        }
    }
    //测试单选题难度小于2
    @Test
    public void Test3(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","单选题","a","1",1,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"单选题难度不在范围内");
            return;
        }
        assertEquals("as","qw");
    }
    //测试多选题难度小于2
    @Test
    public void Test4(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","多选题","a","1",1,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("多选题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"多选题难度不在范围内");
            return;
        }
        assertEquals("as","qw");
    }
    //测试多选题难度大于3
    @Test
    public void Test5(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","多选题","a","1",4,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("多选题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"多选题难度不在范围内");
            return;
        }
        assertEquals("as","qw");
    }
    //测试正常的多选题难度
    @Test
    public void Test6(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","多选题","a","1",2,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("多选题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals("as","qw");
            return;
        }

    }
    //测试填空题难度小于2
    @Test
    public void Test7(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","填空题","a","1",1,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("填空题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"填空题难度不在范围内");
            return;
        }
        assertEquals("as","qw");
    }
    //测试填空题难度大于3
    @Test
    public void Test8(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","填空题","a","1",4,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("填空题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"填空题难度不在范围内");
            return;
        }
        assertEquals("as","qw");
    }
    //测试正常的填空题难度
    @Test
    public void Test9(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","填空题","a","1",2,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("填空题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"填空题难度不在范围内");
            assertEquals("as","qw");
        }
    }
    //测试情景题难度小于2
    @Test
    public void Test10(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","情景题","a","1",1,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("情景题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"情景题难度不在范围内");
            return;
        }
        assertEquals("as","qw");
    }
    //测试情景题难度大于3
    @Test
    public void Test11(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","情景题","a","1",4,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("情景题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"情景题难度不在范围内");
            return;
        }
        assertEquals("as","qw");
    }
    //测试正常的情景题难度
    @Test
    public void Test12(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","情景题","a","1",2,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("情景题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"情景题难度不在范围内");
            assertEquals("as","qw");
        }
    }
    //测试视频题难度小于2
    @Test
    public void Test13(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","视频题","a","1",1,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("视频题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"视频题难度不在范围内");
            return;
        }
        assertEquals("as","qw");
    }
    //测试视频题难度大于3
    @Test
    public void Test14(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","视频题","a","1",4,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("视频题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"视频题难度不在范围内");
            return;
        }
        assertEquals("as","qw");
    }
    //测试正常的视频题难度
    @Test
    public void Test15(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","视频题","a","1",2,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("视频题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"视频题难度不在范围内");
            assertEquals("as","qw");
        }
    }
    //测试问答题难度小于2
    @Test
    public void Test16(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","问答题","a","1",1,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("单选题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"问答题难度不在范围内");
            return;
        }
        assertEquals("as","qw");
    }
    //测试问答题难度大于3
    @Test
    public void Test17(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","问答题","a","1",4,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("问答题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"问答题难度不在范围内");
            return;
        }
        assertEquals("as","qw");
    }
    //测试正常的问答题难度
    @Test
    public void Test18(){
        List<QuestionInfo> list=new LinkedList<>();
        QuestionInfo t1=new QuestionInfo(1,"test1","问答题","a","1",2,4,"as","12","as");
        list.add(t1);
        Map<String , List<QuestionInfo>> map=new HashMap<>();
        map.put("问答题",list);
        try {
            ControlUtil.checkDifficulty(map);
        }catch (WrongDifficultyException e){
            assertEquals(e.getDetails(),"问答题难度不在范围内");
            assertEquals("as","qw");
        }
    }
}
