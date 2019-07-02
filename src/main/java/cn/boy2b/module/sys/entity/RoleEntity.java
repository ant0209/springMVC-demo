package cn.boy2b.module.sys.entity;

import cn.boy2b.module.common.entity.StatusEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *@desc 机构下的角色
 *@author zhouwei
 *@date 2019/7/2 18:35
 */
@Entity
@Table(name = "t_sys_role")
public class RoleEntity extends StatusEntity {

    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "org_id", length = 32)
    private String orgId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}
