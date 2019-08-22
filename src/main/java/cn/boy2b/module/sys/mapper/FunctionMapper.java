package cn.boy2b.module.sys.mapper;

import cn.boy2b.module.sys.vo.FunctionQueryVO;
import cn.boy2b.module.sys.vo.FunctionVO;

import java.util.List;

/**
 *@desc FunctionMapper
 *@author zhouwei
 *@date 2019/8/1 12:58
 */
public interface FunctionMapper {

    List<FunctionVO> query(FunctionQueryVO vo);

    int queryCount(FunctionQueryVO vo);
}
