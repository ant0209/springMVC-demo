package cn.boy2b.module.sys;

import cn.boy2b.module.BaseTest;
import cn.boy2b.module.sys.service.UserService;
import cn.boy2b.module.sys.vo.UserVO;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zhouwei
 * @desc UserServiceTest
 * @date 2019-6-26 14:04
 */
public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService service;

    @Test
    public void test01_add() {
        UserVO user = new UserVO();
        user.setId("1");
        user.setName("周围");
        user.setPassword("111111");
        service.add(user);
    }

    @Test
    public void test02_update() {
        UserVO user = new UserVO();
        user.setId("1");
        user.setName("张三");
        user.setPassword("3333");
        service.update(user);
    }

    @Test
    public void test03_queryAllUser() {
        List<UserVO> list = service.queryAllUser();
        System.out.println(JSONObject.toJSONString(list));
    }
}
