package com.hang.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public int countItem() {
        return mapper.findAll().size();
    }

    @Override
    public List<Tb_Item> findAll(String page, String rows) {
        PageHelper.startPage(Integer.parseInt(page),Integer.parseInt(rows));
        List<Tb_Item> list = mapper.findAll();

        PageInfo<Tb_Item> pageInfo = new PageInfo<>(list);
        List<Tb_Item> resultList = pageInfo.getList();
        return resultList;
    }
}
