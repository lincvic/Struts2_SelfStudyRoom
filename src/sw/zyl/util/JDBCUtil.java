package sw.zyl.util;


import java.sql.*;


/**
 * Created by 王一疆 on 2017/11/21
 */
public class JDBCUtil {


    public static Connection getConnection() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classmanage",
                    "root", "qwerty123");
            return conn;
        } catch (Exception e) {
            throw new RuntimeException("连接数据库失败");
        }
    }

    public static void release(Connection conn, ResultSet rs, Statement statm) {

        //防止因为一个连接关闭失败而导致剩余链接无法关闭

        if (rs != null)
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        rs = null;

        if (statm != null)
            try {
                statm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        statm = null;

        if (conn != null)
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        conn = null;

    }
}
