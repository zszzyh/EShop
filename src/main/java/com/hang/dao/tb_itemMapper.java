package com.hang.dao;

import com.hang.bean.Tb_Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Tb_ItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tb_Item record);

    int insertSelective(Tb_Item record);

    Tb_Item selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tb_Item record);

    int updateByPrimaryKey(Tb_Item record);

    //查tb_item表全部数据
    List<Tb_Item> findAll();
}