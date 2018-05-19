package com.USB.mapper;

import java.util.List;

import com.USB.entity.User;

public interface IUserMapper {

    List<User> queryAllUser() throws Exception;

    void deleteUser(Integer id) throws Exception;
}