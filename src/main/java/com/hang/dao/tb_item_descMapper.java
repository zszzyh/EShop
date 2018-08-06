package com.hang.dao;

import com.hang.bean.bean.tb_item_desc;

public interface tb_item_descMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(tb_item_desc record);

    int insertSelective(tb_item_desc record);

    tb_item_desc selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(tb_item_desc record);

    int updateByPrimaryKeyWithBLOBs(tb_item_desc record);

    int updateByPrimaryKey(tb_item_desc record);
}