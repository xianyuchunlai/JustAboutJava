package bean;

/**
 * @Author:chunLai
 * @Date: Created in 16:09 2018/1/15
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class User {
    private String username;
    private String age;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public User() {

    }

    public User(String username, String age) {

        this.username = username;
        this.age = age;
    }
}
