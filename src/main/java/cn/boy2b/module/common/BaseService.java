package cn.boy2b.module.common;

import cn.boy2b.common.BizException;
import cn.boy2b.common.entity.IdEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *@desc 公用的业务类
 *@author zhouwei
 *@date 2019/7/3 13:53
 */
@Service
public class BaseService {

    @Autowired
    private Dao dao;

    @Transactional(rollbackFor = BizException.class)
    public <T extends IdEntity> String saveOrUpdate(final T entity) {
        return dao.saveOrUpdate(entity);
    }

    public <T extends IdEntity> T get(Class<T> clazz, String id) {
        return dao.get(clazz, id);
    }
}
