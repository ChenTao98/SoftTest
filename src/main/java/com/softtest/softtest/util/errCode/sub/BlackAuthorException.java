package com.softtest.softtest.util.errCode.sub;

import com.softtest.softtest.util.errCode.ErrorCode;
import com.softtest.softtest.util.errCode.ErrorCodeException;

public class BlackAuthorException extends ErrorCodeException {
    public BlackAuthorException(String details) {
        super(ErrorCode.BLACK_AUTHOR, details);
    }
}
