package com.hang.controller;

import com.hang.bean.BaseEasyBean;
import com.hang.bean.Tb_Item;
import com.hang.service.Tb_ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
@RequestMapping("/tb_item")
public class Tb_ItemController {
   @Autowired
   @Qualifier(value = "tb_itemServiceImpl")
    private Tb_ItemService service;

   @RequestMapping(value = "/findAll",method = RequestMethod.GET)
   @ResponseBody
   public BaseEasyBean findAll(String page, String rows){
       BaseEasyBean baseEasyBean = new BaseEasyBean();
       List<Tb_Item> tList = service.findAll(page,rows);
       int total = service.countItem();
       baseEasyBean.setRows(tList);
       baseEasyBean.setTotal(total);
       return baseEasyBean;
   }
}
