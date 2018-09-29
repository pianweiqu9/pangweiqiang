package com.qfedu.service.impl;

import com.qfedu.domain.User;
import com.qfedu.mapper.UserMapper;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public User login(String username, String pwd) {
        User user = mapper.selectByName(username);
        if (null != user && Objects.equals(pwd,user.getPwd())) {
            return user;
        }
        return null;
    }

    @Override
    public boolean register(User user) {
        return mapper.insert(user)>0;
    }

    @Override
    public boolean checkName(String username) {
        User user = mapper.selectByName(username);
        if (null == user) {
            return true;
        }
         return false;
    }


}
