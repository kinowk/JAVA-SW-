package day1109;

/**
 * 3���� �迭 - ��, ��, ��
 * 
 * @author owner
 */
public class Array4 {

	public void useArray4() {
		int[][][] arr = null;
		arr = new int[3][2][3];
		System.out.println("���� ���� : " + arr.length);
		System.out.println("���� ���� : " + arr[0].length);
		System.out.println("���� ���� : " + arr[0][0].length);

		int[][][] arr1 = new int[4][3][2];
		System.out.println("���� ���� : " + arr1.length);
		System.out.println("���� ���� : " + arr1[0].length);
		System.out.println("���� ���� : " + arr1[0][0].length);

		arr[0][0][0] = 10;
		arr[2][1][2] = 1000;

		System.out.println("arr[0][0][0] = " + arr[0][0][0]);
		System.out.println("arr[0][0][1] = " + arr[0][0][1]); // �ڵ� �ʱ�ȭ
		System.out.println("arr[2][0][0] = " + arr[2][0][0]); // �ڵ� �ʱ�ȭ
		System.out.println("arr[2][1][2] = " + arr[2][1][2]);

		for (int i = 0; i < arr.length; i++) { // ��
			System.out.println("arr[" + i + "] �� ����");

			for (int j = 0; j < arr[i].length; j++) { // ��
				System.out.println("arr[" + i + "][" + j + "] �� ����");

				for (int k = 0; k < arr[i][j].length; k++) { // ��
					System.out.printf("arr[%d][%d][%d] = %d\t", i, j, k, arr[i][j][k]);
				}

				System.out.println();
				System.out.println("arr[" + i + "][" + j + "] �� ��");
			}

			System.out.println("arr[" + i + "] �� ��");
		}

		System.out.println("------------------------------------------------------------------");

		int[][][] arr2 = { { { 1, 2 }, { 3, 4 }, { 5, 6 } }, { { 7, 8 }, { 9, 10 }, { 11, 12 } } }; // int[2][][]
		System.out.printf("arr2 �迭 ���� �� : %d, ���� �� : %d, ���� �� : %d\n", arr2.length, arr2[0].length, arr2[0][0].length);

		for (int i = 0; i < arr2.length; i++) { // ��
			for (int j = 0; j < arr2[i].length; j++) { // ��
				for (int k = 0; k < arr2[i][j].length; k++) { // ��
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
