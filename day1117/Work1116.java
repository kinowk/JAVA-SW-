package day1117;

import java.util.Calendar;

public class Work1116 {

	public static final int START_DAY = 1;

	public Work1116() {

		int month = 2;
		Calendar calendar = Calendar.getInstance(); // ��¥ ������ ���� ��ü ����
		calendar.set(Calendar.MONTH, month - 1); // MONTH ����
		calendar.set(Calendar.DAY_OF_MONTH, START_DAY); // MONTH ����
		System.out.println((calendar.get(Calendar.MONTH) + 1) + "��");
		int lastDay = calendar.getActualMaximum(Calendar.DATE) + 1; // MONTH�� ������ ��

		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("---------------------------------------------------");

//		ù° �� ����
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

//		ù° �� 	����
//		for (int j = 0; j < calendar.get(Calendar.DAY_OF_WEEK) - 1; j++) { // ù° �� ���� ���Ͽ� ���� \t
//			System.out.printf("\t");
//		}

		for (int tempDay = 1; tempDay < lastDay; tempDay++) {
			calendar.set(Calendar.DAY_OF_MONTH, tempDay); // DAY_OF_MONTH ���� ����
			switch (tempDay) {
			case START_DAY:
				for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%d\t", tempDay); // System.out.printf("%d\t", calendar.get(Calendar.DAY_OF_MONTH));
//			if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) { // ����ϸ��� �ٹٲ�
//				System.out.println();
			switch (calendar.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SATURDAY:
				System.out.println();
			}
			// if��, switch�� ���� -> ���� Ȯ���� �� switch��
		}
	}

	public static void main(String[] args) {
		new Work1116();
	}// main

}// class
