package day1117;

import java.util.Calendar;

public class Work1116 {

	public static final int START_DAY = 1;

	public Work1116() {

		int month = 2;
		Calendar calendar = Calendar.getInstance(); // 날짜 정보를 가진 객체 생성
		calendar.set(Calendar.MONTH, month - 1); // MONTH 변경
		calendar.set(Calendar.DAY_OF_MONTH, START_DAY); // MONTH 변경
		System.out.println((calendar.get(Calendar.MONTH) + 1) + "월");
		int lastDay = calendar.getActualMaximum(Calendar.DATE) + 1; // MONTH의 마지막 날

		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("---------------------------------------------------");

//		첫째 주 공백
//		switch (calendar.get(Calendar.DAY_OF_WEEK)) {
//		case Calendar.SATURDAY:
//			System.out.printf("\t");
//		case Calendar.FRIDAY:
//			System.out.printf("\t");
//		case Calendar.THURSDAY:
//			System.out.printf("\t");
//		case Calendar.WEDNESDAY:
//			System.out.printf("\t");
//		case Calendar.TUESDAY:
//			System.out.printf("\t");
//		case Calendar.MONDAY:
//			System.out.printf("\t");
//		case Calendar.SUNDAY:
//		}

//		첫째 주 	공백
//		for (int j = 0; j < calendar.get(Calendar.DAY_OF_WEEK) - 1; j++) { // 첫째 주 시작 요일에 대한 \t
//			System.out.printf("\t");
//		}

		for (int tempDay = 1; tempDay < lastDay; tempDay++) {
			calendar.set(Calendar.DAY_OF_MONTH, tempDay); // DAY_OF_MONTH 정보 변경
			switch (tempDay) {
			case START_DAY:
				for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%d\t", tempDay); // System.out.printf("%d\t", calendar.get(Calendar.DAY_OF_MONTH));
//			if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) { // 토요일마다 줄바꿈
//				System.out.println();
			switch (calendar.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SATURDAY:
				System.out.println();
			}
			// if문, switch문 선택 -> 값을 확인할 때 switch문
		}
	}

	public static void main(String[] args) {
		new Work1116();
	}// main

}// class
