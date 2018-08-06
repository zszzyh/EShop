package com.hang.dao;

import com.hang.bean.bean.tb_order_item;

public interface tb_order_itemMapper {
    int deleteByPrimaryKey(String id);

    int insert(tb_order_item record);

    int insertSelective(tb_order_item record);

    tb_order_item selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(tb_order_item record);

    int updateByPrimaryKey(tb_order_item record);
}