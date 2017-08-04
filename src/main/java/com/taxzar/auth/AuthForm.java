package com.taxzar.auth;

import com.google.gson.GsonBuilder;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;


public class AuthForm {

    @NotBlank(message = "username is required")
    private String username;

    @NotBlank(message = "password is required")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return new GsonBuilder().serializeNulls().create().toJson(this);
    }
}
