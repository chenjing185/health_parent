package com.itheima.service;

import com.itheima.pojo.CheckGroup;

/**
 * 检查组服务接口
 */
public interface CheckGroupService {
    void add(CheckGroup checkGroup, Integer[] checkitemIds);
}