package com.hang.dao;

import com.hang.bean.bean.tb_content_category;

public interface tb_content_categoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(tb_content_category record);

    int insertSelective(tb_content_category record);

    tb_content_category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(tb_content_category record);

    int updateByPrimaryKey(tb_content_category record);
}