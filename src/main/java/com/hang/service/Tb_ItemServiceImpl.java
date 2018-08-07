package com.hang.service;

import com.hang.bean.Tb_Item;
import com.hang.dao.Tb_ItemMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
 *    //       \\
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
@Service("tb_itemServiceImpl")
public class Tb_ItemServiceImpl implements Tb_ItemService {
    @Resource
    private Tb_ItemMapper mapper;

    @Override
    public List<Tb_Item> findAll() {
        return mapper.findAll();
    }
}
