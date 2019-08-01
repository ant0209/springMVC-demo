package cn.boy2b.common.vo.page;

/**
 *@desc 分页
 *@author zhouwei
 *@date 2019/7/3 17:16
 */
public class BasePageVO {

    /**
     *@desc 当前页索引值,从0开始
     */
    private int index = 0;

    /**
     *@desc 每页显示的记录数
     */
    private int paseSize = 10;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPaseSize() {
        return paseSize;
    }

    public void setPaseSize(int paseSize) {
        this.paseSize = paseSize;
    }
}
