package day1028;

/**
 * for문 - 반복횟수를 알 때<br>
 * for(초기값; 조건식; 증감식){<br>
 * 실행문 }
 * 
 * @author owner
 */

public class UseFor {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello" + i);
		} // Hello 10번 출력

		for (int i = 0; i < 100; i++) {
			System.out.print(i + 1 + " ");
		} // 1 ~ 100까지 출력

		System.out.println();

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			} // 1 ~ 100 사이의 홀수 출력
		}

		System.out.println();

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		} // 1 ~ 100 사이의 짝수 출력

		for (int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + "= " + i * 2);
		}

		System.out.println();

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		// A ~ Z 출력

		System.out.println();
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println("1 ~ 100까지의 합 : " + sum);
	}
}
