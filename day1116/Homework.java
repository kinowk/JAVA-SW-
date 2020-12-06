package day1116;

import java.util.Calendar;

public class Homework {

	public void november1() {
		Calendar cal = Calendar.getInstance();
		// 날짜 정보 얻기
		cal.get(Calendar.DAY_OF_MONTH);
//		cal.get(Calendar.DAY_OF_WEEK); // 1(SUN) ~ 7(SAT)

		cal.set(Calendar.DAY_OF_MONTH, 1); // DAY_OF_MONTH를 1일로 변경

		int day = cal.get(Calendar.DAY_OF_MONTH); // day - 1일
		int week = cal.get(Calendar.DAY_OF_WEEK); // week - 11월 1일의 요일에 대한 index -> 1 (SUNDAY)

		System.out.println("일\t월\t화\t수\t목\t금\t토");

		for (int j = 0; j < week - 1; j++) { // 첫째 주 시작 요일에 대한 \t
			System.out.printf("\t");
		}

		for (int i = 0; i < 30; i++) {
			System.out.printf("%d\t", day);
			day++;
			week++;
			if (week % 7 == 1) {
				System.out.println();
			}
		}
		System.out.println();

	}// november

	public void november2() {
		Calendar cal = Calendar.getInstance(); // 날짜 정보 얻기

//		cal.get(Calendar.DAY_OF_MONTH);
//		cal.get(Calendar.DAY_OF_WEEK); // 1(SUN) ~ 7(SAT)

//		cal.set(Calendar.DAY_OF_MONTH, 1); // DAY_OF_MONTH를 1일로 변경

		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int j = 0; j < cal.get(Calendar.DAY_OF_WEEK) - 1; j++) { // 첫째 주 시작 요일에 대한 \t
			System.out.printf("\t");
		}

		for (int i = 1; i < 31; i++) {
			cal.set(Calendar.DAY_OF_MONTH, i); // DAY_OF_MONTH 변경
			System.out.printf("%d\t", cal.get(Calendar.DAY_OF_MONTH));
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) { // 토요일인 경우
				System.out.println();
			}
		}

	}// november

	public static void main(String[] args) {
		new Homework().november1();
		new Homework().november2();
	}// main

}// class
