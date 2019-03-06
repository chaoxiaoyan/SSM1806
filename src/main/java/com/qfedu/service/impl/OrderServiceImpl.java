package com.qfedu.service.impl;

import com.qfedu.dao.McOrderMapper;
import com.qfedu.domain.McOrder;
import com.qfedu.domain.McUser;
import com.qfedu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private McOrderMapper orderDao;

    @Override
    public void addOrder(McOrder order, HttpSession session) {
        McUser user = (McUser) session.getAttribute("user");
        if (user == null) {
            throw  new RuntimeException("您还未登录，请登录");
        }
        McOrder mcOrder = orderDao.findByUidAndKid(user.getuId(), order.getoKId());
        if (mcOrder != null) {
            throw  new RuntimeException("您已经选择了这个道菜，请选择其他的");
        }
        order.setoUId(user.getuId());
        orderDao.insertSelective(order);
    }

    @Override
    public void deleteOrder(McOrder order, HttpSession session) {
        McUser user = (McUser) session.getAttribute("user");
        orderDao.deleteByUidAndKid(user.getuId(),order.getoKId());
    }
}
