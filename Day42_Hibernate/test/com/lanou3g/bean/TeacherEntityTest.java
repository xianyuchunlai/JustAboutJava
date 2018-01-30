package com.lanou3g.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @Author:chunLai
 * @Date: Created in 11:24 2018/1/18
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class TeacherEntityTest {

    @Test
    public void save() {
        //创建一个转载配置文件信息的对象
        Configuration config =
                new Configuration ();
        // 将hibernate.cfg.xml文件中的信息装给进去
        config.configure ();

        //根据配置信息创建一个sessionFactory
        //sessionFactory负责创建Session
        SessionFactory sf = config.buildSessionFactory ();

        //开启一个Session
        //在hibernate中,session就相当于
        //jdbc中的connection
        Session session = sf.openSession ();


        //获取事物对象
        Transaction transaction = session.getTransaction ();

        //hibernate默认是不提交事务的
        //先开启事务

        transaction.begin ();

        //构建一个要保存的teacher对象
        //因为tid是主键,并且设置了自增长
        //所以我们不需要设置主键

        TeacherEntity teacher = new TeacherEntity ();
        teacher.setName ( "泮托拉唑" );
        teacher.setAge ( 999 );
        teacher.setSubjet ( "舒心" );


        //session就相当于connection
        //也就是说增删查改方法都是调用session的
        session.save ( teacher );

        //提交事务
        //如果不提交事务，则上述保存操作
        //并不会被更新到数据库

        transaction.commit ();

        //提交事务
        //如果不提交事务，则上述保存操作
        //并不会被更新到数据库

        session.close ();


    }


    @Test
    public void get() {

        Session session =
                new Configuration ()
                        .configure ()
                        .buildSessionFactory ()
                        .openSession ();
        session.beginTransaction ();

        //通过id找到对应的数据
        Student student =
                session.get ( Student.class, 1L );


        Student s =
                session.get ( Student.class, 1L );


        //脱管
        //将s指向的对象,从持久化转换为游离态
        //此时hibernate也就不在维护该对象的状态
        //什么叫维护
        //只要一个对象处于持久化状态
        //hibernate就会保证它的属性值与数据库一致
        session.evict ( s );
        s.setName ( "王五" );

        System.out.println ( student );
        session.getTransaction ().commit ();
        session.close ();

    }


    @Test
    public void update() {
        Session session =
                new Configuration ()
                        .configure ()
                        .buildSessionFactory ()
                        .openSession ();

        session.beginTransaction ();


        Student student = session.get ( Student.class, 1L );
        student.setName ( "pink_little_pig" );
        student.setAge ( 18 );
        student.setGender ( "female" );
        //不在需要执行session.update方法

        session.getTransaction ().commit ();
        session.close ();
    }


    @Test
    public void delete() {

        Session session = new Configuration ()
                .configure ()
                .buildSessionFactory ().openSession ();

        session.beginTransaction ();

        Student student = session.get ( Student.class, 1L );

        session.delete ( student );

        session.getTransaction ().commit ();

        session.close ();

    }



    @Test
    public void flush(){
        Session session = new Configuration ().configure ().buildSessionFactory ().openSession ();
        Transaction transaction = session.beginTransaction ();
        Student student01 =session.get ( Student.class,1L );
        Student student02 =session.get ( Student.class,2L );
        student01.setName ( "boysAndGirl" );

        Student student03=new Student (3,"happy_girl",18,"female"  );
        session.save ( student03 );


        session.flush ();

        transaction.commit ();
        session.close ();

    }





}