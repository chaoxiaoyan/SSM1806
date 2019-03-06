package com.qfedu.service;

import com.qfedu.domain.McOrder;

import javax.servlet.http.HttpSession;

public interface OrderService {

    public void addOrder(McOrder order, HttpSession session);

    public void  deleteOrder(McOrder order, HttpSession session);
}
