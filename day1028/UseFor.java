package day1028;

/**
 * for�� - �ݺ�Ƚ���� �� ��<br>
 * for(�ʱⰪ; ���ǽ�; ������){<br>
 * ���๮ }
 * 
 * @author owner
 */

public class UseFor {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello" + i);
		} // Hello 10�� ���

		for (int i = 0; i < 100; i++) {
			System.out.print(i + 1 + " ");
		} // 1 ~ 100���� ���

		System.out.println();

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			} // 1 ~ 100 ������ Ȧ�� ���
		}

		System.out.println();

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		} // 1 ~ 100 ������ ¦�� ���

		for (int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + "= " + i * 2);
		}

		System.out.println();

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		// A ~ Z ���

		System.out.println();
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println("1 ~ 100������ �� : " + sum);
	}
}
