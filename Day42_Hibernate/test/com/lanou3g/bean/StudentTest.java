package com.lanou3g.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @Author:chunLai
 * @Date: Created in 10:12 2018/1/18
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class StudentTest {
    //快速删除无用的import语句
    //alt+ctrl+o

    @Test
    public void hello() {
        new Configuration ()
                .configure ()
                .buildSessionFactory ();
    }


    @Test
    public void save() {
        SessionFactory sf =
                new Configuration ()
                        .configure ()
                        .buildSessionFactory ();
        Session session =
                sf.openSession ();


        session.beginTransaction ();

        Student student = new Student ();
        student.setAge ( 200 );
        student.setSid ( 2 );
        student.setGender ( "men" );
        student.setName ( "monkey" );


        session.save ( student );
        session.getTransaction ().commit ();
        session.close ();
    }



//    public void P() {
//        Student stu = HibernateUtil
//                .handle ( new HibernateUtil.ResultHandler<Student> () {
//
//            @Override
//            public Student resultHandle(Session session) {
//                Student student = session.get ( Student.class, 1L );
//
//                return student;
//            }
//
//        } );
//    }


}