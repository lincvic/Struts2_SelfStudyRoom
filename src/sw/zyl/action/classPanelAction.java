package sw.zyl.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sw.zyl.dao.AdminDAO;
import sw.zyl.vo.Classroom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王一疆 on 2017/11/22
 */
public class classPanelAction extends ActionSupport implements ModelDriven<Classroom> {

    public Classroom room = new Classroom();
    public AdminDAO dao = new AdminDAO();
    public List<Classroom> roomList = new ArrayList<Classroom>();

    public String roomId;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public List<Classroom> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Classroom> roomList) {
        this.roomList = roomList;
    }

    @Override
    public Classroom getModel() {
        return room;
    }

    //新增自习室信息
    public String addRoom(){
        if(dao.roomEx(room.getId())){
            this.addFieldError("roomExError", "该教室已经存在");
            return "addRoomFail";
        }else{
            int rs = dao.addClass(room);
            if(rs!=0){
                return SUCCESS;
            }else{
                this.addFieldError("roomAddError", "添加教室失败，请检查数据库连接");
                return "addRoomFail";
            }
        }
    }

    //返回所有教室信息
    public String getAllRoom(){

        roomList = dao.queryClass();

        if(roomList.isEmpty()){
            this.addFieldError("roomEmptyError","数据库中没有自习室信息");
            return "getRoomFail";
        }else{
            return SUCCESS;
        }
    }

    //修改教室信息_跳转
    public String modiRoom_Jump(){

        Classroom roomById = dao.queryClassById(roomId);
        System.out.println(roomById.getId());
        ActionContext.getContext().getSession().put("roomById", roomById);

        return SUCCESS;
    }

    //修改教室信息
    public String modiRoom(){

        int rs = dao.modiClass(room);
        System.out.println(rs);

        if(rs!=0){
            return SUCCESS;
        }else{
            this.addFieldError("modiRoomError","修改教室信息失败，请检查数据库连接");
            return "modiRoomError";
        }
    }

    //删除教室信息
    public String delRoom(){

        int rs = dao.delClass(roomId);

        if(rs!=0){
            return SUCCESS;
        }else{
            this.addFieldError("delRoomError","删除教室失败，请检查数据库连接");
            return "delRoomFail";
        }
    }

    //返回所有教室信息给用户
    public String getAllRoomForStu(){

        roomList = dao.queryClass();

        if(roomList.isEmpty()){
            this.addFieldError("roomEmptyError","数据库中没有自习室信息");
            return "getRoomFail";
        }else{
            return SUCCESS;
        }
    }
}
