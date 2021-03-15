package cn.itcast.jedis.dao;

import cn.itcast.jedis.domain.Province;

import java.util.List;

public interface ProvinceDao {
    public List<Province> findAll();
}
