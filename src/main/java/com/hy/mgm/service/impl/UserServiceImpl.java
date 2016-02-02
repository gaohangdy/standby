package com.hy.mgm.service.impl;

import com.hy.mgm.domain.User;
import com.hy.mgm.persistence.UserMapper;
import com.hy.mgm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User userToAdd) {
        return userMapper.addUser(userToAdd);
    }

    @Override
    public User getUser(String loginId) {
        return userMapper.getUser(loginId);
    }
}
