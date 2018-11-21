package com.haiyi.service.impl;

import com.haiyi.dao.UserDao;
import com.haiyi.model.User;
import com.haiyi.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class IUserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}