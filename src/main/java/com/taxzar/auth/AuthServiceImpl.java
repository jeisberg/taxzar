package com.taxzar.auth;

import com.google.common.base.Strings;
import com.taxzar.models.User;
import com.taxzar.repositories.UserRepository;
import com.taxzar.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository _userRepository;

    public User login(final String username, final String password) {

        User user = _userRepository.findUserByUsername(username);

        String hash = null;

        try {

            hash = Utils.MD5(password);

        } catch(NoSuchAlgorithmException e) {

            throw new RuntimeException(e.getMessage());
        }

        if(!Strings.isNullOrEmpty(hash)) {
            if(user.getPassword().equals(hash)) {
                return user;
            }
        }

        return null;
    }
}
