package cn.boy2b.module.common;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *@desc ViewInterceptor
 *@author zhouwei
 *@date 2019/7/30 17:59
 */
public class ViewInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        String pre = "/views";
        String dispatchUri = uri.substring(pre.length());
        response.sendRedirect(request.getContextPath() + dispatchUri);
        return false;
    }
}
