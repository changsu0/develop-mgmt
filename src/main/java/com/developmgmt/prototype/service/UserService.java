package com.developmgmt.prototype.service;

import com.developmgmt.prototype.mapper.UsersMapper;
import com.developmgmt.prototype.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    UsersMapper usersMapper;

    public List<Users> getAllUsers(Users users){
        return usersMapper.selectAllUsers(users);
    }
}
