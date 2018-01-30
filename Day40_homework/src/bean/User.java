package bean;

/**
 * @Author:chunLai
 * @Date: Created in 18:59 2018/1/16
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class User {
    private String username;
    private String password;
    private String phone_number;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String username, String password, String phone_number, String email) {

        this.username = username;
        this.password = password;
        this.phone_number = phone_number;
        this.email = email;
    }

    public User() {

    }
}
