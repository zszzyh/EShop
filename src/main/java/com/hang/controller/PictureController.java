package com.hang.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.hang.common.pojo.UpLoadFileResult;
import com.hang.utils.ResponseUtils;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
public class PictureController {
    @RequestMapping("/pic/upload")
    @ResponseBody
    public UpLoadFileResult uploadBrandPic(@RequestParam(required = false) MultipartFile pic, HttpServletResponse response) {
        //图片名称生成策略---采用时间格式(精确到毫秒)并追加随机3位(10以内)数字
        //精确到毫秒
        UpLoadFileResult result = new UpLoadFileResult();
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String picName = df.format(new Date());
        //随机再生成3位 10以内的数
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            picName += r.nextInt(10);
        }
        //获取扩展名
        String originalFilename = pic.getOriginalFilename();
        String ext = FilenameUtils.getExtension(originalFilename);
        //相对路径
        String path =  picName + "." + ext;
        //全路径，该路径为后面创建的tomcat图片服务器的上传图片的web工程下存放图片的路径
        String url = "http://172.16.17.6:8080/ImageWeb/" + path;
        //jersey 发送另一台Tomcat(可读写的)

        Client client = new Client();
        try {
//            for (int i = 0; i < 1000; i++) {
//                url="http://172.16.17.6:8080/ImageWeb/upload/" +i+ path;
                WebResource resource = client.resource(url);
                resource.put(String.class, pic.getBytes());
//            }

            result.setError(0);
            result.setUrl(url);
            result.setMessage("上传图片成功");
        } catch (UniformInterfaceException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (ClientHandlerException e1) {
            // TODO Auto-generated catch block
            result.setError(1);
            result.setMessage("上传图片失败");
            e1.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return result;

//        Gson gson = new Gson();

//        Map map = new HashMap();
//        map.put("url", url);
//        map.put("path", path);

//        JSONObject json = new JSONObject();
//        json.put("url", url);
//        json.put("path", path);
//        ResponseUtils.renderJson(response, map.toString());
    }
}

//    }


//        //获取扩展名
//        String originalFilename = pic.getOriginalFilename();
//        String ext = FilenameUtils.getExtension(originalFilename);
//        //相对路径
//        String path = "upload/" + picName + "." + ext;
//        //全路径，该路径为后面创建的tomcat图片服务器的上传图片的web工程下存放图片的路径
//        String url = "http://localhost:8088/images-web/" + path;
//        //jersey 发送另一台Tomcat(可读写的)
//        Client client = new Client();
//        WebResource resource = client.resource(url);
//    public Map uploadFile(MultipartFile uploadFile) {
//        Map result  = new HashMap<>();
//        try {
//            //1.接收上传的文件
//            //2.获取扩展名
//            String orignalName = uploadFile.getOriginalFilename();
//            String extName = orignalName.substring(orignalName.lastIndexOf(".")+1);
//            //3.上传到图片服务器
//            FastDFSClient fastDFSClient = new FastDFSClient("classpath:resource/client.conf");
//            String url = fastDFSClient.uploadFile(uploadFile.getBytes(), extName);
//            url = IMAGE_SERVER_URL + url;
//            result.put("error", 0);
//            result.put("url", url);
//            return result;
//        }  catch (Exception e) {
//            e.printStackTrace();
//            result.put("error", 0);
//            result.put("message", "上传图片失败！");
//            return result;
//        }
//    }


