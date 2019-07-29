package cn.boy2b.module;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *@desc ViewController
 *@author zhouwei
 *@date 2019/7/29 18:26
 */
@Controller
@RequestMapping("/views")
public class ViewController {

    @RequestMapping("/{modelName}/{htmlName}")
    public ModelAndView toView (@PathVariable(required = false) String modelName, @PathVariable String htmlName) {
        ModelAndView view = new ModelAndView();
        StringBuilder viewName = new StringBuilder();
        if (StringUtils.isNotBlank(modelName)) {
            viewName.append("/").append(modelName);
        }
        viewName.append("/").append(htmlName);
        return view;
    }
}
