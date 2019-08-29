package Demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Demo1.JdbcUtils;

public class AccountDao {
	public void updateBalance(Connection con, String name, double balance) {
		try {
			
			String sql = "update account set balance=balance+? where name=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setDouble(1, balance);
			pstmt.setString(2, name);
			
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
