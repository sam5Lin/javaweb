package Demo5;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Demo5 {
	@Test
	public void fun1() {
		ThreadLocal<String> tl = new ThreadLocal<String>();
		//tl.set("hello");//��
		//System.out.println(tl.get());
		
		new Thread() {
			public void run() {
				tl.set("�ڲ����");
				System.out.println("���� " + tl.get());
			}
		}.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tl.set("�Ұ���");
		System.out.println("�ⲿ���� " + tl.get());
	}
}


class TL<T>{
	private Map<Thread, T> map = new HashMap<Thread, T>();
	
	public void set(T data) {
		map.put(Thread.currentThread(), data);
	}
	
	public T get() {
		return map.get(Thread.currentThread());
	}
	
	public void remove() {
		map.remove(Thread.currentThread());
	}
}
