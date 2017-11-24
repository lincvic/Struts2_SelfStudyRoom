package sw.zyl.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sw.zyl.dao.AdminDAO;

/**
 * Created by 王一疆 on 2017/11/21
 */
public class adminLoginAction extends ActionSupport {
    private String username;
    private String password;

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

    @Override
    public void validate() {
        if(username.equals("")||username.trim().equals("")){
            this.addFieldError("username","管理员账号不能为空");
        }
        if(password.equals("")||password.trim().equals("")) {
            this.addFieldError("password", "管理员密码不能为空");
        }

    }

    public String adminLogin(){
        AdminDAO dao = new AdminDAO();

        if(dao.adminVali(username,password)){
            return SUCCESS;
        }else{
            this.addFieldError("adminLoginError",
                    "管理员账号或密码错误");
            return "adminLoginFail";
        }
    }


}
