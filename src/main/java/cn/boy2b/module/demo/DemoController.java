package cn.boy2b.module.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *@desc DemoController
 *@author zhouwei
 *@date 2019/7/22 13:43
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "/{name}")
    public ModelAndView toView(@PathVariable String name) {
        ModelAndView view = new ModelAndView("demo/" + name);
        return view;
    }
}
