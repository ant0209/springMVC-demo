package cn.boy2b.module.bd.entity;

import cn.boy2b.module.common.entity.StatusEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *@desc 计量单位组
 *@author zhouwei
 *@date 2019/7/3 13:22
 */
@Entity
@Table(name = "t_bd_unit_group")
public class UnitGroupEntity extends StatusEntity {

    @Column(name = "name", length = 100)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
