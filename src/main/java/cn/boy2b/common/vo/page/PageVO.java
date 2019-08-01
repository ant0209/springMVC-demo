package cn.boy2b.common.vo.page;

/**
 *@desc PageVO
 *@author zhouwei
 *@date 2019/7/3 17:31
 */
public class PageVO extends BasePageVO {

    /**
     *@desc 总数
     */
    private int total;

    /**
     *@desc 总页数
     */
    private int totalPage;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPage() {
        int paseSize = getPaseSize();
        totalPage = total / paseSize;
        if (total % paseSize > 0) {
            totalPage += 1;
        }
        return totalPage;
    }

//    public void setTotalPage(int totalPage) {
//        this.totalPage = totalPage;
//    }
}
