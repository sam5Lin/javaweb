package Demo4;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo4 {
	@Test
	public void fun1() throws PropertyVetoException, SQLException {
		//��������
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		//�Գؽ����Ĵ����������
		dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/a?serverTimezone=GMT%2B8&useSSL=false&rewriteBatchedStatements=true");
		dataSource.setUser("root");
		dataSource.setPassword("123456");
		
		//������
		dataSource.setAcquireIncrement(5);
		dataSource.setInitialPoolSize(20);
		dataSource.setMinPoolSize(2);
		dataSource.setMaxPoolSize(50);
		
		Connection con = dataSource.getConnection();
		System.out.println(con);
		con.close();
	}
	
	
	/*
	 * �����ļ���Ĭ������
	 */
	@Test
	public void fun2() throws PropertyVetoException, SQLException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		Connection con = dataSource.getConnection();
		System.out.println(con);
		con.close();
		
	}
	
	/*
	 * 
	 */
}
