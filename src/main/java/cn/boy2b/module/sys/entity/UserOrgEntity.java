package cn.boy2b.module.sys.entity;

import cn.boy2b.common.entity.CreaterEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *@desc 用户机构表
 *@author zhouwei
 *@date 2019/7/2 18:38
 */
@Entity
@Table(name = "t_sys_user_org")
public class UserOrgEntity extends CreaterEntity {

    @Column(name = "user_id", length = 32)
    private String userId;

    @Column(name = "org_id", length = 32)
    private String orgId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}
