package day1029;

/**
 * do{ 실행문 }while(조건식);
 * 
 * @author owner
 */
public class UseDoWhile {

	public static void main(String[] args) {
		int i = 100;

		do {
			System.out.println("i = " + i);
			i++;
		} while (i < 10);
		System.out.println("--------------------------------------------------------------------");

		// 1 ~ 100까지의 수 중에 4의 배수 합, 4의 배수 개수를 출력
		// while문
		int sum = 0;
		int count = 0;
		i = 1;
		while (i <= 100) {
			if (i % 4 == 0) {
				count++;
				sum += i;
			}
			i++;
		}
		System.out.println("1 ~ 100까지 4의 배수의 합 : " + sum + ", 4의 배수의 개수 : " + count);

		System.out.println("--------------------------------------------------------------------");
		// do-while문
		i = 1;
		sum = 0;
		count = 0;
		do {
			if (i % 4 == 0) {
				count++;
				sum += i;
			}
			i++;
		} while (i <= 100);
		System.out.println("1 ~ 100까지 4의 배수의 합 : " + sum + ", 4의 배수의 개수 : " + count);
	}

}
