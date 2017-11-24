package sw.zyl.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import sw.zyl.dao.AdminDAO;
import sw.zyl.vo.Student;

/**
 * Created by 王一疆 on 2017/11/21
 */
public class loginAction extends ActionSupport implements ModelDriven<Student> {

    public Student stu = new Student();

    @Override
    public Student getModel() {
        return stu;
    }

    @Override
    public void validate() {
        if(stu.getSno().equals("")||stu.getPassword().trim().equals("")){
            this.addFieldError("sno","用户名不能为空");
        }
        if(stu.getPassword().equals("")||stu.getPassword().trim().equals("")) {
            this.addFieldError("password", "密码不能为空");
        }

    }

    public String login() {
        AdminDAO dao = new AdminDAO();
        if(dao.stuVali(stu.getSno(), stu.getPassword())){
            return SUCCESS;
        }else{
            this.addFieldError("loginError", "登陆失败，请检查用户名及密码");
            return "loginFail";
        }
    }
}
