package day1109;

/**
 * Variable Array - �ึ�� ���� ������ �ٸ� Array
 * 
 * @author owner
 */
public class VariableArray {

	public VariableArray() {
		int[][] arr = null;

		arr = new int[5][]; // variable array - 5��

		arr[0] = new int[5]; // �ڵ� �ʱ�ȭ
		arr[1] = new int[2];
		arr[2] = new int[] { 1, 2, 3, 4 }; // new int[] �����Ұ� / new int[*] <--- X
		arr[3] = new int[] { 10, 20, 30 };
		arr[4] = new int[] { 100, 200, 300, 400, 500, 600 };

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]�� ���� �� : %d\n", i, arr[i].length);
		}
		System.out.println("----------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
//				System.out.printf("arr[%d][%d] = %d\t", i, j, arr[i][j]);
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new VariableArray();
	}// main

}// class
