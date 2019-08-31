package Demo6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import Jdbc.JdbcUtils;

/*
 * commons-dbutils
 * ¼ò»¯jdbcµÄ´úÂë!
 */
public class Demo6 {
	@Test
	public void addStu(Stu stu) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtils.getConnection();
			String sql = "insert into stu values(?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, stu.getId());
			pstmt.setString(2, stu.getName());
			pstmt.setString(3, stu.getSex());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			
		}finally {
			
		}
	}
	
	@Test
	public void UpdateStu(Stu stu) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtils.getConnection();
			String sql = "update stu set id=? ,name=?, sex=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, stu.getId());
			pstmt.setString(2, stu.getName());
			pstmt.setString(3, stu.getSex());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			
		}finally {
			
		}
	}
	
	@Test
	public void deleteStu(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtils.getConnection();
			String sql = "delete from stu where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			pstmt.executeUpdate();
		} catch (Exception e) {
			
		}finally {
			
		}
	}
	
	public Stu load(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = JdbcUtils.getConnection();
			String sql = "select * from stu where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();
			if(!rs.next()) return null;
			
			Stu stu =new Stu(1,"1","1");
			stu.setId(id);
			
			return stu;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally {
			
		}
	}
}
