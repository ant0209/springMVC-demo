package cn.boy2b.module.bd.entity;

import cn.boy2b.common.entity.SortEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *@desc 产品类型
 *@author zhouwei
 *@date 2019/7/3 13:37
 */
@Entity
@Table(name = "t_bd_product_type")
public class ProductTypeEntity extends SortEntity {
    /**
     *@desc 名称
     */
    @Column(name = "name", length = 30)
    private String name;

    /**
     *@desc 父ID
     */
    @Column(name = "parent_id", length = 32)
    private String parentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
