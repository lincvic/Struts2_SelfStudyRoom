package sw.zyl.action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sw.zyl.dao.AdminDAO;
import sw.zyl.vo.Student;


/**
 * Created by 王一疆 on 2017/10/9
 */
public class registerAction extends ActionSupport implements ModelDriven<Student>{
   private Student stu = new Student();
    @Override
    public Student getModel() {
        return stu;
    }

    public String register(){

        AdminDAO dao = new AdminDAO();

        if(dao.stuEx(stu.getSno())){
            this.addFieldError("stuAlreadyEx", "已经存在你的信息，请使用学号密码登陆");
            return "registerFail";
        }else {


            int rs = dao.addStu(stu);
            if (rs != 0) {
                ActionContext.getContext().getSession().put("registerName", stu.getName());
                return SUCCESS;
            } else {
                this.addFieldError("registerError", "数据未成功添加到数据库");
                return "registerFail";
            }

        }


    }

}
