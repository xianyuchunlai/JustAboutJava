package com.lanou3g.study.dao;

import com.lanou3g.study.domain.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * @Author:chunLai
 * @Date: Created in 14:55 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao  {

    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void add() {
        user = new User ();
        user.setUsername ("九头狮子草");
        user.setPassword ( "666" );
        this.getHibernateTemplate ().save ( user );
        System.out.println ("添加好了");
    }
}
