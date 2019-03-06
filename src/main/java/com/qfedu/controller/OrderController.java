package com.qfedu.controller;

import com.qfedu.content.JsonBean;
import com.qfedu.domain.McOrder;
import com.qfedu.service.OrderService;
import com.qfedu.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/order")
public class OrderController {

    JsonBean bean = new JsonBean();
    @Autowired
    private OrderService orderService;

    @RequestMapping("/addOrder.do")
    public JsonBean addOrder(McOrder order, HttpSession session) {

        try {
            orderService.addOrder(order, session);
            bean = JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }

        return bean;
    }
    @RequestMapping("/deleteOrder.do")
    public JsonBean deleteOrder(McOrder order,HttpSession session) {
        try {
            orderService.deleteOrder(order,session);
            bean = JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
}
