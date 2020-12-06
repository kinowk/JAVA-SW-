package day1116;

import java.util.Calendar;

public class Homework2 {

	public void november() {
		Calendar cal = Calendar.getInstance(); // 날짜 정보 얻기

//		cal.get(Calendar.DAY_OF_MONTH);
//		cal.get(Calendar.DAY_OF_WEEK); // 1(SUN) ~ 7(SAT)

		cal.set(Calendar.DAY_OF_MONTH, 1); // DAY_OF_MONTH를 1일로 변경

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
		new Homework2().november();
	}

}
