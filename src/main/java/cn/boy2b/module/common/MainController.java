package cn.boy2b.module.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *@desc MainController
 *@author zhouwei
 *@date 2019/7/31 17:22
 */
@Controller
public class MainController {

    /**
     *@desc 首页
     */
    @RequestMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    /**
     *@desc 跳转到登录界面,这里的界面在WEB-INF/views下面
     *@param 
     *@author zhouwei
     *@date 2019/8/1 10:53
     */
    @RequestMapping("/m/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
}
