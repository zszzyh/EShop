package com.hang.dao;

import com.hang.bean.Tb_Order;

public interface Tb_OrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Tb_Order record);

    int insertSelective(Tb_Order record);

    Tb_Order selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Tb_Order record);

    int updateByPrimaryKey(Tb_Order record);
}