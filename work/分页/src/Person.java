/**
 * @Author:chunLai
 * @Date: Created in 19:45 2018/1/12
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class Person {
    private String name;
    private String gender;
    private String age;
    private String job;

    public Person(String name, String gender, String age, String job) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.job = job;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
