package Demo2;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;

/*
 * 数据库连接池
 * 池参数（所有池参数都有默认值）
 */
public class Demo2 {
	@Test
	public void fun1() throws SQLException {
		/*
		 * 1.创建连接池对象
		 * 2.配置四大参数
		 * 3.配置池参数
		 * 4.得到连接对象
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
