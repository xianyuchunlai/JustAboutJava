package com.lanou3g.bean;

import com.lanou3g.bean.BaseDao;
import com.lanou3g.bean.HibernateUtil;
import org.hibernate.Session;

/**
 * @Author:chunLai
 * @Date: Created in 17:41 2018/1/18
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class BaseDaoimpl<T> implements BaseDao<T> {

    @Override
    public T add(T t) {
        return HibernateUtil.handle ( session -> {
            session.save ( t );
            return t;
        } );
    }


    public T delete(T t) {
        return HibernateUtil.handle ( session -> {
            session.save ( t );
            return t;
        });
    }




    @Override
    public T update(T t) {
        return HibernateUtil.handle ( session -> {
            session.update ( t );
            return t;
        } );
    }

    @Override
    public T get(Class<T> tClass, long id) {
        return HibernateUtil.handle ( session -> session.get ( tClass,id ) );
    }
}
