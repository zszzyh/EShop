package com.hang.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Nero on 18/8/8.
 */
public class ResponseUtils {
    private static Logger logger = LogManager.getLogger(ResponseUtils.class);

    public static void renderJson(HttpServletResponse response, String text){
        response.setContentType("application/json;charset=UTF-8");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        try {
            if(StringUtils.isBlank(text)){
                text="";
            }
            response.getWriter().write(text);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            logger.error(e.getMessage());
            if(!"class org.apache.catalina.connector.ClientAbortException".equals(e.getClass().toString()))
                e.printStackTrace();
        }
    }
}
