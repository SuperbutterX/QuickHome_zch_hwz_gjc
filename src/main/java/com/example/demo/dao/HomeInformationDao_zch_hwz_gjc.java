package com.example.demo.dao;

import com.example.demo.entity.HomeInformation_zch_hwz_gjc;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("HomeInfDao")
@Mapper
public interface HomeInformationDao_zch_hwz_gjc {
    public List<HomeInformation_zch_hwz_gjc> getAllHomeInformation_zch_hwz_gjc();
}
