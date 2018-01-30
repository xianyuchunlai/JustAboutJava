package Observer;

/**
 * @Author:chunLai
 * @Date: Created in 14:02 2018/1/18
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public interface Observer {
    //观察者
    void update(String message);

    void add(Observer observer);
}


