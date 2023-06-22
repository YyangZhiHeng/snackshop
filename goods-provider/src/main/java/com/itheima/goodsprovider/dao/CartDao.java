package com.itheima.goodsprovider.dao;

import com.itheima.b2b.commonmodule.model.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname CartDao
 * @Description TODO
 * @Date 2019-10-23 9:31
 * @Created by CrazyStone
 */
@Mapper
public interface CartDao {

    int deleteCart(@Param(value = "gid") int gid);//根据ID删除订单
    int insertOrder(@Param(value = "goodsname")String goodsname,@Param(value = "number")int number,@Param(value = "price")int price,@Param(value = "uid")int uid);//购买商品后添加一条订单数据
}
