package day1030;

public class Homework {

	// 나이 구하기
	public int getAge(int birth) {
		int year = 2020;
		return year - birth + 1;
	}

	// 구구단 2단 출력
	public void print99dan2() {
		int i = 2;
		for (int j = 1; j < 10; j++) {
			System.out.println(i + " * " + j + " = " + i * j);
		}
	}

	// int형을 char형으로 출력
	public char returnChar(int i) {
		if ((i >= '0' && i <= '9') || (i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z')) { // '0' == 48, '9'== 57, 'A'==
																							// 65, 'Z' == 90, 'a' == 97,
																							// 'z' == 122
			return (char) i;
		} else {
			return '!';
		}
	}

	// 구구단 전체 출력
	public void print99danAll(int i) {
		if (i >= 2 && i <= 9) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		} else {
			System.out.println("구구단의 유효범위가 아닙니다.");
		}
	}

	// 자신의 이름 성 반환
	public char lastName() {
		return '박';
	}

	public static void main(String[] args) {
		Homework hw = new Homework(); // 객체화(인스턴스화 - instantiate)

		int age = hw.getAge(1994);
		System.out.println(age);
		System.out.println("----------------------------");

		hw.print99dan2();
		System.out.println("----------------------------");	

		char c = hw.returnChar(65);
		System.out.println(c);
		System.out.println("----------------------------");

		hw.print99danAll(10);
		System.out.println("----------------------------");

		char lastName = hw.lastName();
		System.out.println(lastName);
	}

}
