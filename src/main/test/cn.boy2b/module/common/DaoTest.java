package cn.boy2b.module.common;

import cn.boy2b.module.BaseTest;
import cn.boy2b.module.admin.entity.UserEntity;
import cn.boy2b.module.common.hibernate.Dao;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhouwei
 * @desc DaoTest
 * @date 2019-6-27 18:12
 */
public class DaoTest extends BaseTest {

    @Autowired
    private Dao dao;

    @Test
    public void test01_save() {
        UserEntity entity = new UserEntity();
        entity.setName("赵柳");
        entity.setPassword("66666");
        String id = dao.saveOrUpdate(entity);
        System.out.println(id);
    }

    @Test
    public void test02_get() {
        String id = "4028a5816b989e61016b989e67a90000";
        UserEntity entity = dao.get(UserEntity.class, id);
        System.out.println(JSONObject.toJSONString(entity));
    }

    @Test
    public void test03_update() {
        String id = "4028a5816b989e61016b989e67a90000";
        UserEntity entity = dao.get(UserEntity.class, id);
        entity.setName("王五");
        entity.setPassword("55555");
        dao.saveOrUpdate(entity);
    }
}
