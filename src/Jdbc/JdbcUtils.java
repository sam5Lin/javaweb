package Jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	/*
	 * 使用连接池返回一个连接对象
	 */
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	
	/*
	 * 使用连接池返回一个连接池对象
	 */
	public static DataSource getDataSource() {
		return dataSource;
	}


}
