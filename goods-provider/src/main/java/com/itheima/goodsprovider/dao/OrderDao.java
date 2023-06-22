package com.itheima.goodsprovider.dao;

import com.itheima.b2b.commonmodule.model.Userorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname OrderDao
 * @Description TODO
 * @Date 2019-10-23 9:31
 * @Created by CrazyStone
 */
@Mapper
public interface OrderDao {
    List<Userorder> getAllorder(@Param(value = "uid")int uid);//查询所有订单
}
