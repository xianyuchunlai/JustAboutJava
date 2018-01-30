package com.lanou3g.bean;

/**
 * @Author:chunLai
 * @Date: Created in 11:22 2018/1/18
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class TeacherEntity {
    private int tid;
    private String name;
    private String Subjet;
    private Integer age;
    private String subjet;

    public String getSubjet() {
        return subjet;
    }

    public void setSubjet(String subjet) {
        this.subjet = subjet;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;

        TeacherEntity that = (TeacherEntity) o;

        if (tid != that.tid) return false;
        if (name != null ? !name.equals ( that.name ) : that.name != null) return false;
        if (Subjet != null ? !Subjet.equals ( that.Subjet ) : that.Subjet != null) return false;
        if (age != null ? !age.equals ( that.age ) : that.age != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid;
        result = 31 * result + (name != null ? name.hashCode () : 0);
        result = 31 * result + (Subjet != null ? Subjet.hashCode () : 0);
        result = 31 * result + (age != null ? age.hashCode () : 0);
        return result;
    }
}
