package cn.boy2b.common.vo.page;

import org.apache.commons.lang.StringUtils;

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

    /**
     *@desc 排序的字段名
     */
    private String sort = "";
    /**
     *@desc 排序方式:asc，desc
     */
    private String order = "";

    private String orderBy = "";

    public boolean isQueryTotal() {
        return queryTotal;
    }

    public void setQueryTotal(boolean queryTotal) {
        this.queryTotal = queryTotal;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrderBy() {
        if (StringUtils.isNotBlank(sort)) {
            orderBy = sort + " " + order;
        }
        return orderBy;
    }
}
