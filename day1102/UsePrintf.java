package day1102;

/**
 * printf(); - variable arguments를 사용한 method
 * 
 * @author owner
 */
public class UsePrintf {

	public static void main(String[] args) {
		int age = 27;
		int year = 2020;
		// %d - decimal
		System.out.printf("%d살 올해는%d년\n", age, year);

		// %c - character
		System.out.printf("%c %c\n", 'A', '가');

		// %f - floating-point
		System.out.printf("%.2f %.1f\n", 2020.1102, 2020.1502); // 소숫점이하 n번째 자리에서 반올림

		// %s - string
		System.out.printf("%s %s\n", "오늘은", "월요일");

		// 자릿수 설정
		System.out.printf("[%4d] [%-5d]\n", 11, 15); // 4bit 오른쪽 정렬, 5bit 왼쪽 정렬
		System.out.printf("[%8.1f] [%-8.1f]\n", 12.345678, 12.345678); // 8bit 오른쪽 정렬, 8bit 왼쪽 정렬
		System.out.format("[%4d] [%-5d]\n", 11, 15);
		System.out.format("[%8.1f] [%-8.1f]\n", 12.345678, 12.345678);
	}

}
