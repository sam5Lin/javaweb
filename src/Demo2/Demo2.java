package Demo2;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;

/*
 * ���ݿ����ӳ�
 * �ز��������гز�������Ĭ��ֵ��
 */
public class Demo2 {
	@Test
	public void fun1() throws SQLException {
		/*
		 * 1.�������ӳض���
		 * 2.�����Ĵ����
		 * 3.���óز���
		 * 4.�õ����Ӷ���
		 */
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/a?serverTimezone=GMT%2B8&useSSL=false&rewriteBatchedStatements=true");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		
		dataSource.setMaxTotal(20);
		dataSource.setMinIdle(3);
		dataSource.setMaxWaitMillis(1000);
		
		
		Connection con = dataSource.getConnection();
		System.out.println(con.getClass().getName());
		dataSource.close();
	}
}
