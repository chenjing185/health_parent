package com.itheima.dao;

import com.itheima.pojo.CheckGroup;

import java.util.Map;

/**
 * 持久层Dao接口
 */
public interface CheckGroupDao {
    void add(CheckGroup checkGroup);
    void setCheckGroupAndCheckItem(Map map);
}