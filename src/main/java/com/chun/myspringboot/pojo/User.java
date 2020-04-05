package com.chun.myspringboot.pojo;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String userName;
    private String password;
    private String email;
    private String activeCode;
    private int activeStatus;
}
