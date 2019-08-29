package Demo3;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class MyConnection implements Connection {
	private Connection con;
	
	public MyConnection(Connection con)
	{
		this.con = con;
	}
	
	@Override
	public boolean isWrapperFor(Class<?> arg0) throws SQLException {
		return con.isWrapperFor(arg0);
	}

	@Override
	public <T> T unwrap(Class<T> arg0) throws SQLException {
		return con.unwrap(arg0);
	}

	@Override
	public void abort(Executor arg0) throws SQLException {
		con.abort(arg0);
	}

	@Override
	public void clearWarnings() throws SQLException {
		con.clearWarnings();

	}

	@Override
	public void close() throws SQLException {
		System.out.println("นุต๔มห");
		con.close();

	}

	@Override
	public void commit() throws SQLException {
		con.commit();

	}

	@Override
	public Array createArrayOf(String arg0, Object[] arg1) throws SQLException {
		return con.createArrayOf(arg0, arg1);
	}

	@Override
	public Blob createBlob() throws SQLException {
		return con.createBlob();
	}

	@Override
	public Clob createClob() throws SQLException {
		return con.createClob();
	}

	@Override
	public NClob createNClob() throws SQLException {
		return con.createNClob();
	}

	@Override
	public SQLXML createSQLXML() throws SQLException {
		return con.createSQLXML();
	}

	@Override
	public Statement createStatement() throws SQLException {
		return con.createStatement();
	}

	@Override
	public Statement createStatement(int arg0, int arg1) throws SQLException {
		return con.createStatement(arg0, arg1);
	}

	@Override
	public Statement createStatement(int arg0, int arg1, int arg2) throws SQLException {
		return con.createStatement(arg0, arg1);
	}

	@Override
	public Struct createStruct(String arg0, Object[] arg1) throws SQLException {
		return con.createStruct(arg0, arg1);
	}

	@Override
	public boolean getAutoCommit() throws SQLException {
		return con.getAutoCommit();
	}

	@Override
	public String getCatalog() throws SQLException {
		return con.getCatalog();
	}

	@Override
	public Properties getClientInfo() throws SQLException {
		return con.getClientInfo();	
	}

	@Override
	public String getClientInfo(String arg0) throws SQLException {
		return con.getClientInfo(arg0);
	}

	@Override
	public int getHoldability() throws SQLException {
		return con.getHoldability();
	}

	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		return con.getMetaData();
	}

	@Override
	public int getNetworkTimeout() throws SQLException {
		return con.getNetworkTimeout();
	}

	@Override
	public String getSchema() throws SQLException {
		return con.getSchema();
	}

	@Override
	public int getTransactionIsolation() throws SQLException {
		return con.getTransactionIsolation();
	}

	@Override
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		return con.getTypeMap();
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		return con.getWarnings();
	}

	@Override
	public boolean isClosed() throws SQLException {
		return con.isClosed();
	}

	@Override
	public boolean isReadOnly() throws SQLException {
		return con.isReadOnly();
	}

	@Override
	public boolean isValid(int arg0) throws SQLException {
		return con.isValid(arg0);
	}

	@Override
	public String nativeSQL(String arg0) throws SQLException {
		return con.nativeSQL(arg0);
	}

	@Override
	public CallableStatement prepareCall(String arg0) throws SQLException {
		return con.prepareCall(arg0);
	}

	@Override
	public CallableStatement prepareCall(String arg0, int arg1, int arg2) throws SQLException {
		return con.prepareCall(arg0, arg1,arg2);
	}

	@Override
	public CallableStatement prepareCall(String arg0, int arg1, int arg2, int arg3) throws SQLException {
		return con.prepareCall(arg0,arg1,arg2,arg3);
	}

	@Override
	public PreparedStatement prepareStatement(String arg0) throws SQLException {
		return con.prepareStatement(arg0);
	}

	@Override
	public PreparedStatement prepareStatement(String arg0, int arg1) throws SQLException {
		return con.prepareStatement(arg0,arg1);
	}

	@Override
	public PreparedStatement prepareStatement(String arg0, int[] arg1) throws SQLException {
		return con.prepareStatement(arg0, arg1);
	}

	@Override
	public PreparedStatement prepareStatement(String arg0, String[] arg1) throws SQLException {
		return con.prepareStatement(arg0, arg1);
	}

	@Override
	public PreparedStatement prepareStatement(String arg0, int arg1, int arg2) throws SQLException {
		return con.prepareStatement(arg0, arg1,arg2);
	}

	@Override
	public PreparedStatement prepareStatement(String arg0, int arg1, int arg2, int arg3) throws SQLException {
		return con.prepareStatement(arg0, arg1, arg2, arg3);
	}

	@Override
	public void releaseSavepoint(Savepoint arg0) throws SQLException {
		con.releaseSavepoint(arg0);

	}

	@Override
	public void rollback() throws SQLException {
		con.rollback();

	}

	@Override
	public void rollback(Savepoint arg0) throws SQLException {
		con.rollback(arg0);

	}

	@Override
	public void setAutoCommit(boolean arg0) throws SQLException {
		con.setAutoCommit(arg0);

	}

	@Override
	public void setCatalog(String arg0) throws SQLException {
		con.setCatalog(arg0);

	}

	@Override
	public void setClientInfo(Properties arg0) throws SQLClientInfoException {
		con.setClientInfo(arg0);

	}

	@Override
	public void setClientInfo(String arg0, String arg1) throws SQLClientInfoException {
		con.setClientInfo(arg0, arg1);

	}

	@Override
	public void setHoldability(int arg0) throws SQLException {
		con.setHoldability(arg0);

	}

	@Override
	public void setNetworkTimeout(Executor arg0, int arg1) throws SQLException {
		con.setNetworkTimeout(arg0, arg1);
	}

	@Override
	public void setReadOnly(boolean arg0) throws SQLException {
		con.setReadOnly(arg0);
	}

	@Override
	public Savepoint setSavepoint() throws SQLException {
		return con.setSavepoint();
	}

	@Override
	public Savepoint setSavepoint(String arg0) throws SQLException {
		return con.setSavepoint(arg0);
	}

	@Override
	public void setSchema(String arg0) throws SQLException {
		con.setSchema(arg0);

	}

	@Override
	public void setTransactionIsolation(int arg0) throws SQLException {
		con.setTransactionIsolation(arg0);

	}

	@Override
	public void setTypeMap(Map<String, Class<?>> arg0) throws SQLException {
		con.setTypeMap(arg0);

	}

}
