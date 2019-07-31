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

    @RequestMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("/index");
    }

    @RequestMapping("/m/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
}
