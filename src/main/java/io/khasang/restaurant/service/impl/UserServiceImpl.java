package io.khasang.restaurant.service.impl;

import io.khasang.restaurant.dao.UserDao;
import io.khasang.restaurant.entity.User;
import io.khasang.restaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User addUser(User user){
        return userDao.addUser(user);
    }

    @Override
    public List<User> getUserList() {
        return userDao.getList();
    }
}

