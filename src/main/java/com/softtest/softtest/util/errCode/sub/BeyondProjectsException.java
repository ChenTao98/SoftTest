package com.softtest.softtest.util.errCode.sub;

import com.softtest.softtest.util.errCode.ErrorCode;
import com.softtest.softtest.util.errCode.ErrorCodeException;

public class BeyondProjectsException extends ErrorCodeException {
    public BeyondProjectsException(String details) {
        super(ErrorCode.BEYOND_PROJECTS, details);
    }
}
