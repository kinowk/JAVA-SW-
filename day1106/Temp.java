package day1106;

public class Temp {

	public static void main(String[] args) {
		int[] arr = { 87, 98, 19, 100, 78, 60 };

		// array¿« element¡ﬂ max value
		int maxValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		System.out.println(maxValue);

		// Sort Algorithm

		// int minValue = arr[0];
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}

	}
}
