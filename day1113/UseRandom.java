package day1113;

import java.util.Random;

/**
 * 난수를 얻기위한 class
 * 
 * @author owner
 */
public class UseRandom {

	public UseRandom() {
		// class 객체화
		Random random = new Random();

//		System.out.println(random);

		// method를 호출하여 난수 얻는 일

		// 정수 난수
		int num = random.nextInt();
		System.out.println("난수 : " + num); // 음수, 0, 양수
		System.out.println("범위(%연산자) 난수 : " + num % 10); // 음수, 0, 양수
		System.out.println("양수 범위 난수 : " + Math.abs(num % 10));

		int num1 = random.nextInt(10); // 0 <= < 10
		System.out.println("범위(nextInt(bound)) 난수 : " + num1);

		// 실수 난수
		// random.nextDouble() == Math.random()
		double num2 = random.nextDouble();
		System.out.println("난수 : " + num2);
		System.out.println("범위 난수 : " + num2 * 5);
		System.out.println("범위의 난수에서 정수 : " + (int) (num2 * 5));

		// Boolean 난수
		boolean bool = random.nextBoolean();
		System.out.println(bool);
	}// UseRandom

	public static void main(String[] args) {
		new UseRandom();
	}// main

}// class
