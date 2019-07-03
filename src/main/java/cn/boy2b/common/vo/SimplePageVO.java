package cn.boy2b.common.vo;

/**
 *@desc SimplePageVO
 *@author zhouwei
 *@date 2019/7/3 17:28
 */
public class SimplePageVO extends BasePageVO {

    /**
     *@desc 是否有下一页.true:有下一页; false:没有下一页
     */
    private boolean hasNext = false;

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }
}
