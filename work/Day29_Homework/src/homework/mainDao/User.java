package homework.mainDao;

public class User {
    private String uname;
    private String password;

    public User(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    @Override
    public String toString() {

        return "User{" + "uname='" + uname + '\'' + ", password='" + password + '\'' + '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {

    }
}
