package cn.boy2b.module.sys.controller;

import cn.boy2b.module.BaseControllerTest;
import cn.boy2b.module.sys.entity.UserEntity;
import org.junit.Test;

/**
 *@desc AdminControllerTest
 *@author zhouwei
 *@date 2019/7/30 13:25
 */
public class AdminControllerTest extends BaseControllerTest {

    @Test
    public void test01_login() {
        String url = "/admin/login";
        UserEntity entity = new UserEntity();
        entity.setName("zhangsan");
        entity.setPassword("2222");
        doPost(url, entity);
    }
}
