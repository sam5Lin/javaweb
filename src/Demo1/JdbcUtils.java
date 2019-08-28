package Demo1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtils {
	private static Properties props = null;
	
	static{
		//���������ļ�	 
		try {
			InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("dbconfig.properties");
			props = new Properties();
			props.load(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		try {
			// ���������� 
			Class.forName(props.getProperty("driverClassName"));
		} catch (Exception e) {
			throw new RuntimeException();
		}
				
	}
	
	public static Connection getConnection() throws Exception {
		/*
		 * 1.���������ļ�
		 * 2.����������
		 * 3.����DriverManager.getConnection()
		 */
		
	
		
		// �õ�Connection
		return DriverManager.getConnection(props.getProperty("url"), 
				props.getProperty("username"), 
				props.getProperty("password"));
	}
}
