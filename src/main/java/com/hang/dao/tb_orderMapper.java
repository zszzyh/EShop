package com.hang.dao;

import com.hang.bean.bean.tb_order;

public interface tb_orderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(tb_order record);

    int insertSelective(tb_order record);

    tb_order selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(tb_order record);

    int updateByPrimaryKey(tb_order record);
}