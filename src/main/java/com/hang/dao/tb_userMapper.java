package com.hang.dao;

import com.hang.bean.bean.tb_user;

public interface tb_userMapper {
    int deleteByPrimaryKey(Long id);

    int insert(tb_user record);

    int insertSelective(tb_user record);

    tb_user selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(tb_user record);

    int updateByPrimaryKey(tb_user record);
}