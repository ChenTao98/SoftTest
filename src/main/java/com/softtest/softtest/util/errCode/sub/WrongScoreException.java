package com.softtest.softtest.util.errCode.sub;

import com.softtest.softtest.util.errCode.ErrorCode;
import com.softtest.softtest.util.errCode.ErrorCodeException;

public class WrongScoreException extends ErrorCodeException {
    public WrongScoreException(String message) {
        super(ErrorCode.WRONG_SCORE, message);
    }
}
