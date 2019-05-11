package com.softtest.softtest.util.errCode.sub;

import com.softtest.softtest.util.errCode.ErrorCode;
import com.softtest.softtest.util.errCode.ErrorCodeException;

public class QuestionAlreadyDeletedException extends ErrorCodeException {
    public QuestionAlreadyDeletedException(String details) {
        super(ErrorCode.QUESTION_ALREADY_DELETED, details);
    }
}
