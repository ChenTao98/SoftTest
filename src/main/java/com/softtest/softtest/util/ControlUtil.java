package com.softtest.softtest.util;

import com.softtest.softtest.entity.QuestionInfo;
import com.softtest.softtest.util.errCode.sub.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ControlUtil {
    /**
     * 总的原则是通过检测，正常返回，
     * 不通过，抛出异常。
     */


    // 题目数量控制：题目的总数量多少个，可以有一定范围，不同类型的题目数量各应该有多少个。
    // 总数量：20 到 22题，20到20分
    // 单选题： 4到5题， 4到5分
    // 多选题： 4到5题， 4到5分
    // 填空题： 4到5题， 4到5分
    // 情景题： 2到3题， 2到3分
    // 视频题： 2到3题， 2到3分
    // 问答题： 2到3题， 2到3分
    // 谢东方
    public void checkQuestionQuantity(Map<String, List<QuestionInfo>> map) throws WrongQuantityException {

    }


    // 分数控制：试卷的总分应该在哪个范围内，不同类型的题目总分需要在一定范围内。
    // 由于所有题目都是一分的，所以暂时先定成这样。
    // 总数量：20 到 22题，20到20分
    // 单选题： 4到5题， 4到5分
    // 多选题： 4到5题， 4到5分
    // 填空题： 4到5题， 4到5分
    // 情景题： 2到3题， 2到3分
    // 视频题： 2到3题， 2到3分
    // 问答题： 2到3题， 2到3分
    // 陈涛
    public void checkScore(Map<String, List<QuestionInfo>> map) throws WrongScoreException {
        int total = 0;
        ArrayList<QuestionNode> arrayList = new ArrayList<>();
        arrayList.add(new QuestionNode("单选题", 4, 5));
        arrayList.add(new QuestionNode("多选题", 4, 5));
        arrayList.add(new QuestionNode("填空题", 4, 5));
        arrayList.add(new QuestionNode("情景题", 2, 3));
        arrayList.add(new QuestionNode("视频题", 2, 3));
        arrayList.add(new QuestionNode("问答题", 2, 3));
        for (QuestionNode questionNode : arrayList) {
            int tempScore = 0;
            List<QuestionInfo> list = map.get(questionNode.type);
            if (list == null || list.size() == 0) {
                throw new WrongScoreException("题型：" + questionNode.type + "没有加入");
            }
            for (QuestionInfo questionInfo : list) {
                tempScore += questionInfo.getScore();
            }
            if (tempScore < questionNode.minScore) {
                throw new WrongScoreException("题型：" + questionNode.type + "分数小于最低分数");
            } else if (tempScore > questionNode.maxScore) {
                throw new WrongScoreException("题型：" + questionNode.type + "分数高于最高分数");
            }
            total += tempScore;
        }
        if (total < 20) {
            throw new WrongScoreException("总分数过低");
        } else if (total > 20) {
            throw new WrongScoreException("总分数过高");
        }
    }

    // 难度控制：总平均难度不能超过一定数值，另外，不同类型的题目平均难度不同，例如选择题平均难度可以低一点，视频题的难度可以高一点这样。
    // 总难度：2到3
    // 单选题：2到3
    // 多选题：2到3
    // 填空题：2到3
    // 情景题：2到3
    // 视频题：2到3
    // 问答题：2到3
    // 阮雯强
    public void checkDifficulty(Map<String, List<QuestionInfo>> map) throws WrongDifficultyException {

    }

    // 语言控制：试卷的语言可以出现，中文+英文，中文+法文，中文，法文。规则：只能出现一种语言或者两种语言，当出现两种语言时，必须为中文+其他语言，
    //          不能出现三种以上的语言。
    // 陈雷远
    public void checkLanguage(Map<String, List<QuestionInfo>> map) throws WrongLanguageException {

    }


    // 作者黑名单功能：指定作者黑名单，当出现黑名单中的作者时，应该报错提醒。
    // 张健
    public void checkBlackAuthor(Map<String, List<QuestionInfo>> map, List<String> blackAuthorList) throws BlackAuthorException {

    }

    // 项目控制功能： 指定项目范围，出现的题目必须包含在指定的项目之内。
    // 汤启顺
    public void checkProjectsRange(Map<String, List<QuestionInfo>> map, List<String> projectsList) throws BeyondProjectsException {

    }

    class QuestionNode {
        private String type;
        private int minScore;
        private int maxScore;

        QuestionNode(String type, int minScore, int maxScore) {
            this.type = type;
            this.maxScore = maxScore;
            this.minScore = minScore;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getMaxScore() {
            return maxScore;
        }

        public void setMaxScore(int maxScore) {
            this.maxScore = maxScore;
        }

        public int getMinScore() {
            return minScore;
        }

        public void setMinScore(int minScore) {
            this.minScore = minScore;
        }
    }
}
