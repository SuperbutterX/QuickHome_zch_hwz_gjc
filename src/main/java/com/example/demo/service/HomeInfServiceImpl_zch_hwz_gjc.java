package com.example.demo.service;

import com.example.demo.dao.HomeInformationDao_zch_hwz_gjc;
import com.example.demo.entity.HomeInformation_zch_hwz_gjc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("homeInfServ")
public class HomeInfServiceImpl_zch_hwz_gjc implements HomeInfService_zch_hwz_gjc {
    @Autowired
    HomeInformationDao_zch_hwz_gjc homeInfDao_zch_hwz_gjc;

    @Override
    public List<HomeInformation_zch_hwz_gjc> getAllHomeInformation_zch_hwz_gjc() {
        return homeInfDao_zch_hwz_gjc.getAllHomeInformation_zch_hwz_gjc();
    }
}
