package com.softtest.softtest.util.errCode.sub;

import com.softtest.softtest.util.errCode.ErrorCode;
import com.softtest.softtest.util.errCode.ErrorCodeException;

public class WrongLanguageException extends ErrorCodeException {
    public WrongLanguageException(String details) {
        super(ErrorCode.WRONG_LANGUAGE, details);
    }
}
