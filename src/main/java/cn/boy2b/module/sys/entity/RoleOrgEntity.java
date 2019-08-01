package cn.boy2b.module.sys.entity;

import cn.boy2b.common.entity.CreaterEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *@desc 角色所属机构
 *@author zhouwei
 *@date 2019/7/2 18:40
 */
@Entity
@Table(name = "t_sys_role_org")
public class RoleOrgEntity extends CreaterEntity {

    @Column(name = "role_id", length = 32)
    private String roleId;

    @Column(name = "org_id", length = 32)
    private String orgId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}
