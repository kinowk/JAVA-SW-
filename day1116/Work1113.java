package day1116;

import java.util.StringTokenizer;

public class Work1113 {

	public String[] stationProcess(String station) {
		String[] temp = null;
//		신대방이 존재하면 신대방 뒤에 구로디지털 단지 추가
		StringBuilder sbTemp = new StringBuilder(station);
		if (station.contains("신대방")) {
			sbTemp.insert(sbTemp.indexOf("신대방") + 4, "구로디지털 단지,");
		}
		station = sbTemp.toString();

//		공백 제거
		station = station.replaceAll(" ", "");

//		parameter로 입력된 데이터를 거꾸로 배열에 넣어 반환
//		입력데이터를 Token으로 구분
//		StringTokenizer - 여러 문자로 자를 수 있다. / String.split() - 한 문자로 자를 수 있다.
		StringTokenizer stk = new StringTokenizer(station, ",.");

//		Token으로 구분된 데이터를 저장할 배열 생성
		temp = new String[stk.countTokens()];
		int index = temp.length - 1; // first data를 last index에 넣기 위해
		while (stk.hasMoreTokens()) {
			temp[index] = stk.nextToken();
			index--;
		}
		return temp;
	}

	/**
	 * 입력받은 Array를 출력
	 * 
	 * @param station
	 */
	public void printStation(String[] station) {
		System.out.println("역 명");
		System.out.println("------------------------------------");
		for (int i = 0; i < station.length; i++) {
			System.out.println(station[i]);
		}
		System.out.println("------------------------------------");
	}

	public static void main(String[] args) {

//		객체화 - 5가지 방법
//		1. 클래스명 객체명 = new 생성자();
//		2. new 생성자();
//		3. new 생성자().method명();
//		4. 부모클래스명 객체명 = new 자식생성자(); (is a 관계 객체화) 
//		5. 바깥클래스명.안쪽클래스명 객체명 = instance명.new 안쪽클래스생성자(); (inner class 객체화)

		Work1113 work = new Work1113(); // 객체화 - static영역에서 instance영역의 variable, method를 호출하기 위해
		String station = "봉천, 신림,신대방,대림.신도림, 문래,영등포구청, 당산,합정, 홍대 입구"; // arguments
		String[] temp = work.stationProcess(station);
		work.printStation(temp);

	}// main

}// class
