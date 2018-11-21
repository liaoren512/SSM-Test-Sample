package com.haiyi.dao;


import com.haiyi.model.User;
import javax.annotation.Resource;

public interface UserDao {

    User selectUser(long id);

}