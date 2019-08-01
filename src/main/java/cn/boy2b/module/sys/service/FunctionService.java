package cn.boy2b.module.sys.service;

import cn.boy2b.common.vo.page.PageVO;
import cn.boy2b.common.vo.page.PageResultVO;
import cn.boy2b.module.sys.entity.FunctionEntity;
import cn.boy2b.module.sys.mapper.FunctionMapper;
import cn.boy2b.module.sys.vo.FunctionQueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@desc FunctionService
 *@author zhouwei
 *@date 2019/8/1 12:51
 */
@Service
public class FunctionService {

    @Autowired
    private FunctionMapper functionMapper;

    /**
     *@desc 根据条件查询功能
     *@param vo
     *@author zhouwei
     *@date 2019/8/1 13:00
     */
    public PageResultVO query(FunctionQueryVO vo) {
        PageResultVO ret = new PageResultVO((PageVO)vo);
        if (vo.isQueryTotal()) {
            int total = functionMapper.queryCount(vo);
            ret.setTotal(total);
        }
        List<FunctionEntity> list = functionMapper.query(vo);
        ret.setList(list);
        return ret;
    }
}
