package com.example.quickhome_tomcat9_v0_1_hwz.dao;

import com.example.quickhome_tomcat9_v0_1_hwz.entity.HomeInformation_zch_hwz_gjc;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("HomeInfDao")
@Mapper
public interface HomeInformationDao_zch_hwz_gjc {
    public List<HomeInformation_zch_hwz_gjc> getAllHomeInformation_zch_hwz_gjc();
}
