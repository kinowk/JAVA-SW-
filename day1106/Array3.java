package day1106;

public class Array3 {

	public void borderTable() {
		int[][] arr = new int[5][6];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				}
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * 이차원 배열에 구구단
	 * 
	 * @return 구구단
	 */
	public String[][] multiplicaion() {
		String[][] multiplication = new String[8][9];
		for (int i = 0; i < multiplication.length; i++) {
			for (int j = 0; j < multiplication[i].length; j++) {
				multiplication[i][j] = (i + 2) + " * " + (j + 1) + " = " + ((i + 2) * (j + 1));
			}
		}
		return multiplication;
	}

	public static void main(String[] args) {
		Array3 ar3 = new Array3();
		String[][] multiplication = ar3.multiplicaion();
		for (int i = 0; i < multiplication.length; i++) {
			for (int j = 0; j < multiplication[i].length; j++) {
				System.out.printf(multiplication[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------");
		ar3.borderTable();
		System.out.println("--------------------------------------------------");
		
	}

}
