import java.util.List;

/**
 * @Author:chunLai
 * @Date: Created in 14:03 2018/1/12
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class Person {
    private List<User> users;

    @Override
    public String toString() {
        return "Person{" +
                "users=" + users +
                '}';
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Person(List<User> users) {

        this.users = users;
    }

    public Person() {

    }
}
