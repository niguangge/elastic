package com.USB.service;

import java.util.List;

import com.USB.entity.User;

public interface IUserService {

    List<User> queryAllUser() throws Exception;

    void deleteUser(Integer id) throws Exception;
}

