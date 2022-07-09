package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckItem;

/**
 * 持久层Dao接口
 */
public interface CheckItemDao {

    void add(CheckItem checkItem);

    Page<CheckItem> selectByCondition(String queryString);

    void deleteById(Integer id);

    long findCountByCheckItemId(Integer checkItemId);

    void edit(CheckItem checkItem);

    CheckItem findById(Integer id);

}
