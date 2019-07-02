package cn.boy2b.module.common.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 *@desc 表单的基础类
 *@author zhouwei
 *@date 2019-7-2 13:18
 */
@MappedSuperclass
public class StatusEntity extends CreaterEntity {

    /**
     *@desc 状态
     */
    @Column(name = "status")
    private int status;

    /**
     *@desc 更新人ID
     */
    @Column(name = "update_user_id")
    private String updateUserId;

    /**
     *@desc 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
