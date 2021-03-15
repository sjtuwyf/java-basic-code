package cn.itcast.jedis.service;

import cn.itcast.jedis.domain.Province;

import java.util.List;

public interface ProvinceService {

    public List<Province> findAll();

    public String findAllJson();
}
