package com.hang.dao;

import com.hang.bean.Tb_Order_Shipping;

public interface Tb_Order_ShippingMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Tb_Order_Shipping record);

    int insertSelective(Tb_Order_Shipping record);

    Tb_Order_Shipping selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Tb_Order_Shipping record);

    int updateByPrimaryKey(Tb_Order_Shipping record);
}