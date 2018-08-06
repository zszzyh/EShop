package com.hang.dao;

import com.hang.bean.bean.tb_item_cat;

public interface tb_item_catMapper {
    int deleteByPrimaryKey(Long id);

    int insert(tb_item_cat record);

    int insertSelective(tb_item_cat record);

    tb_item_cat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(tb_item_cat record);

    int updateByPrimaryKey(tb_item_cat record);
}