package com.ylb.test;
/*
 CREATE TABLE Flower(
	id int(4) PRIMARY KEY AUTO_INCREMENT,
	ename VARCHAR(55),
	price INT(5),
	production VARCHAR(55)
)
SELECT * FROM Flower
 */

import com.ylb.entity.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        // 解析 MyBatis.xml 文件
        InputStream asStream = Resources.getResourceAsStream("myBatis.xml");

        //获得 session 工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(asStream);

        //获取 Sqlsession 对象
        SqlSession sqlSession = factory.openSession();

        //调用方法  mapper文件中的命名空间中的id
        List<Flower> objects = sqlSession.selectList("a.b.selectAll");
        System.out.println(objects);

        //关闭资源
        sqlSession.close();
    }
}
