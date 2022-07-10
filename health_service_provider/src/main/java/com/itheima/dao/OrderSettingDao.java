package com.itheima.dao;

import com.itheima.pojo.OrderSetting;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OrderSettingDao {

    void add(OrderSetting orderSetting);

    void editNumberByOrderDate(OrderSetting orderSetting);

    long findCountByOrderDate(Date orderDate);

    List<OrderSetting> getOrderSettingByMonth(Map date);

}