package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:chunLai
 * @Date: Created in 14:11 2018/1/18
 * @Ver.No: 1.0
 * @Description: 观察者模式
 * @param:
 * @ModifiedBy: NONE
 */
public class Reader implements Observer {

    private String name;

    private List<Observer> observers =
            new ArrayList<Observer> (  );

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println (name+"........"+message);
    }

    @Override
    public void add(Observer observer) {

    }
}
