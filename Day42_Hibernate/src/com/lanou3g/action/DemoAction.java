package com.lanou3g.action;

import com.lanou3g.bean.BaseDao;
import com.lanou3g.bean.BaseDaoimpl;
import com.lanou3g.bean.Demo;

/**
 * @Author:chunLai
 * @Date: Created in 17:52 2018/1/18
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class DemoAction {
    private BaseDao<Demo> baseDao =
            new BaseDaoimpl ();

    public String demo() {
        //假如我是一个Struts2的action
        //毕竟POJO类也可以作为action使用
        baseDao.add ( new Demo () );
        return "success";
    }
}
