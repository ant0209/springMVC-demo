package cn.boy2b.module.bd.entity;

import cn.boy2b.module.common.entity.BillEntity;

import javax.persistence.Column;

/**
 *@desc 物料表
 *@author zhouwei
 *@date 2019/7/2 18:49
 */
public class MaterialEntity extends BillEntity {

    /**
     *@desc 物料名称
     */
    @Column(name = "name", length = 100)
    private String name;

    /**
     *@desc 规格型号
     */
    @Column(name = "model", length = 50)
    private String model;

    /**
     *@desc 计量单位
     */
    @Column(name = "unit_id", length = 32)
    private String unitId;

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
}
