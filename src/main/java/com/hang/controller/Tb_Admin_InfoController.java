package com.hang.controller;

import com.hang.bean.Tb_Admin_Info;
import com.hang.service.Tb_Admin_InfoSerivce;
import com.hang.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
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
@RequestMapping("/tb_admin_info")
public class Tb_Admin_InfoController {
    @Autowired
    @Qualifier(value = "tb_admin_infoServiceImpl")
    private Tb_Admin_InfoSerivce service;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(HttpSession session, @RequestBody Tb_Admin_Info tb_admin_info) {
        boolean flag = service.login(tb_admin_info.getAdmin_code(), MD5.getMD5(tb_admin_info.getPassword()));
        String msg = "";
        Map<String,Object> map = new HashMap<>();
        if (flag) {
            msg = "登录成功";
//            session.setAttribute("login","success");
            map.put("msg",msg);
            return map;
        } else {
            msg = "登录失败";
            map.put("msg",msg);
            return map;
        }
    }
}
