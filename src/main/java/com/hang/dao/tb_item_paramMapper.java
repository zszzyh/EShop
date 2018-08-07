package com.hang.dao;

import com.hang.bean.Tb_Item_Param;

public interface Tb_Item_ParamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tb_Item_Param record);

    int insertSelective(Tb_Item_Param record);

    Tb_Item_Param selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tb_Item_Param record);

    int updateByPrimaryKeyWithBLOBs(Tb_Item_Param record);

    int updateByPrimaryKey(Tb_Item_Param record);
}