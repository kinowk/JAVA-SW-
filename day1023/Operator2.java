package day1023;

/*
+, -, *, /, %
*/
class Operator2 {
	public static void main(String[] args) {
		int i = 10;
		int j = 3;
		System.out.println(i + " / " + j + " = " + i / j);

		System.out.println(i + " % 3 = " + i % 3); // Java에서의 %는 음수인 나머지 출력 O

		int temp = 1994;
		System.out.println(temp % 12);
	}
}
