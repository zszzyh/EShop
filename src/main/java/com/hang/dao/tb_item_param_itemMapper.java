package com.hang.dao;

import com.hang.bean.bean.tb_item_param_item;

public interface tb_item_param_itemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(tb_item_param_item record);

    int insertSelective(tb_item_param_item record);

    tb_item_param_item selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(tb_item_param_item record);

    int updateByPrimaryKeyWithBLOBs(tb_item_param_item record);

    int updateByPrimaryKey(tb_item_param_item record);
}