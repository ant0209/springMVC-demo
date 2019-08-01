package cn.boy2b.module.sys.entity;

import cn.boy2b.common.entity.TreeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *@desc 功能
 *@author zhouwei
 *@date 2019/8/1 9:30
 */
@Entity
@Table(name = "t_sys_function")
public class FunctionEntity extends TreeEntity {

    /**
     *@desc 功能类型：菜单、按钮。FunctionTypeEnum
     */
    @Column(name = "type")
    private int type;

    /**
     *@desc 功能请求路径
     */
    @Column(name = "uri", length = 50)
    private String uri = null;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
