package cn.boy2b.module.sys.entity;

import cn.boy2b.common.entity.IdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *@desc 功能机构
 *@author zhouwei
 *@date 2019/8/1 9:53
 */
@Entity
@Table(name = "t_sys_function_org")
public class FunctionOrgEntity extends IdEntity {

    @Column(name = "function_id", length = 32)
    private String functionId;

    @Column(name = "org_id", length = 32)
    private String orgId;

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}
