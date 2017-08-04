package com.taxzar.auth;

import com.taxzar.models.User;
import org.springframework.stereotype.Service;

public interface AuthService {

    User login(final String username, final String password);
}
