package cn.boy2b.module.sys.controller;

import cn.boy2b.module.common.BaseService;
import cn.boy2b.common.enums.YesOrNoEnum;
import cn.boy2b.common.vo.page.PageResultVO;
import cn.boy2b.common.vo.ResultVO;
import cn.boy2b.module.sys.entity.FunctionEntity;
import cn.boy2b.module.sys.service.FunctionService;
import cn.boy2b.module.sys.vo.FunctionQueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 *@desc 功能
 *@author zhouwei
 *@date 2019/8/1 10:54
 */
@RestController
@RequestMapping("/function")
public class FunctionController {

    @Autowired
    private BaseService baseService;

    @Autowired
    private FunctionService functionService;

    @RequestMapping("/add")
    public ResultVO add(@RequestBody FunctionEntity entity) {
        try {
            entity.setCreateTime(new Date());
            String id = baseService.saveOrUpdate(entity);
            return ResultVO.createSuccess(id);
        }
        catch (Exception e) {
            return ResultVO.createFail(e);
        }
    }

    @RequestMapping("/update")
    public ResultVO update(@RequestBody FunctionEntity entity) {
        try {
            String id = baseService.saveOrUpdate(entity);
            entity.setUpdateTime(new Date());
            return ResultVO.createSuccess(id);
        }
        catch (Exception e) {
            return ResultVO.createFail(e);
        }
    }

    @RequestMapping("/delete/{id}")
    public ResultVO delete(@PathVariable String id) {
        try {
            FunctionEntity entity = baseService.get(FunctionEntity.class, id);
            entity.setStatus(YesOrNoEnum.NO.getValue());
            entity.setUpdateTime(new Date());
            baseService.saveOrUpdate(entity);
            return ResultVO.createSuccess();
        }
        catch (Exception e) {
            return ResultVO.createFail(e);
        }
    }

    @RequestMapping("/query")
    public ResultVO query(@RequestBody FunctionQueryVO vo) {
        try {
            PageResultVO pageResultVO = functionService.query(vo);
            return ResultVO.createSuccess(pageResultVO);
        }
        catch (Exception e) {
            return ResultVO.createFail(e);
        }
    }
}
