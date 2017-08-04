package com.taxzar.error;

public class ApiGlobalError {

    public ApiGlobalError(String code) {

        _code = code;
    }

    private String _code;

    public String getCode() {
        return _code;
    }

    public void setCode(String code) {
        _code = code;
    }
}
