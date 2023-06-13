package com.example.demo.controller;

import com.example.demo.entity.HomeInformation_zch_hwz_gjc;
import com.example.demo.entity.Order_zch_hwz_gjc;
import com.example.demo.service.HomeInfService_zch_hwz_gjc;
import com.example.demo.service.OrderService_zch_hwz_gjc;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

@Controller("HomeInfCon")
@RequestMapping("/homeInf")
public class OrderController_zch_hwz_gjc {
    @Autowired
    OrderService_zch_hwz_gjc orderService_zch_hwz_gjc;
    static final Log Logger = LogFactory.getLog(HomeInformationController_zch_hwz_gjc.class);

    @RequestMapping("/getAllHomeInf")
    public String addOrder_zch_hwz_gjc(@ModelAttribute Order_zch_hwz_gjc order_zch_hwz_gjc, HttpServletRequest req) {
        int min_zch_hwz_gjc = 100000;
        int max_zch_hwz_gjc = 999999;
        Random random_zch_hwz_gjc = new Random();
        int DynamicDoorPassword_zch_hwz_gjc = random_zch_hwz_gjc.nextInt(max_zch_hwz_gjc - min_zch_hwz_gjc + 1) + min_zch_hwz_gjc;
        order_zch_hwz_gjc.setDynamicDoorPassword_zch_hwz_gjc(String.valueOf(DynamicDoorPassword_zch_hwz_gjc));
        LocalDateTime now_zch_hwz_gjc = LocalDateTime.now();
        DateTimeFormatter formatter_zch_hwz_gjc = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String creationTime_zch_hwz_gjc = now_zch_hwz_gjc.format(formatter_zch_hwz_gjc);
        order_zch_hwz_gjc.setCreationTime_zch_hwz_gjc(creationTime_zch_hwz_gjc);
        int x_zch_hwz_gjc = orderService_zch_hwz_gjc.addOrder_zch_hwz_gjc(order_zch_hwz_gjc);
        System.out.println("成功添加了" + x_zch_hwz_gjc + "条订单");
        return "/页面";
    }
}
