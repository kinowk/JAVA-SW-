package day1116;

import java.util.Calendar;

public class Homework {

	public void november1() {
		Calendar cal = Calendar.getInstance();
		// ��¥ ���� ���
		cal.get(Calendar.DAY_OF_MONTH);
//		cal.get(Calendar.DAY_OF_WEEK); // 1(SUN) ~ 7(SAT)

		cal.set(Calendar.DAY_OF_MONTH, 1); // DAY_OF_MONTH�� 1�Ϸ� ����

		int day = cal.get(Calendar.DAY_OF_MONTH); // day - 1��
		int week = cal.get(Calendar.DAY_OF_WEEK); // week - 11�� 1���� ���Ͽ� ���� index -> 1 (SUNDAY)

		System.out.println("��\t��\tȭ\t��\t��\t��\t��");

		for (int j = 0; j < week - 1; j++) { // ù° �� ���� ���Ͽ� ���� \t
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
		Calendar cal = Calendar.getInstance(); // ��¥ ���� ���

//		cal.get(Calendar.DAY_OF_MONTH);
//		cal.get(Calendar.DAY_OF_WEEK); // 1(SUN) ~ 7(SAT)

//		cal.set(Calendar.DAY_OF_MONTH, 1); // DAY_OF_MONTH�� 1�Ϸ� ����

		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for (int j = 0; j < cal.get(Calendar.DAY_OF_WEEK) - 1; j++) { // ù° �� ���� ���Ͽ� ���� \t
			System.out.printf("\t");
		}

		for (int i = 1; i < 31; i++) {
			cal.set(Calendar.DAY_OF_MONTH, i); // DAY_OF_MONTH ����
			System.out.printf("%d\t", cal.get(Calendar.DAY_OF_MONTH));
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) { // ������� ���
				System.out.println();
			}
		}

	}// november

	public static void main(String[] args) {
		new Homework().november1();
		new Homework().november2();
	}// main

}// class
