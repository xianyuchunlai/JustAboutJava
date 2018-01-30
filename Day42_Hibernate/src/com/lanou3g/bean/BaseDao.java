package com.lanou3g.bean;

/**
 * @Author:chunLai
 * @Date: Created in 17:37 2018/1/18
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public interface BaseDao<T> {
    T add(T t);

    T delete(T t);

    T update(T t);

    T get(Class<T> tClass, long id);

}
