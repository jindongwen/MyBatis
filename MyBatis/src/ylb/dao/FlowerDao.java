package ylb.dao;


import ylb.entity.Flower;
import java.sql.SQLException;
import java.util.List;

public interface FlowerDao {
    //查询所有花卉信息
    List<Flower> selectAll() throws ClassNotFoundException, SQLException;
}
