package cn.boy2b.module.sys.entity;

import cn.boy2b.module.common.entity.SortEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *@desc 机构
 *@author zhouwei
 *@date 2019-7-2 13:28
 */
@Entity
@Table(name = "t_sys_org")
public class OrgEntity extends SortEntity {

    @Column(name = "name", length = 30)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
