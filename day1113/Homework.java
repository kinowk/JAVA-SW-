package day1113;

import java.util.StringTokenizer;

public class Homework {

	// "봉천, 신림,신대방,대림.신도림, 문래,영등포구청, 당산,합정, 홍대 입구"
	public String[] arrStation(String station) {
		String[] arr = null;

		StringBuilder sb = new StringBuilder(station);
		sb.insert(station.indexOf("신대방") + 4, "구로디지털 단지,"); // return StringBuilder
//		String str = (sb.toString()).trim();
//		Returns a string whose value is this string, with any leading and trailing whitespace removed.
//		왼쪽, 오른쪽 필요없는 공백을 제거

		String str = (sb.toString()).replace(" ", "");

		StringTokenizer stk = new StringTokenizer(str, ",.");

		int i = stk.countTokens() - 1; // Array index
		arr = new String[stk.countTokens()];
		while (stk.hasMoreTokens()) {
			arr[i] = stk.nextToken();
			i--;
		}
		return arr;
	}

	public void printStationArr(String[] arr) {
		System.out.println("역 명");
		System.out.println("-----------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		Homework homework = new Homework();
		String[] station = homework.arrStation("봉천, 신림,신대방,대림.신도림, 문래,영등포구청, 당산,합정, 홍대 입구");
		homework.printStationArr(station);
	}

}
