package sw.zyl.vo;

/**
 * Created by 王一疆 on 2017/11/21
 */
public class Student {
    private String id;
    private String sno;
    private String name;
    private String password;
    private String grade;
    private String email;
    private String phonenum;
    private String repsw;

    public String getRepsw() {
        return repsw;
    }

    public void setRepsw(String repsw) {
        this.repsw = repsw;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }
}
