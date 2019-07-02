package cn.boy2b.module.common.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 *@desc 创建人实体
 *@author zhouwei
 *@date 2019-7-2 12:25
 */
@MappedSuperclass
public class CreaterEntity extends IdEntity {
    /**
     *@desc 创建人ID
     */
    @Column(name = "create_user_id")
    private String createUserId;
    /**
     *@desc 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
