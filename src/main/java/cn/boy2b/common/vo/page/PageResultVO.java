package cn.boy2b.common.vo.page;

import java.util.List;

/**
 *@desc 列表的结果对象
 *@author zhouwei
 *@date 2019/8/1 13:43
 */
public class PageResultVO extends PageVO {

    private List<?> list = null;

    public PageResultVO() {

    }

    public PageResultVO(PageVO pageVO) {
        this.setPageIndex(pageVO.getPageIndex());
        this.setPageSize(pageVO.getPageSize());
        this.setTotal(pageVO.getTotal());
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
