package day1113;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

/**
 * Calendar - 하나의 날짜 정보
 * 
 * @author owner
 */
public class UseCalendar {

	public UseCalendar() {
		// 객체생성
//		Calendar calendar = new Calendar(); // abstract class - 객체화 X
		Calendar cal = new GregorianCalendar(); // is a 관계
		Calendar cal1 = Calendar.getInstance(); // method
		System.out.println(cal);
		System.out.println(cal1);

//		System.out.println(cal1.get(Calendar.YEAR)); // constant - 가독성

		int year = cal1.get(Calendar.YEAR);
		int month = cal1.get(Calendar.MONTH) + 1; // calendar.get(Calendar.MONTH) - 0 1 2 3 4 5 6 7 8 9 10 11
		int day = cal1.get(Calendar.DAY_OF_MONTH);

		int hour = cal1.get(Calendar.HOUR); // HOUR - 12hour clock (0 - 11)
		int hour24 = cal1.get(Calendar.HOUR_OF_DAY); // HOUR_OF_DAY - 24hour clock

		int am_pm = cal1.get(Calendar.AM_PM); // 0(오전), 1(오후)
//		String str = am_pm == Calendar.AM ? "오전" : "오후";
		String str = cal1.get(Calendar.AM_PM) == Calendar.AM ? "오전" : "오후";
		String[] amArr = { "오전", "오후" };

		// Ctrl + Shift + y -> 소문자로 변환, Ctrl + Shift + x -> 대문자로 변환
		int minute = cal1.get(Calendar.MINUTE);

		int second = cal1.get(Calendar.SECOND);

		int week = cal1.get(Calendar.DAY_OF_WEEK); // 1(SUNDAY) 2(MONDAY) 3(TUESDAY) 4(WEDNESDAY) 5(THURSDAY) 6(FRIDAY)
													// 7(SATURDAY)
		String[] weekTitle = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" }; // weekTitle[week - 1]
		// if문, switch문 또한 가능

		String temp = "일,월,화,수,목,금,토";
		// CSV Data -> 규칙적 -> String class의 split()
		// CSV Data -> 불규칙 -> StringTokenizer
		String[] tempWeek = temp.split(","); // return String[]

		// 1. 배열로 직접 생성, 2. 문자열 CSV Data를 split을 사용하여 배열 생성

		System.out.println(year + "-" + month + "-" + day + " " + amArr[cal1.get(Calendar.AM_PM)] + " " + hour + "시 "
				+ minute + "분 " + second + "초 " + tempWeek[cal1.get(Calendar.DAY_OF_WEEK) - 1]);

	}// UseCalendar

	/**
	 * set method를 사용한 날짜 변경
	 */
	public void calendarSet() {
		Calendar cal = Calendar.getInstance();

		// YEAR 변경 020년 -> 2021년
		cal.set(Calendar.YEAR, 2021);
		// MONTH 변경 11월 -> 3월
		cal.set(Calendar.MONTH, 2); // MONTH - 0 ~ 11
		// DAY_OF_MONTH 변경 13일 -> 31일
		cal.set(Calendar.DAY_OF_MONTH, 31);

		System.out.println(cal.get(Calendar.YEAR) + " - " + (cal.get(Calendar.MONTH) + 1) + " - "
				+ cal.get(Calendar.DAY_OF_MONTH) + " " + "일,월,화,수,목,금,토".split(",")[cal.get(Calendar.DAY_OF_WEEK) - 1]);
	}

	public static void main(String[] args) {
		UseCalendar uc = new UseCalendar();
		System.out.println("---------------------------------------------------------------------------------");
		uc.calendarSet();

	}// main

}// class
