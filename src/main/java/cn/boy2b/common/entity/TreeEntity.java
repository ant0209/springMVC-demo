package cn.boy2b.common.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *@desc TreeEntity
 *@author zhouwei
 *@date 2019/8/1 9:31
 */
@MappedSuperclass
public class TreeEntity extends SortEntity {
    /**
     *@desc 父节点ID
     */
    @Column(name = "parent_id", length = 32)
    private String parentId;
    /**
     *@desc 节点名称
     */
    @Column(name = "name", length = 30)
    private String name;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
