package com.hwTwenty.service;

import com.hwTwenty.base.BaseService;
import com.hwTwenty.domain.User;
import com.hwTwenty.enumiration.Gender;

public interface UserService extends BaseService<User> {
    boolean existsByUsername(String username);

    User findByUsername(String username);

    User signup(String firstname, String lastname, String username, String password, Gender gender);

    User login(String username, String password);

}