package com.softtest.softtest.service.impl;

import com.softtest.softtest.dao.UserMapper;
import com.softtest.softtest.entity.User;
import com.softtest.softtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
