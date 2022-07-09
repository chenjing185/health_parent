package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.Setmeal;

import java.util.Map;

public interface SetmealDao {

    void add(Setmeal setmeal);

    void setSetmealAndCheckGroup(Map<String, Integer> map);

    Page<Setmeal> selectByCondition(String queryString);
}