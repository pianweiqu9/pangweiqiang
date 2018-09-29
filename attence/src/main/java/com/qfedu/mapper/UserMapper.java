package com.qfedu.mapper;

import com.qfedu.domain.User;

public interface UserMapper {

    int deleteById(Integer id);

    int insert(User record);

    User selectById(Integer id);

    User selectByName(String username);

}