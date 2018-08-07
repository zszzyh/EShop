package com.hang.dao;

import com.hang.bean.Tb_Item_Cat;

public interface Tb_Item_CatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tb_Item_Cat record);

    int insertSelective(Tb_Item_Cat record);

    Tb_Item_Cat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tb_Item_Cat record);

    int updateByPrimaryKey(Tb_Item_Cat record);
}