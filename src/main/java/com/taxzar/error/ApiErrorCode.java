package com.taxzar.error;

public enum ApiErrorCode {

    VALIDATION("validation");

    private String _code;

    ApiErrorCode(String code) {
        _code = code;
    }

    public String getCode() {
        return _code;
    }
}
