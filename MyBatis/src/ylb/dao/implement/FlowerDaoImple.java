package ylb.dao.implement;

import ylb.dao.FlowerDao;
import ylb.entity.Flower;

import java.sql.*;
import java.util.List;

public class FlowerDaoImple implements FlowerDao {
    @Override
    public List<Flower> selectAll() throws ClassNotFoundException, SQLException {

        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/mydb?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai";
        String userName = "root";
        String pwd = "123";
        Connection connection = DriverManager.getConnection(url,userName,pwd);
        String sql = "select * from Flower";
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs  =  stmt.executeQuery();
        while (rs.next()){
            rs.getInt("id");

        }

        return null;
    }
}
