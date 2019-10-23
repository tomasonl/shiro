package com.mmall.demo.mapper;


import com.mmall.demo.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper{

    User findByUsername(@Param("username") String username);

}
