package day1118;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class work1117 {

	public static final int UNKNOWN_YEAR = 2;

	/**
	 * List에 데이터를 추가하고 반환하는 일
	 * 
	 * @return 프로그램, 주개발자, 개발년도
	 */
	public List<String> getList() {
		List<String> list = new ArrayList<String>(); // is a 관계의 객체화
		list.add("Java-James Gosling:1995");
		list.add("Oracle-Larry Ellison");
		list.add("Python-Guido van Rossum:1991");
		list.add("HTML-Tim Berners, LEE:1995");
		list.add("JavaScript-Brendan Eich");
		return list;
	}// getList

	public void printList(List<String> list) { // 처리된 데이터를 가진 리스트를 매개변수로 받아
		System.out.println("항목\t핵심개발자\t발표년도");
		System.out.println("---------------------------------------------------------");
		if (list.isEmpty()) { // 데이터가 없을 때
			System.out.println("처리된 데이터가 존재하지 않습니다.");
		} else { // 처리된 데이터가 존재할 때
			String data = null; // 반복중인 List의 현재 방 값을 저장
			StringTokenizer stk = null;
			int countToken = 0;
			for (int i = 0; i < list.size(); i++) {
				data = list.get(i);
				stk = new StringTokenizer(data, "-:");
				countToken = stk.countTokens(); // 기준 문자열로 구분된 Token의 수를 얻는다.
				while (stk.hasMoreTokens()) {
					System.out.printf("%s\t", stk.nextToken());
				} // while

				switch (countToken) {
				case UNKNOWN_YEAR:
					System.out.printf("%s", "알수없음");
				}

//				if (countToken == 2) {
//					System.out.printf("%s", "알수없음");
//				}
				countToken = 0;
				System.out.println();
			} // for
		} // if
	}// printList

	public static void main(String[] args) {
		work1117 work = new work1117();
		List<String> list = work.getList();
		work.printList(list);
	}// main

}// class
