package cn.boy2b.module.sys.vo;

import cn.boy2b.common.vo.page.PageQueryVO;

/**
 *@desc FunctionQueryVO
 *@author zhouwei
 *@date 2019/8/1 12:49
 */
public class FunctionQueryVO extends PageQueryVO {

    private String parentId;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
