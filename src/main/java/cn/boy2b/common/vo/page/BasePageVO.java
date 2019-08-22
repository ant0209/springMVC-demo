package cn.boy2b.common.vo.page;

/**
 *@desc 分页
 *@author zhouwei
 *@date 2019/7/3 17:16
 */
public class BasePageVO {

    /**
     *@desc 当前页码,从1开始
     */
    private int pageIndex = 1;

    /**
     *@desc 每页显示的记录数
     */
    private int pageSize = 10;

    /**
     *@desc 当前页数据的起始索引值,从0开始
     */
    private int dataIndex = 0;

    public int getDataIndex() {
        dataIndex = (pageIndex - 1) * pageSize;
        return dataIndex;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
