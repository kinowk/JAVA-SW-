package day1113;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

/**
 * Calendar - �ϳ��� ��¥ ����
 * 
 * @author owner
 */
public class UseCalendar {

	public UseCalendar() {
		// ��ü����
//		Calendar calendar = new Calendar(); // abstract class - ��üȭ X
		Calendar cal = new GregorianCalendar(); // is a ����
		Calendar cal1 = Calendar.getInstance(); // method
		System.out.println(cal);
		System.out.println(cal1);

//		System.out.println(cal1.get(Calendar.YEAR)); // constant - ������

		int year = cal1.get(Calendar.YEAR);
		int month = cal1.get(Calendar.MONTH) + 1; // calendar.get(Calendar.MONTH) - 0 1 2 3 4 5 6 7 8 9 10 11
		int day = cal1.get(Calendar.DAY_OF_MONTH);

		int hour = cal1.get(Calendar.HOUR); // HOUR - 12hour clock (0 - 11)
		int hour24 = cal1.get(Calendar.HOUR_OF_DAY); // HOUR_OF_DAY - 24hour clock

		int am_pm = cal1.get(Calendar.AM_PM); // 0(����), 1(����)
//		String str = am_pm == Calendar.AM ? "����" : "����";
		String str = cal1.get(Calendar.AM_PM) == Calendar.AM ? "����" : "����";
		String[] amArr = { "����", "����" };

		// Ctrl + Shift + y -> �ҹ��ڷ� ��ȯ, Ctrl + Shift + x -> �빮�ڷ� ��ȯ
		int minute = cal1.get(Calendar.MINUTE);

		int second = cal1.get(Calendar.SECOND);

		int week = cal1.get(Calendar.DAY_OF_WEEK); // 1(SUNDAY) 2(MONDAY) 3(TUESDAY) 4(WEDNESDAY) 5(THURSDAY) 6(FRIDAY)
													// 7(SATURDAY)
		String[] weekTitle = { "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" }; // weekTitle[week - 1]
		// if��, switch�� ���� ����

		String temp = "��,��,ȭ,��,��,��,��";
		// CSV Data -> ��Ģ�� -> String class�� split()
		// CSV Data -> �ұ�Ģ -> StringTokenizer
		String[] tempWeek = temp.split(","); // return String[]

		// 1. �迭�� ���� ����, 2. ���ڿ� CSV Data�� split�� ����Ͽ� �迭 ����

		System.out.println(year + "-" + month + "-" + day + " " + amArr[cal1.get(Calendar.AM_PM)] + " " + hour + "�� "
				+ minute + "�� " + second + "�� " + tempWeek[cal1.get(Calendar.DAY_OF_WEEK) - 1]);

	}// UseCalendar

	/**
	 * set method�� ����� ��¥ ����
	 */
	public void calendarSet() {
		Calendar cal = Calendar.getInstance();

		// YEAR ���� 020�� -> 2021��
		cal.set(Calendar.YEAR, 2021);
		// MONTH ���� 11�� -> 3��
		cal.set(Calendar.MONTH, 2); // MONTH - 0 ~ 11
		// DAY_OF_MONTH ���� 13�� -> 31��
		cal.set(Calendar.DAY_OF_MONTH, 31);

		System.out.println(cal.get(Calendar.YEAR) + " - " + (cal.get(Calendar.MONTH) + 1) + " - "
				+ cal.get(Calendar.DAY_OF_MONTH) + " " + "��,��,ȭ,��,��,��,��".split(",")[cal.get(Calendar.DAY_OF_WEEK) - 1]);
	}

	public static void main(String[] args) {
		UseCalendar uc = new UseCalendar();
		System.out.println("---------------------------------------------------------------------------------");
		uc.calendarSet();

	}// main

}// class
