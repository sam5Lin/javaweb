package Demo6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import Jdbc.JdbcUtils;

public class QR{
	private DataSource dataSource;

	public QR() {
		super();
	}

	private void initParams(PreparedStatement pstmt, Object... params) throws SQLException {
		for(int i = 1; i <= params.length; i++) {
			pstmt.setObject(i, params[i-1]);
		}
	}
	
	public QR(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int update(String sql, Object... params) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();	//通过连接池得到连接对象	
			pstmt = con.prepareStatement(sql);
			initParams(pstmt, params);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally {
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		}
	}
	
}