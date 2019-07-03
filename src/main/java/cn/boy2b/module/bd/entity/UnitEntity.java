package cn.boy2b.module.bd.entity;

import cn.boy2b.module.common.entity.SortEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *@desc 计量单位
 *@author zhouwei
 *@date 2019/7/2 18:56
 */
@Entity
@Table(name = "t_bd_unit")
public class UnitEntity extends SortEntity {

    @Column(name = "name", length = 30)
    private String name;

    /**
     *@desc 是否基本计量单位
     */
    @Column(name = "is_base_unit", length = 32)
    private boolean isBaseUnit;

    /**
     *@desc 换算系数,基本计量单位为1
     */
    @Column(name = "rate", precision = 18, scale = 8)
    private double rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBaseUnit() {
        return isBaseUnit;
    }

    public void setBaseUnit(boolean baseUnit) {
        isBaseUnit = baseUnit;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
