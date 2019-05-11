package com.softtest.softtest.util.errCode;

public enum ErrorCode {
    SUCCESS(0, "成功"),

    // 组卷控制部分
    WRONG_QUANTITY(1, "题目数量不符合标准"),
    WRONG_SCORE(2, "题目分数不符合标准"),
    WRONG_DIFFICULTY(3, "题目难度不符合标准"),
    WRONG_LANGUAGE(4, "题目语言不符合标准"),
    BLACK_AUTHOR(5, "题目作者在黑名单中"),
    BEYOND_PROJECTS(6, "题目在制定项目范围外"),

    //其他
    WRONG_QUESTION_ID(7, "题目ID错误"),
    NO_SUCH_QUESTION(8, "题目不存在"),
    QUESTION_ALREADY_ADDED(9, "题目已经添加了"),
    QUESTION_ALREADY_DELETED(10, "题目已经删除了");
    private int errorCode;
    private String type;
    ErrorCode(int errorCode, String type) {
        this.errorCode = errorCode;
        this.type = type;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getType() {
        return type;
    }
}
