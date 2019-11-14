package cn.boy2b.module.common;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *@desc DemoInterceptor
 *@author zhouwei
 *@date 2019/9/16 17:48
 */
public class DemoInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object arg2) throws Exception {

//            request.getRequestDispatcher("/login.jsp").forward(request, response);
        String uri = request.getRequestURI();//拿到上一个页面地址
        System.out.println(uri);
        if (uri.endsWith(".html")) {
//            String path = uri.substring(request.getContextPath().length());//去掉项目地址长度的字符（因为我的默认项目地址是给出的）
//            String query = request.getQueryString();//得到参数
//            if (query == null) {
//                query = "";
//            }
            request.getRequestDispatcher("/v/sys/function_list").forward(request, response);
            return false;
        }
        return true;
    }
}
