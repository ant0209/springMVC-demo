package cn.boy2b.module.admin.entity;

import cn.boy2b.module.common.entity.IdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author zhouwei
 * @desc UserEntity
 * @date 2019-6-27 18:13
 */
@Entity
@Table(name = "t_user")
public class UserEntity extends IdEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
