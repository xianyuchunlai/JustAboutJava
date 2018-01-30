/**
 * @Author:chunLai
 * @Date: Created in 14:02 2018/1/12
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class User {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
