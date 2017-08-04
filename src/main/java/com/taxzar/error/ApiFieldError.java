package com.taxzar.error;

public class ApiFieldError {

    private String _field;
    private String _code;
    private String _message;
    private Object _rejectedValue;

    public ApiFieldError(String field, String code, String message, Object rejectedValue) {

        _field = field;
        _code = code;
        _message = message;
        _rejectedValue = rejectedValue;
    }

    public String getField() {
        return _field;
    }

    public void setField(String field) {
        _field = field;
    }

    public String getCode() {
        return _code;
    }

    public void setCode(String code) {
        _code = code;
    }

    public String getMessage() {
        return _message;
    }

    public void setMessage(String message) {
        this._message = message;
    }

    public Object getRejectedValue() {
        return _rejectedValue;
    }

    public void setRejectedValue(Object rejectedValue) {
        _rejectedValue = rejectedValue;
    }
}
