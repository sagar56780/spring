package database_config;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Coonnection {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Connection con=(Connection) ac.getBean("db");
		java.sql.Statement st=con.createStatement();	
		ResultSet rs=st.executeQuery("select * from student");
		while(rs.next())
		{
				System.out.println(	rs.getString(1));
		}
	}

}
