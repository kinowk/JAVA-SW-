package day1027;

/*
if-else
*/
class UseIfElse {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.print(num + "는 ");
		if (num >= 0) {
			System.out.print("양수");
		} else {
			System.out.print("음수");
		}
		if (num % 2 == 0) {
			System.out.println(" 짝수");
		} else {
			System.out.println(" 홀수");
		}

		int age = Integer.parseInt(args[1]);
		System.out.print(args[1] + "살은 ");
		if (age >= 19) {
			System.out.println("성년");
		} else {
			System.out.println("미성년");
		}

		int score = Integer.parseInt(args[2]);
		System.out.print(args[2] + "점은 ");
		if (score >= 0 && score <= 100) {
			System.out.println("유효점수");
		} else {
			System.out.println("잘못된 점수");
		}

		if (args[3].equals("Java") || args[3].equals("Python") || args[3].equals("C#")) {
			System.out.println("최근 OOP언어");
		} else {
			System.out.println("프로그래밍 언어");
		}

		long inputValue = Long.parseLong(args[4]);
		System.out.print(args[4] + "는 ");
		if (inputValue >= Integer.MIN_VALUE && inputValue <= Integer.MAX_VALUE) { // Integer.MIN_VALUE == -2147483648,
																					// Integer.MAX_VALUE == 2147483647
			System.out.println("int");
		} else {
			System.out.println("long");
		}
	}
}