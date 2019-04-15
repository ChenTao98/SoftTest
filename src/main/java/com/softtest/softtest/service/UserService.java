package com.softtest.softtest.service;

import com.softtest.softtest.entity.User;

public interface UserService {
    User selectByPrimaryKey(Integer id);
}
