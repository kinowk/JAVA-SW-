package day1029;

/**
 * ���� for��<br>
 * index�� ����� �� ����, array, list, set�� ó������ ������ ����� �� ���
 * 
 * @author owner
 */
public class ImprovementFor {

	public static void main(String[] args) {
		int[] arr = { 2020, 10, 29, 12, 7 };
		// ���� for��
		for (int tmp : arr) {
			System.out.println(tmp);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
