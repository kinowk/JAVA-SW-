package day1029;

/**
 * 향상된 for문<br>
 * index를 사용할 수 없고, array, list, set의 처음부터 끝까지 출력할 때 사용
 * 
 * @author owner
 */
public class ImprovementFor {

	public static void main(String[] args) {
		int[] arr = { 2020, 10, 29, 12, 7 };
		// 향상된 for문
		for (int tmp : arr) {
			System.out.println(tmp);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
