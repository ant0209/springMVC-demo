package cn.boy2b.module.bd.entity;

import cn.boy2b.module.common.entity.BillEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *@desc 产品表
 *@author zhouwei
 *@date 2019/7/2 18:49
 */
@Entity
@Table(name = "t_bd_product")
public class ProductEntity extends BillEntity {

    /**
     *@desc 产品名称
     */
    @Column(name = "name", length = 100)
    private String name;

    /**
     *@desc 产品类型
     */
    @Column(name = "type_id", length = 32)
    private String typeId;

    /**
     *@desc 规格型号
     */
    @Column(name = "model", length = 50)
    private String model;

    /**
     *@desc 计量单位组
     */
    @Column(name = "unit_group_id", length = 32)
    private String unitGroupId;

    /**
     *@desc 厂家
     */
    @Column(name = "manufacturer_id", length = 32)
    private String manufacturerId;

    /**
     *@desc 产地
     */
    @Column(name = "origin", length = 50)
    private String origin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUnitGroupId() {
        return unitGroupId;
    }

    public void setUnitGroupId(String unitGroupId) {
        this.unitGroupId = unitGroupId;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
}
