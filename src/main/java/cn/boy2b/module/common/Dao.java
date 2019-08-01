package cn.boy2b.module.common;

import cn.boy2b.common.BizException;
import cn.boy2b.common.entity.IdEntity;
import cn.boy2b.common.entity.StatusEntity;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @desc 公用的DAO
 * @author zhouwei
 * @date 2019-6-27 17:37
 */
@Repository
public class Dao {

    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    /**
     *@desc 根据ID得到数据对象
     *@param clazz
     *@param id
     *@author zhouwei
     *@date 2019-6-27 18:07
     */
    public <T extends IdEntity> T get(Class<T> clazz, String id) {
        try {
            return hibernateTemplate.get(clazz, id);
        }
        catch (Exception e) {
            throw new BizException("根据ID获取对象异常", e);
        }
    }

    /**
     *@desc 保存或者更新对象
     *@param entity
     *@author zhouwei
     *@date 2019-6-27 18:10
     */
    public <T extends IdEntity> String saveOrUpdate(final T entity) {
        try {
            hibernateTemplate.setCheckWriteOperations(false);
            String id = entity.getId();
            if (StringUtils.isBlank(id)) {
                return (String)hibernateTemplate.save(entity);
            }
            else {
                if (entity instanceof StatusEntity) {
                    StatusEntity statusEntity = (StatusEntity)entity;
                    statusEntity.setUpdateTime(new Date());
                    hibernateTemplate.update(statusEntity);
                }
                else {
                    hibernateTemplate.update(entity);
                }
                return id;
            }
        }
        catch (Exception e) {
            throw new BizException("保存或者更新操作异常", e);
        }
    }
}
