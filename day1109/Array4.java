package day1109;

/**
 * 3차원 배열 - 면, 행, 열
 * 
 * @author owner
 */
public class Array4 {

	public void useArray4() {
		int[][][] arr = null;
		arr = new int[3][2][3];
		System.out.println("면의 개수 : " + arr.length);
		System.out.println("행의 개수 : " + arr[0].length);
		System.out.println("열의 개수 : " + arr[0][0].length);

		int[][][] arr1 = new int[4][3][2];
		System.out.println("면의 개수 : " + arr1.length);
		System.out.println("행의 개수 : " + arr1[0].length);
		System.out.println("열의 개수 : " + arr1[0][0].length);

		arr[0][0][0] = 10;
		arr[2][1][2] = 1000;

		System.out.println("arr[0][0][0] = " + arr[0][0][0]);
		System.out.println("arr[0][0][1] = " + arr[0][0][1]); // 자동 초기화
		System.out.println("arr[2][0][0] = " + arr[2][0][0]); // 자동 초기화
		System.out.println("arr[2][1][2] = " + arr[2][1][2]);

		for (int i = 0; i < arr.length; i++) { // 면
			System.out.println("arr[" + i + "] 면 시작");

			for (int j = 0; j < arr[i].length; j++) { // 행
				System.out.println("arr[" + i + "][" + j + "] 행 시작");

				for (int k = 0; k < arr[i][j].length; k++) { // 열
					System.out.printf("arr[%d][%d][%d] = %d\t", i, j, k, arr[i][j][k]);
				}

				System.out.println();
				System.out.println("arr[" + i + "][" + j + "] 행 끝");
			}

			System.out.println("arr[" + i + "] 면 끝");
		}

		System.out.println("------------------------------------------------------------------");

		int[][][] arr2 = { { { 1, 2 }, { 3, 4 }, { 5, 6 } }, { { 7, 8 }, { 9, 10 }, { 11, 12 } } }; // int[2][][]
		System.out.printf("arr2 배열 면의 수 : %d, 행의 수 : %d, 열의 수 : %d\n", arr2.length, arr2[0].length, arr2[0][0].length);

		for (int i = 0; i < arr2.length; i++) { // 면
			for (int j = 0; j < arr2[i].length; j++) { // 행
				for (int k = 0; k < arr2[i][j].length; k++) { // 열
					System.out.printf("arr[%d][%d][%d] : %d\t", i, j, k, arr2[i][j][k]);
				}
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		Array4 ar = new Array4();
		ar.useArray4();

	}

}
