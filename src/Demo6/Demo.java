package Demo6;


import org.junit.Test;

import Jdbc.JdbcUtils;

public class Demo {
	@Test
	public void fun1() {
		addStu(new Stu(1,"ÁÖÃ¯É­","ÄÐ"));
	}
	
	public void addStu(Stu stu) {
		QR qr = new QR(JdbcUtils.getDataSource());
		String sql = "insert into stu values(?, ?, ?)";
		Object[] params = {stu.getId(), stu.getName(), stu.getSex()};;
		try {
			qr.update(sql, params);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
