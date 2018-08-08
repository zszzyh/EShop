package com.hang.controller;

import com.hang.common.pojo.EUTreeNode;
import com.hang.service.Tb_Item_CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
@Controller
@RequestMapping("/tb_item_cat")
public class Tb_Item_CatController {
    @Autowired
    @Qualifier(value = "tb_item_catServiceImpl")
    private Tb_Item_CatService service;

@RequestMapping("/list")
@ResponseBody
    public List<EUTreeNode> getItem_Cat(@RequestParam(name = "id",defaultValue = "0")String parent_id){
    List<EUTreeNode> euTreeNodeList = service.getItemCart(parent_id);
    System.out.println(euTreeNodeList);
    return euTreeNodeList;
}
}
