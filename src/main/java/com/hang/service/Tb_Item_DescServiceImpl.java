package com.hang.service;

import com.hang.bean.Tb_Item;
import com.hang.bean.Tb_Item_Desc;
import com.hang.common.pojo.TaotaoResult;
import com.hang.dao.Tb_ItemMapper;
import com.hang.dao.Tb_Item_DescMapper;
import com.hang.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

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
@Service
public class Tb_Item_DescServiceImpl implements Tb_Item_DescService{
    @Resource
    private Tb_ItemMapper tb_itemMapper;

    @Resource
    private Tb_Item_DescMapper tb_item_descMapper;

    @Override
    public TaotaoResult createItem(Tb_Item tb_item, String item_desc) throws Exception {
        //使用工具类生成商品的id
        long item_id = IDUtils.genItemId();
        tb_item.setId(item_id);
        //商品状态  1正常  2下架  3删除
        tb_item.setStatus((byte) 1);
        //创建时间和修改时间 获取创建时的时间
        tb_item.setCreated(new Date());
        tb_item.setUpdated(new Date());
        tb_itemMapper.insertTb_Item(tb_item);
        //添加商品描述
        insertItem_Desc(item_id,item_desc);
        return TaotaoResult.ok();
    }

    private  void insertItem_Desc(long item_id,String item_desc){
        Tb_Item_Desc tb_item_desc = new Tb_Item_Desc();
        //设置属性
        tb_item_desc.setItem_id(item_id);
        tb_item_desc.setItem_desc(item_desc);
        tb_item_desc.setCreated(new Date());
        tb_item_desc.setUpdated(new Date());
        tb_item_descMapper.insertTb_Item_Desc(tb_item_desc);
    }
}
