package sw.zyl.dao;

import sw.zyl.util.JDBCUtil;
import sw.zyl.vo.Classroom;
import sw.zyl.vo.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王一疆 on 2017/11/21
 */
public class AdminDAO {

    Connection conn = JDBCUtil.getConnection();
    PreparedStatement pst = null;


    //管理员登陆校验
    public boolean adminVali(String username, String password) {
        try {
            String sql = "SELECT * FROM root WHERE username=? AND password=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    //学生登陆校验
    public boolean stuVali(String sno, String password) {
        try {

            String sql = "SELECT * FROM stu WHERE sno=? AND password=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, sno);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    //空教室是否存在？
    public boolean roomEx(String id) {
        try {

            String sql = "SELECT * FROM class WHERE id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    //管理员添加空教室信息
    public int addClass(Classroom room) {
        int rs = 0;
        try {
            String sql = " insert into class (blanktime,classno) VALUES (?,?) ";
            pst = conn.prepareStatement(sql);

            pst.setString(1, room.getBlanktime());
            pst.setString(2, room.getClassno());

            rs = pst.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;

    }

    //管理员删除空教室信息
    public int delClass(String roomId) {

        int rs = 0;

        try {

            String sql = "DELETE FROM class WHERE id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, roomId);
            rs = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;

    }

    //管理员修改空教室信息
    public int modiClass(Classroom room) {

        int rs = 0;

        try {

            String sql = "UPDATE class SET blanktime=?, classno=? WHERE id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, room.getBlanktime());
            pst.setString(2, room.getClassno());
            pst.setString(3, room.getId());
            rs = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;

    }

    //管理员按照ID查看教室
    public Classroom queryClassById(String roomId) {

        Classroom room = new Classroom();
        ResultSet rs = null;

        try {

            String sql = "SELECT * FROM class WHERE id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,roomId);
            rs = pst.executeQuery();

            while (rs.next()) {
                room.setId(rs.getString(1));
                room.setBlanktime(rs.getString(2));
                room.setClassno(rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return room;
    }

    //管理员查看空教室信息
    public List<Classroom> queryClass() {

        List<Classroom> list = new ArrayList<Classroom>();
        ResultSet rs = null;

        try {

            String sql = "SELECT * FROM class";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {

                Classroom room = new Classroom();
                room.setId(rs.getString(1));
                room.setBlanktime(rs.getString(2));
                room.setClassno(rs.getString(3));

                list.add(room);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    //管理员管理学生信息（管理员没有新建学生的权限）
    //管理员删除学生信息
    public int delStu(String stuId) {

        int rs = 0;

        try {

            String sql = "DELETE FROM stu WHERE id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, stuId);
            rs = pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;

    }

    //管理员修改学生信息
    public int modiStu(Student stu) {

        int rs = 0;

        try {

            String sql = "UPDATE stu SET sno=?, name=?, password=?, grade=?, email=?, phonenum=? WHERE id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, stu.getSno());
            pst.setString(2, stu.getName());
            pst.setString(3, stu.getPassword());
            pst.setString(4, stu.getGrade());
            pst.setString(5, stu.getEmail());
            pst.setString(6, stu.getPhonenum());
            pst.setString(7, stu.getId());
            rs = pst.executeUpdate();
            System.out.println(stu.getId());
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;

    }

    //管理员查看学生信息
    public List<Student> queryStu() {

        List<Student> list = new ArrayList<Student>();
        ResultSet rs = null;

        try {

            String sql = "SELECT * FROM stu";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {

                Student stu = new Student();
                stu.setId(rs.getString(1));
                stu.setSno(rs.getString(2));
                stu.setName(rs.getString(3));
                stu.setPassword(rs.getString(4));
                stu.setGrade(rs.getString(5));
                stu.setEmail(rs.getString(6));
                stu.setPhonenum(rs.getString(7));

                list.add(stu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    //用户注册
    public int addStu(Student stu) {
        int rs = 0;
        try {
            String sql = " insert into stu (sno, name, password, grade, email, phonenum) VALUES (?,?,?,?,?,?) ";
            pst = conn.prepareStatement(sql);

            pst.setString(1, stu.getSno());
            pst.setString(2, stu.getName());
            pst.setString(3, stu.getPassword());
            pst.setString(4, stu.getGrade());
            pst.setString(5, stu.getEmail());
            pst.setString(6, stu.getPhonenum());

            rs = pst.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;

    }

    //学生是否存在？
    public boolean stuEx(String sno) {
        try {

            String sql = "SELECT * FROM stu WHERE sno=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, sno);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    //按照id找出学生信息
    public Student queryStuByID(String stuId) {

        Student stu = new Student();
        ResultSet rs = null;

        try {

            String sql = "SELECT * FROM stu WHERE id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,stuId);
            rs = pst.executeQuery();

            while (rs.next()) {


                stu.setId(rs.getString(1));
                stu.setSno(rs.getString(2));
                stu.setName(rs.getString(3));
                stu.setPassword(rs.getString(4));
                stu.setGrade(rs.getString(5));
                stu.setEmail(rs.getString(6));
                stu.setPhonenum(rs.getString(7));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stu;
    }
}
