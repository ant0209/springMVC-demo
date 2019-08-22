package cn.boy2b.module.sys.controller;

import cn.boy2b.module.BaseControllerTest;
import cn.boy2b.module.common.BaseService;
import cn.boy2b.common.enums.YesOrNoEnum;
import cn.boy2b.module.sys.entity.FunctionEntity;
import cn.boy2b.module.sys.enums.FunctionTypeEnum;
import cn.boy2b.module.sys.vo.FunctionQueryVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Random;

/**
 *@desc FunctionControllerTest
 *@author zhouwei
 *@date 2019/8/1 14:18
 */
public class FunctionControllerTest extends BaseControllerTest {

    @Autowired
    private BaseService baseService;

    @Test
    public void test01_add() {
        String url = "/function/add";
        FunctionEntity entity = new FunctionEntity();
        entity.setName("用户管理");
        entity.setStatus(YesOrNoEnum.YES.getValue());
        entity.setType(FunctionTypeEnum.MENU.getValue());
        entity.setUri("/views/sys/list");
        entity.setSortNum(1);
        doPost(url, entity);
    }

    @Test
    public void test02_update() {
        String id = "428084c36c4c61da016c4c61e2080000";
        FunctionEntity entity = baseService.get(FunctionEntity.class, id);
        entity.setName("功能管理");
        entity.setUri("/views/sys/function_list");
        entity.setUpdateTime(new Date());

        String url = "/function/update";
        doPost(url, entity);
    }

    @Test
    public void test03_delete() {
        String id = "428084c36c4bf549016c4bf5543f0000";
        String url = "/function/delete/" + id;
        doPost(url, null);
    }

    @Test
    public void test04_query() {
        FunctionQueryVO vo = new FunctionQueryVO();
        vo.setPageIndex(0);
        vo.setPageSize(5);
        vo.setSort("parentName");
        vo.setOrder("asc");

        String url = "/function/query";
        doPost(url, vo);
    }

    @Test
    public void test05_batchAdd() {
        String url = "/function/add";
        for (int i = 0; i < 10; i++) {
            FunctionEntity entity = new FunctionEntity();
            entity.setName(randomStr(5));
            entity.setStatus(Math.round(new Random().nextInt(2)));
            entity.setType(Math.round(new Random().nextInt(2)));
            entity.setUri("/views/" + randomStr(6));
            entity.setSortNum(Math.round(new Random().nextInt(99)));
            doPost(url, entity);
        }
    }

    private static final String CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private String randomStr(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            int rn = Math.round(new Random().nextInt(CHARS.length()));
            sb.append(CHARS.charAt(rn));
        }
        return sb.toString();
    }
}
