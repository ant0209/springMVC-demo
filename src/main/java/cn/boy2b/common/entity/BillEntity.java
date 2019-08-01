package cn.boy2b.common.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *@desc 单据
 *@author zhouwei
 *@date 2019-7-2 13:30
 */
@MappedSuperclass
public class BillEntity extends StatusEntity {
    /**
     *@desc 编号
     */
    @Column(name = "number", length = 50)
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
