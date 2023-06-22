package com.itheima.userprovider.dao;


import com.itheima.b2b.commonmodule.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
     User login(@Param(value = "uname") String uname);//用户登录接口
    int register(@Param(value = "upassword")String upassword,@Param(value = "uname")String uname,@Param(value = "usex") String usex);//用户注册接口
}
