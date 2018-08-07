package com.hang.dao;

import com.hang.bean.Tb_Item_Param_Item;

public interface Tb_Item_Param_ItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tb_Item_Param_Item record);

    int insertSelective(Tb_Item_Param_Item record);

    Tb_Item_Param_Item selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tb_Item_Param_Item record);

    int updateByPrimaryKeyWithBLOBs(Tb_Item_Param_Item record);

    int updateByPrimaryKey(Tb_Item_Param_Item record);
}