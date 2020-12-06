package day1112;

public class Homework2 {

	public int[] lotto() {
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// 중복 없는 int[6] 생성 후 출력이 반복되어 새로운 int[6]을 생성 -> error
		// print method를 만들어 print
		for (int i = 0; i < new Homework2().lotto().length; i++) {
			System.out.printf("%d ", new Homework2().lotto()[i]);
		}

	}// main

}
