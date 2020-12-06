package day1105;

/**
 * row, column으로 구성되는 이차원 array
 * 
 * @author owner
 */
public class Array2 {

	public static final int ROW_ONE = 1;

	public void useArray2() {
		int[][] arr1 = new int[2][3];
		int[][] arr2 = new int[4][5];

		System.out.printf("arr1 배열은 %d행 %d열\n", arr1.length, arr1[0].length);
		System.out.printf("arr2 배열은 %d행 %d열\n", arr2.length, arr2[0].length);

		arr1[0][0] = 2020;
		arr1[1][2] = 39;
		arr2[0][1] = 10;
		arr2[1][4] = 20;
		arr2[2][0] = 30;
		arr2[3][2] = 40;
		System.out.printf("arr1[0][0] = %d, arr[0][1] = %d\n", arr1[0][0], arr1[0][1]);
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("arr2[%d][%d] = %-4d", i, j, arr2[i][j]);
			}
			System.out.println();
		}
	}

	public void array2Init() {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, };
		int rowSum0 = 0;
		System.out.println("arr배열은 " + arr.length + "행, " + arr[0].length + "열");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("arr[%d][%d] = %d\t", i, j, arr[i][j]);
				switch (i) { // 1행의 합 구하기
				case ROW_ONE:
					rowSum0 += arr[i][j];
				}
			}
			System.out.println();
		}
		// 1행의 합 구하기
//		for (int i = 0; i < arr[1].length; i++) {
//			rowSum0 += arr[1][i];
//		}
		System.out.println("arr배열의 1행의 합 : " + rowSum0);
	}

	public static void main(String[] args) {
		Array2 ar2 = new Array2();
		ar2.useArray2();
		ar2.array2Init();
	}

}
