package day1113;

import java.util.Random;

/**
 * ������ ������� class
 * 
 * @author owner
 */
public class UseRandom {

	public UseRandom() {
		// class ��üȭ
		Random random = new Random();

//		System.out.println(random);

		// method�� ȣ���Ͽ� ���� ��� ��

		// ���� ����
		int num = random.nextInt();
		System.out.println("���� : " + num); // ����, 0, ���
		System.out.println("����(%������) ���� : " + num % 10); // ����, 0, ���
		System.out.println("��� ���� ���� : " + Math.abs(num % 10));

		int num1 = random.nextInt(10); // 0 <= < 10
		System.out.println("����(nextInt(bound)) ���� : " + num1);

		// �Ǽ� ����
		// random.nextDouble() == Math.random()
		double num2 = random.nextDouble();
		System.out.println("���� : " + num2);
		System.out.println("���� ���� : " + num2 * 5);
		System.out.println("������ �������� ���� : " + (int) (num2 * 5));

		// Boolean ����
		boolean bool = random.nextBoolean();
		System.out.println(bool);
	}// UseRandom

	public static void main(String[] args) {
		new UseRandom();
	}// main

}// class
