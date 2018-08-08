package com.hang.service;

import com.hang.bean.Tb_Item;

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
public interface Tb_ItemService {
    //item表所有条数
    int countItem();
    //查item表全部数据
    List<Tb_Item> findAll(String page, String rows);
}
