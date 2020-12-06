package day1105;

public class Array1 {
	public Array1() {
		int[] arr = null;
		int arr1[] = null;

		arr = new int[3];
		arr1 = new int[4];

		System.out.printf("arr배열의 방의 개수 %d\n", arr.length);
		System.out.printf("arr1배열의 방의 개수 %d\n", arr1.length);

		arr[0] = 2020;
		arr[1] = 11;
		arr[2] = 5;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %-5d\n", i, arr[i]);
		}

		// array 자동초기화
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
	}

	/**
	 * array를 기본형 형식으로 사용
	 */
	public void useArray1() {
		System.out.println("-----------------------------");

		int[] arr = { 10, 100, 1000, 10000, 100000 }; // 값의 개수에 의해 배열의 길이가 자동으로 결정
		arr[1] = 500;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %-10d\n", i, arr[i]);
		}

		String[] name = { "장하권", "김건부", "허수", "장용준", "조건희", "이현우", "김강현" };
		int[] score = { 82, 70, 96, 85, 79, 68, 48 };
		System.out.printf("번호\t이름\t점수\t학점\n");
		System.out.println("-----------------------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%d\t%s\t%d\t%s\n", i + 1, name[i], score[i], grade(score[i]));
		}
		System.out.println("-----------------------------------");
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.printf("응시인원[%d] 총점[%d] 평균[%.2f]\n", name.length, sum, (double) sum / name.length);
	}

	public String grade(int score) {
		if (score >= 95) {
			return "A+";
		} else if (score >= 90) {
			return "A";
		} else if (score >= 85) {
			return "B+";
		} else if (score >= 80) {
			return "B";
		} else if (score >= 75) {
			return "C+";
		} else if (score >= 70) {
			return "C";
		} else {
			return "F";
		}
	}

	public static void main(String[] args) {
		/*
		 * Array1 ar = new Array1(); ar.useArray1();
		 */
		new Array1();
		new Array1().useArray1();
	}

}
