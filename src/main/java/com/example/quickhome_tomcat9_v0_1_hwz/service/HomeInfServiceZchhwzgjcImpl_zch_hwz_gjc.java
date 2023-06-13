package com.example.quickhome_tomcat9_v0_1_hwz.service;

import com.example.quickhome_tomcat9_v0_1_hwz.dao.HomeInformationDao_zch_hwz_gjc;
import com.example.quickhome_tomcat9_v0_1_hwz.entity.HomeInformation_zch_hwz_gjc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("homeInfServ")
public class HomeInfServiceZchhwzgjcImpl_zch_hwz_gjc implements HomeInfService_zch_hwz_gjc {
    @Qualifier("homeInformationDao_zch_hwz_gjc")
    @Autowired
    HomeInformationDao_zch_hwz_gjc homeInfDao_zch_hwz_gjc;

    @Override
    public List<HomeInformation_zch_hwz_gjc> getAllHomeInformation_zch_hwz_gjc() {
        return homeInfDao_zch_hwz_gjc.getAllHomeInformation_zch_hwz_gjc();
    }
}
