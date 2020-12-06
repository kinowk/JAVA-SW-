package day1029;

/**
 * while문 - 0번 ~ 조건까지 반복
 * 
 * @author owner
 */
public class UseWhile {

	public static void main(String[] args) {
		int i = 0;

		while (i < 10) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("---------------------------");
		// 구구단 5단 출력
		int j = 1;
		while (j < 10) {
			System.out.println("5 * " + j + " = " + 5 * j);
			j++;
		}
		System.out.println("---------------------------");

		// 100에서부터 0까지 1씩 감소
		int k = 100;
		while (k >= 0) {
			System.out.println(k);
			k--;
		}

	}

}
