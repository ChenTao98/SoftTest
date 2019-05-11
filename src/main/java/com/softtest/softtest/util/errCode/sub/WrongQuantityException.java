package com.softtest.softtest.util.errCode.sub;

import com.softtest.softtest.util.errCode.ErrorCode;
import com.softtest.softtest.util.errCode.ErrorCodeException;

public class WrongQuantityException extends ErrorCodeException {
    /**
     * message 是详细信息，填的是哪种题型的数量不对。
     * */
    public WrongQuantityException(String details) {
        super(ErrorCode.WRONG_QUANTITY, details);
    }
}
