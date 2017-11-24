package sw.zyl.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sw.zyl.dao.AdminDAO;
import sw.zyl.vo.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王一疆 on 2017/11/22
 */
public class stuPanelAction extends ActionSupport implements ModelDriven<Student> {
    public Student stu = new Student();
    public List<Student> stuList = new ArrayList<Student>();
    public String stuId;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

    @Override
    public Student getModel() {
        return stu;
    }

    public AdminDAO dao = new AdminDAO();

    //返回所有学生信息
    public String getAllStu(){

        stuList = dao.queryStu();
        if(stuList.isEmpty()){
            this.addFieldError("getStuFail", "数据库中没有学生信息");
            return "getStuFail";
        }else {
            return SUCCESS;
        }
    }

    //修改学生信息-跳转
    public String modiStu_Jump(){

        Student stuById = dao.queryStuByID(stuId);
        System.out.println(stuById.getId());
        System.out.println(stuById.getSno());
        ActionContext.getContext().getSession().put("stuById", stuById);

        return SUCCESS;
    }

    //修改学生信息
    public String modiStu(){

        AdminDAO dao = new AdminDAO();
        int rs = dao.modiStu(stu);
        System.out.println(rs);

        if(rs!=0){
            return SUCCESS;
        }else{
            this.addFieldError("modiStuError","修改学生信息失败，请检查数据库连接");
            return "modiStuError";
        }
    }

    //删除学生信息
    public String delStu(){

        int rs = dao.delStu(stuId);

        if(rs!=0){
            return SUCCESS;
        }else{
            this.addFieldError("delStuError","删除学生失败，请检查数据库连接");
            return "delStuFail";
        }
    }
}
