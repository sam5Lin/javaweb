package Jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	/*
	 * ʹ�����ӳط���һ�����Ӷ���
	 */
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	
	/*
	 * ʹ�����ӳط���һ�����ӳض���
	 */
	public static DataSource getDataSource() {
		return dataSource;
	}


}
