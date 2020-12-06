package day1111;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.MAX_VALUE;

/**
 * static import - 외부클래스에 존재하는 static variable(constant), static method를 클래스명 없이
 * 사용할 때
 * 
 * @author owner
 */
public class TesetStaticImport {

	public static void main(String[] args) {
		String s = "10";
		String s1 = "20";
		String s2 = "30";
		String s3 = "40";

//		int i = Integer.parseInt(s);
//		int i1 = Integer.parseInt(s1);
//		int i2 = Integer.parseInt(s2);
//		int i3 = Integer.parseInt(s3);

		int i = parseInt(s);
		int i1 = parseInt(s1);
		int i2 = parseInt(s2);
		int i3 = parseInt(s3);
		System.out.println(i + i1 + i2 + i3);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(MIN_VALUE);
		System.out.println(MAX_VALUE);

		String s4 = "50";

		int i4 = parseInt(s4);
		System.out.println(i4);

	}

}
