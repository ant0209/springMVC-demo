package cn.boy2b.common.vo.page;

import cn.boy2b.common.vo.page.PageVO;

/**
 *@desc 翻页查询条件基类
 *@author zhouwei
 *@date 2019/8/1 13:18
 */
public class PageQueryVO extends PageVO {

    /**
     *@desc 是否查询总数。如果是翻页查询,可以不用查询总数
     */
    private boolean queryTotal = true;

    public boolean isQueryTotal() {
        return queryTotal;
    }

    public void setQueryTotal(boolean queryTotal) {
        this.queryTotal = queryTotal;
    }
}
