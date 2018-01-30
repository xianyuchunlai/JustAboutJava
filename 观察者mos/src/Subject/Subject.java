package Subject;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:chunLai
 * @Date: Created in 14:04 2018/1/18
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public abstract class Subject {


    List<Observer> observers =
            new ArrayList<Observer> ();

    //添加&注册观察者
    public void add(Observer observer) {
        observers.add ( observer );
    }

    //删除观察者
    public void delete(Observer observer) {
        observers.remove ( observer );
    }

    // 通知
    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update ( message );

        }
    }


}
