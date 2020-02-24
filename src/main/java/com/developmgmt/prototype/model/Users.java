package com.developmgmt.prototype.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Repository;

@Data
@Alias("users")
@Repository
public class Users {

    private Long id;

    private String userId;

    private String userName;

    private String userPw;
}
