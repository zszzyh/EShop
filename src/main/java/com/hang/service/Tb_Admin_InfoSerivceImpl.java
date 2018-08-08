package com.hang.service;

import com.hang.bean.Tb_Admin_Info;
import com.hang.dao.Tb_Admin_InfoMapper;
import com.hang.utils.MD5;
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
@Service("tb_admin_infoServiceImpl")
public class Tb_Admin_InfoSerivceImpl implements Tb_Admin_InfoSerivce {
    @Resource
    private Tb_Admin_InfoMapper mapper;

    @Override
    public Boolean login(String admin_code,String password) {
        List list =  mapper.findAdmin(admin_code, password);
        System.out.println(list);
        if (list.size()>0){
            return true;
        }else {
            return false;
        }
    }
}
