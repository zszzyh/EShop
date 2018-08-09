package com.hang.dao;

import com.hang.bean.Tb_Item_Desc;

public interface Tb_Item_DescMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(Tb_Item_Desc record);

    int insertSelective(Tb_Item_Desc record);

    Tb_Item_Desc selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(Tb_Item_Desc record);

    int updateByPrimaryKeyWithBLOBs(Tb_Item_Desc record);

    int updateByPrimaryKey(Tb_Item_Desc record);

    void insertTb_Item_Desc(Tb_Item_Desc tb_item_desc);
}