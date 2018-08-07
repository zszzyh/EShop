package com.hang.dao;

import com.hang.bean.Tb_Content_Category;

public interface Tb_Content_CategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tb_Content_Category record);

    int insertSelective(Tb_Content_Category record);

    Tb_Content_Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tb_Content_Category record);

    int updateByPrimaryKey(Tb_Content_Category record);
}