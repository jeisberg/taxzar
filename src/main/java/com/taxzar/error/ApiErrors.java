package com.taxzar.error;

import java.util.List;

public class ApiErrors {

    private List<ApiFieldError> _fieldErrors;
    private List<ApiGlobalError> _globalErrors;

    public ApiErrors(List<ApiFieldError> fieldErrors, List<ApiGlobalError> globalErrors) {

        _fieldErrors = fieldErrors;
        _globalErrors = globalErrors;
    }

    public List<ApiFieldError> getFieldErrors() {
        return _fieldErrors;
    }

    public void setFieldErrors(List<ApiFieldError> fieldErrors) {
        _fieldErrors = fieldErrors;
    }

    public List<ApiGlobalError> getGlobalErrors() {
        return _globalErrors;
    }

    public void setGlobalErrors(List<ApiGlobalError> globalErrors) {
        _globalErrors = globalErrors;
    }
}
