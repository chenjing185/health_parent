package com.itheima.service;

import com.itheima.pojo.Setmeal;

/**
 * 体检套餐服务接口
 */
public interface SetmealService {
    public void add(Setmeal setmeal, Integer[] checkgroupIds);
}