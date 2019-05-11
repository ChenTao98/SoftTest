package com.softtest.softtest.util.errCode.sub;

import com.softtest.softtest.util.errCode.ErrorCode;
import com.softtest.softtest.util.errCode.ErrorCodeException;

public class QuestionAlreadyAddedException extends ErrorCodeException {
    public QuestionAlreadyAddedException(String details) {
        super(ErrorCode.QUESTION_ALREADY_ADDED, details);
    }
}
