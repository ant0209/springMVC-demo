package cn.boy2b.module.common.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author zhouwei
 * @desc IdEntity
 * @date 2019-6-27 17:57
 */
@MappedSuperclass
public class IdEntity {

    @Id
    @Column(name = "id")
    @GenericGenerator(name = "id", strategy = "uuid")
    @GeneratedValue(generator = "id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
