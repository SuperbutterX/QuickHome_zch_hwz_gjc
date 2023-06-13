package com.example.demo.service;

import com.example.demo.dao.HomeInformationDao_zch_hwz_gjc;
import com.example.demo.dao.OrderDao_zch_hwz_gjc;
import com.example.demo.entity.Order_zch_hwz_gjc;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl_zch_hwz_gjc implements OrderService_zch_hwz_gjc {
    @Autowired
    OrderDao_zch_hwz_gjc orderDao_zch_hwz_gjc;

    @Override
    public int addOrder_zch_hwz_gjc(Order_zch_hwz_gjc order_zch_hwz_gjc) {
        return orderDao_zch_hwz_gjc.addOrder_zch_hwz_gjc(order_zch_hwz_gjc);
    }
}
