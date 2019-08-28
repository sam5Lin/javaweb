package Demo1;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;



public class Demo1 {
	/*
	 * 
	 */
	public void transfer(String from, String to, double money) {
		Connection con = null;
		try {
			con = JdbcUtils.getConnection();
			con.setAutoCommit(false);
	
			AccountDao dao = new AccountDao();
			dao.updateBalance(con, from, -money);
			dao.updateBalance(con, to, money);
			
			//提交事务
			con.commit();
			con.close();
		} catch (Exception e) {
			//回滚事务
			try {
				con.rollback();
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	@Test
	public void fun1()  {
		transfer("lms","lmy",100);
	}
}
