package com.taxzar.auth;

import com.taxzar.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("/api/auth")
@RestController
public class AuthController {

    @Autowired
    private AuthService _authService;

    @RequestMapping(
            value = { "/login" },
            method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public ResponseEntity<User> login(@Valid AuthForm authForm) {

        User user = _authService.login(
                authForm.getUsername(), authForm.getPassword());

        HttpStatus status = HttpStatus.OK;

        if(user == null) {
            status = HttpStatus.NOT_FOUND;
        }

        return new ResponseEntity(user, status);
    }
}
