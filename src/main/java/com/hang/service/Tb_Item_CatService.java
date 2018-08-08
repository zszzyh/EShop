package com.hang.service;

import com.hang.common.pojo.EUTreeNode;

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
public interface Tb_Item_CatService {
    //根据id来查询树形结构
    List<EUTreeNode> getItemCart(String parent_id);
}
