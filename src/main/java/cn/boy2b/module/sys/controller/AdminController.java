package cn.boy2b.module.sys.controller;

import cn.boy2b.common.vo.ResultVO;
import cn.boy2b.module.sys.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@desc AdminController
 *@author zhouwei
 *@date 2019/7/29 17:08
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/login")
    public ResultVO login(@RequestBody UserEntity entity) {
        System.out.println(entity.getName());
        System.out.println(entity.getPassword());
        return ResultVO.createSuccess();
    }
}
