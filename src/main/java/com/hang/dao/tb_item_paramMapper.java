package com.hang.dao;

import com.hang.bean.bean.tb_item_param;

public interface tb_item_paramMapper {
    int deleteByPrimaryKey(Long id);

    int insert(tb_item_param record);

    int insertSelective(tb_item_param record);

    tb_item_param selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(tb_item_param record);

    int updateByPrimaryKeyWithBLOBs(tb_item_param record);

    int updateByPrimaryKey(tb_item_param record);
}