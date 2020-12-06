package day1113;

import java.util.StringTokenizer;

public class Work1112 {

	/**
	 * CSV Data를 Token으로 분리하여 배열에 담는 일
	 * 
	 * @return
	 */
	public String[] csvprocess() {
		String[] stationArr = null;
		String station = "봉천,신림,신대방.구로디지털단지,대림.신도림,문래,영등포구청,당산,합정,홍대입구";

		// 하나의 문자열에서 특정 문자로 분리할 수 있는 class생성 (StringTokenizer)

		// StringTokenizer stk = new StringTokenizer(station, ",.", false);
		StringTokenizer stk = new StringTokenizer(station, ",."); // 11개의 Token - 봉천 신림 신대방 ,,, 합정 홍대입구

		// new String[Token의 개수] - 동적 할당
		stationArr = new String[stk.countTokens()]; // stk.countTokens() == 11

		// Token의 존재여부 확인 후 Token을 String[]에 저장
		int i = 0;
		while (stk.hasMoreTokens()) {
			stationArr[i] = stk.nextToken();
			i++;
		}
		return stationArr;
	}// csvProcess

	public void printarray(String[] stationArr) {
		int count = 0;

		System.out.println("역명");
		System.out.println("----------------------------");
		for (int i = 0; i < stationArr.length; i++) {
			System.out.println(stationArr[i]);
			// startsWith(String prefix) - return boolean // Tests if this string starts
			// with the specified prefix.
			if (stationArr[i].startsWith("신")) { // "신"으로 시작하는 역의 개수
				count++;
			}
		}
		System.out.println("----------------------------");
		System.out.printf("정거장 수 : [%d]개, '신'으로 시작하는 역의 개수 [%d]개\n", stationArr.length, count);
	}// printArray\

	public int[] lottoProcess() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break; // 가장 가까운 반복문 탈출
				}
			}
		}
		return arr;
	}

	public int[] lotto() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;// 가장 가까운 반복문 탈출
				}
			}
		}
		return arr;
	}

	public void printLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%-4d", lotto[i]);

		}
	}

	public static void main(String[] args) {
		Work1112 work = new Work1112();
		work.printarray(work.csvprocess());
		System.out.println("---------------------------------------------");
		work.printLotto(work.lottoProcess());
		System.out.println("");

	}// main

}// class
