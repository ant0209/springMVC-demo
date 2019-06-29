package cn.boy2b.module;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhouwei
 * @desc BaseTest
 * @date 2019-6-26 14:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/spring-context.xml",
        "classpath:/config/spring-dao.xml"})//指定spring的配置文件
public abstract class BaseTest {

}
