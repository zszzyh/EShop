package com.hang.service;

import com.hang.bean.Tb_Item_Cat;
import com.hang.common.pojo.EUTreeNode;
import com.hang.dao.Tb_Item_CatMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
@Service("tb_item_catServiceImpl")
public class Tb_Item_CatServiceImpl implements Tb_Item_CatService {
    @Resource
    private Tb_Item_CatMapper mapper;
    @Override
    public List<EUTreeNode> getItemCart(String parent_id) {
        List<Tb_Item_Cat> tb_item_catList = mapper.findAll(parent_id);
        List<EUTreeNode> euTreeNodeList = new ArrayList<>();
        for (Tb_Item_Cat tb_item_cat : tb_item_catList) {
            EUTreeNode euTreeNode = new EUTreeNode();
            euTreeNode.setId(tb_item_cat.getId());
            euTreeNode.setText(tb_item_cat.getName());
            euTreeNode.setState(tb_item_cat.getIs_parent()?"closed":"open");
            euTreeNodeList.add(euTreeNode);
        }
        return euTreeNodeList;
    }
}
