package com.hang.dao;

import com.hang.bean.Tb_Order_Item;

public interface Tb_Order_ItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tb_Order_Item record);

    int insertSelective(Tb_Order_Item record);

    Tb_Order_Item selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tb_Order_Item record);

    int updateByPrimaryKey(Tb_Order_Item record);
}