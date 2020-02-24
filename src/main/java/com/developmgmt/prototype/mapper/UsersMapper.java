package com.developmgmt.prototype.mapper;

import com.developmgmt.prototype.model.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {
    List<Users> selectAllUsers(Users users);
}
