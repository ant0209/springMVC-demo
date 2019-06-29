package cn.boy2b.module.admin.dao;

import cn.boy2b.module.admin.vo.UserVO;

import java.util.List;

/**
 * @desc UserMapper
 * @author zhouwei
 * @date 2019-6-25 13:47
 */
public interface UserMapper {

    void add(UserVO user);

    void update(UserVO user);

    List<UserVO> queryAllUser();
}
