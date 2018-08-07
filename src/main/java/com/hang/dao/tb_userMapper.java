package com.hang.dao;

import com.hang.bean.Tb_User;

public interface Tb_UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tb_User record);

    int insertSelective(Tb_User record);

    Tb_User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tb_User record);

    int updateByPrimaryKey(Tb_User record);
}