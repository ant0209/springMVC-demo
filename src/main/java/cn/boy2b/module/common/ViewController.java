package cn.boy2b.module.common;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 *@desc ViewController
 *@author zhouwei
 *@date 2019/7/31 15:28
 */
@Controller
@RequestMapping("/views")
public class ViewController {

    @RequestMapping("/{module}/{html}")
    public ModelAndView toView(HttpServletRequest request,
                               @PathVariable String module,
                               @PathVariable String html) {
        ModelAndView view = new ModelAndView();
        StringBuilder sb = new StringBuilder();
        sb.append(module).append("/").append(html);
        view.setViewName(sb.toString());

        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String value = request.getParameter(name);
            if (StringUtils.isNotBlank(value)) {
                view.addObject(name, value);
            }
        }
        return view;
    }
}
