package cn.boy2b.module.sys.service;

import cn.boy2b.module.sys.dao.UserMapper;
import cn.boy2b.module.sys.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhouwei
 * @date 2019-6-25 13:53
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)
    public void add(UserVO user) {
        userMapper.add(user);
    }

    @Transactional
    public void update(UserVO user) {
        userMapper.update(user);
    }

    public List<UserVO> queryAllUser() {
        return userMapper.queryAllUser();
    }
}
