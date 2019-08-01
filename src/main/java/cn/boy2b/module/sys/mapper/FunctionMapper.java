package cn.boy2b.module.sys.mapper;

import cn.boy2b.module.sys.entity.FunctionEntity;
import cn.boy2b.module.sys.vo.FunctionQueryVO;

import java.util.List;

/**
 *@desc FunctionMapper
 *@author zhouwei
 *@date 2019/8/1 12:58
 */
public interface FunctionMapper {

    List<FunctionEntity> query(FunctionQueryVO vo);

    int queryCount(FunctionQueryVO vo);
}
