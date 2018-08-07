package com.hang.dao;

import com.hang.bean.Tb_Content;

public interface Tb_ContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tb_Content record);

    int insertSelective(Tb_Content record);

    Tb_Content selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tb_Content record);

    int updateByPrimaryKeyWithBLOBs(Tb_Content record);

    int updateByPrimaryKey(Tb_Content record);
}