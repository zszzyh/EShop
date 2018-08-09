package com.hang.controller;

import com.hang.bean.Tb_Item;
import com.hang.common.pojo.TaotaoResult;
import com.hang.service.Tb_Item_DescService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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
@RequestMapping("/tb_item_desc")
@Controller
public class Tb_Item_DescController {
    @Resource
    private Tb_Item_DescService tb_Item_DescServiceImpl;



    @RequestMapping("/insertItem")
    @ResponseBody
    public TaotaoResult insertItem(Tb_Item tb_item,String tb_desc){
        try {
            TaotaoResult result =tb_Item_DescServiceImpl.createItem(tb_item,tb_desc);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return TaotaoResult.build(500,"添加商品失败");
        }
    }
}
