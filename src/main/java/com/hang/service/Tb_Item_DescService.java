package com.hang.service;

import com.hang.bean.Tb_Item;
import com.hang.common.pojo.TaotaoResult;

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
public interface Tb_Item_DescService {
    //添加商品
    TaotaoResult createItem(Tb_Item tb_item,String item_desc)throws Exception;
}
