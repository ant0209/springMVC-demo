package cn.boy2b.module.sys.entity;

import cn.boy2b.common.entity.CreaterEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *@desc 用户角色关系表
 *@author zhouwei
 *@date 2019/7/2 18:44
 */
@Entity
@Table(name = "t_sys_user_role")
public class UserRoleEntity extends CreaterEntity {

    @Column(name = "user_id", length = 32)
    private String userId;

    @Column(name = "role_id", length = 32)
    private String roleId;

    @Column(name = "org_id", length = 32)
    private String orgId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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
