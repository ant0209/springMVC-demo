package cn.boy2b.module.bd.entity;

import cn.boy2b.common.entity.StatusEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *@desc 厂家
 *@author zhouwei
 *@date 2019/7/2 18:56
 */
@Entity
@Table(name = "t_bd_unit")
public class ManufacturerEntity extends StatusEntity {

    /**
     *@desc 名称
     */
    @Column(name = "name", length = 100)
    private String name;

    /**
     *@desc 地址
     */
    @Column(name = "address", length = 200)
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
