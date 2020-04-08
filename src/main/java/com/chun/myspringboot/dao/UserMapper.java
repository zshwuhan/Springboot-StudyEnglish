package com.chun.myspringboot.dao;

import com.chun.myspringboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {


    /**
     * 注册用户
     * @param user
     * @return
     */
    //增加用户--注册用户
    int addUser(User user);
    //根据激活码查询用户
    User queryUserByActiveCode(String activeCode);

    //根据账号密码和状态码(1)登录
    User loginByEmailAndPasswordAndActiveStatus(User user);

    /**
     * 操作用户
     * @param user
     * @return
     */

    //删除用户
    int deleteUser(User user);
    //修改用户
    int updeteUser(User user);

    //查询所有用户信息
     List<User> queryUserList();
     //根据Id查询用户
     User queryUserById(int userId);

}
