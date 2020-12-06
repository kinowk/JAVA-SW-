package day1028;

public class Homework {

	public static void main(String[] args) {

		// homework1
		int num = Integer.parseInt(args[0]);
		if (num >= 2 && num <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
		} else {
			System.out.println("단은 2 ~ 9단으로 입력");
		}

		// homework2
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1 ~ 100 사이의 3의 배수의 합 : " + sum);

		// homework3
		for (char i = 0; i < 151; i++) {
			if (i >= '0' && i <= '9') {
				System.out.print(i + " ");
			}
			if (i >= 'A' && i <= 'Z') {
				System.out.print(i + " ");
			}
			if (i >= 'a' && i <= 'z') {
				System.out.print(i + " ");
			}

		}
	}

}
