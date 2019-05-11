package com.softtest.softtest.util.errCode.sub;

import com.softtest.softtest.util.errCode.ErrorCode;
import com.softtest.softtest.util.errCode.ErrorCodeException;

public class WrongDifficultyException extends ErrorCodeException {
    public WrongDifficultyException(String details) {
        super(ErrorCode.WRONG_DIFFICULTY, details);
    }
}
