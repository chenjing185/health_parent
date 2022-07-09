package com.itheima.service;

import com.itheima.entity.PageResult;
import com.itheima.pojo.CheckItem;

import java.util.List;

/**
 * 检查项服务接口
 */
public interface CheckItemService {

    void add(CheckItem checkItem);

    PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);

    void delete(Integer id);

    void edit(CheckItem checkItem);

    CheckItem findById(Integer id);

    List<CheckItem> findAll();
}