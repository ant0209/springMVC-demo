package cn.boy2b.module.common.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *@desc 排序
 *@author zhouwei
 *@date 2019-7-2 14:00
 */
@MappedSuperclass
public class SortEntity extends StatusEntity {
    /**
     *@desc 排序号
     */
    @Column(name = "sort_num")
    private int sortNum;

    public int getSortNum() {
        return sortNum;
    }

    public void setSortNum(int sortNum) {
        this.sortNum = sortNum;
    }
}
