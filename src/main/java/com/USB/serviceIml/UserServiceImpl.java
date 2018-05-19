package com.USB.serviceIml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.USB.entity.User;
import com.USB.mapper.IUserMapper;
import com.USB.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserMapper mapper;

    @Override
    public List<User> queryAllUser() throws Exception {
        return mapper.queryAllUser();
    }

    @Override
    public void deleteUser(Integer id) throws Exception {
        mapper.deleteUser(id);
    }

}