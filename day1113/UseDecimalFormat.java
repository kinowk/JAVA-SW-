package day1113;

import java.text.DecimalFormat;

/**
 * ���ڸ� ������ ���ڿ��� �������� ���� ��
 * 
 * @author owner
 */
public class UseDecimalFormat {

	public UseDecimalFormat() {
		// # pattern - �ش� �ڸ��� �����ϴ� �����͸� ���
		DecimalFormat df = new DecimalFormat("#,###,###"); // 2,020
		int i = 2020;
		System.out.println(df.format(i));

		// 0 pattern - �ش� �ڸ��� �����Ͱ� �����ϸ� �� ���, �������� ������ 0 ���
		DecimalFormat df1 = new DecimalFormat("0,000,000"); // 0,002,020
		int i1 = 2020;
		System.out.println(df1.format(i1));

		// �Ǽ� ó�� - �Ҽ������� �ڸ��� ����
		DecimalFormat df2 = new DecimalFormat("#,###,###.###"); // 1.116
		double d = 1.115555511111;
		System.out.println(df2.format(d)); // �ݿø�

		DecimalFormat df3 = new DecimalFormat("#,###.00"); // 2,147,483,649.00
		long l = 2147483649L;
//		long l = 2_147_483_649L; // �������� ���� '_'�� �־� ��밡��

		System.out.println(df3.format(l));

	}// UseDecimalFormat

	public static void main(String[] args) {
		new UseDecimalFormat();
	}// main

}// class
