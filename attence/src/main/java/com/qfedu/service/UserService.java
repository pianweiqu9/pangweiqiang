package com.qfedu.service;

import com.qfedu.domain.User;

public interface UserService {
    User login(String username,String pwd);

    boolean register(User user);

    boolean checkName(String username);
}
