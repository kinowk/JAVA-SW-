package day1113;

import java.text.DecimalFormat;

/**
 * 숫자를 지정한 문자열의 형식으로 만들 때
 * 
 * @author owner
 */
public class UseDecimalFormat {

	public UseDecimalFormat() {
		// # pattern - 해당 자리에 존재하는 데이터만 출력
		DecimalFormat df = new DecimalFormat("#,###,###"); // 2,020
		int i = 2020;
		System.out.println(df.format(i));

		// 0 pattern - 해당 자리에 데이터가 존재하면 값 출력, 존재하지 않으면 0 출력
		DecimalFormat df1 = new DecimalFormat("0,000,000"); // 0,002,020
		int i1 = 2020;
		System.out.println(df1.format(i1));

		// 실수 처리 - 소숫점이하 자릿수 설정
		DecimalFormat df2 = new DecimalFormat("#,###,###.###"); // 1.116
		double d = 1.115555511111;
		System.out.println(df2.format(d)); // 반올림

		DecimalFormat df3 = new DecimalFormat("#,###.00"); // 2,147,483,649.00
		long l = 2147483649L;
//		long l = 2_147_483_649L; // 가독성을 위해 '_'를 넣어 사용가능

		System.out.println(df3.format(l));

	}// UseDecimalFormat

	public static void main(String[] args) {
		new UseDecimalFormat();
	}// main

}// class
