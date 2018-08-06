package com.hang.dao;

import com.hang.bean.bean.tb_item;

public interface tb_itemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(tb_item record);

    int insertSelective(tb_item record);

    tb_item selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(tb_item record);

    int updateByPrimaryKey(tb_item record);
}