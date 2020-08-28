package system;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class Test01 {

	public static void main(String[] args) {
		String s1 = "abcde";
		System.out.println(s1.charAt(1));
		Date currentTime = new Date();
		System.out.println(currentTime);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println(sdf.format(currentTime));
		String DateStr = new String("2020-02-02 22:22:22");
		try {
			System.out.println(sdf.parse(DateStr));
		} catch (Exception e) {
			e.printStackTrace();
		}

		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.YEAR,2000);
		System.out.println(cal.get(Calendar.YEAR));
		cal.set(2011, 1, 13);
		System.out.println(cal.getTimeInMillis());
		cal.getTimeInMillis();// 毫秒

	}

	@Test
	public void test() {
		System.out.println("junit");
		int a = 1;
		double b = 0.1;
		Object c;
		c = a + b;
		System.out.println(c.getClass());
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		// 这里只是最简单的测试demo，暂不做容错处理
		return a / b;
	}

}
