package day1113;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 형식이 있는 날짜 정보를 사용할 때
 * 
 * @author owner
 */
public class UseDate {

	public UseDate() {
		// 시스템의 날짜
//		Date date = new Date();
//		System.out.println(date);

		// SimpleDateFormat - 사용자가 원하는 날짜 형식을 만들 수 있는 class
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh(HH, kk):mm:ss EEEE"); // OS의 언어로 제공
		// 년-월-일- 오전/오후 시(1~12) (시(0~23), 시(1~24)):분:초 요일

		// 다른 언어 - Locale class를 사용
		// new SimpleDateFormat("pattern', Locale.Constant);
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy a hh(HH):mm:ss EEE", Locale.KOREA);
		String formatDate = sdf.format(new Date()); // Date 객체를 전달받아 원하는 형식의 날짜 문자열을 반환
		System.out.println(formatDate);
	}// UseDate

	public static void main(String[] args) {
		new UseDate();
	}// main

}// class
