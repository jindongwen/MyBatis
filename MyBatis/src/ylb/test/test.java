package ylb.test;
import ylb.dao.implement.FlowerDaoImple;
import java.sql.SQLException;

/*
 CREATE TABLE Flower(
	id int(4) PRIMARY KEY AUTO_INCREMENT,
	ename VARCHAR(55),
	price INT(5),
	production VARCHAR(55)
)
SELECT * FROM Flower
 */

public class test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        FlowerDaoImple f = new FlowerDaoImple();
        f.selectAll();
    }
}
