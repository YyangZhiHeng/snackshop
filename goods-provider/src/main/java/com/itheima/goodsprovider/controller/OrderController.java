package com.itheima.goodsprovider.controller;

import com.itheima.b2b.commonmodule.model.Userorder;
import com.itheima.goodsprovider.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname OrderController
 * @Description TODO
 * @Date 2019-10-23 9:32
 * @Created by CrazyStone
 */
@RestController
public class OrderController {
    @Autowired
    OrderDao orderDao;
    @RequestMapping(value = "/getAllorder",method = RequestMethod.GET)
    public List<Userorder> getAllorder(@RequestParam(value = "uid")int uid){
        return orderDao.getAllorder(uid);
    }
}
