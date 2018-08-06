package com.hang.dao;

import com.hang.bean.bean.tb_order_shipping;

public interface tb_order_shippingMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(tb_order_shipping record);

    int insertSelective(tb_order_shipping record);

    tb_order_shipping selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(tb_order_shipping record);

    int updateByPrimaryKey(tb_order_shipping record);
}