package Subject;

import Observer.Observer;

/**
 * @Author:chunLai
 * @Date: Created in 14:13 2018/1/18
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class Book extends Subject {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void add(Observer observer) {
        observer.add ( observer );
    }

    @Override
    public void delete(Observer observer) {
        super.delete ( observer );
    }

    @Override
    public void notify(String message) {

       for (Observer observer :observers){
           observer.update ( name+message );
       }
    }
}
