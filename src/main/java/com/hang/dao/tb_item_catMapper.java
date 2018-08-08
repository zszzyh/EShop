package com.hang.dao;

import com.hang.bean.Tb_Item_Cat;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Tb_Item_CatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tb_Item_Cat record);

    int insertSelective(Tb_Item_Cat record);

    Tb_Item_Cat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tb_Item_Cat record);

    int updateByPrimaryKey(Tb_Item_Cat record);

    List<Tb_Item_Cat> findAll(String parent_id);
}