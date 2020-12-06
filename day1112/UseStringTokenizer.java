package day1112;

import java.util.StringTokenizer;

/**
 * String을 Token으로 자를 때
 * 
 * @author owner
 */
public class UseStringTokenizer {

	public UseStringTokenizer() {
		String str = "ㄴㅂㅂㅂㄸㅇ 오지고 지리고 렛잇고,와왕,앙냥냥,항냥냥냥";

//		StringTokenizer stk = new StringTokenizer(str); // 문자열을 공백으로 구분

//		StringTokenizer stk = new StringTokenizer(str, "고, "); // 문자열을 특정 String으로 구분, 기준 문자를 보호하지 않는다. // '고', ',', ' '를 기준으로 구분

		StringTokenizer stk = new StringTokenizer(str, "고, ", false); // true - 기준문자 보호, false - 기준문자 보호 X

		System.out.println("토큰의 수 : " + stk.countTokens()); // 4
//		System.out.println("토큰의 존재 : " + stk.hasMoreTokens()); // true
//		System.out.println("pointer가 존재하는 위치의 Token을 얻고, pointer를 다음 Token으로 이동 : "+stk.nextToken()); // ㄴㅂㅂㅂㄸㅇ
//		System.out.println("토큰의 수 : " + stk.countTokens()); // pointer가 이동하여 Token의 수 4 -> 3

		// while - 반복횟수를 알 수 없을 때 사용하는 반복문
		while (stk.hasMoreTokens()) { // 모든 Token 출력
			System.out.println(stk.nextToken());
		}
		System.out.println("---------------------------------------");
		// pointer가 지나감
		while (stk.hasMoreTokens()) { // 모든 Token 출력
			System.out.println(stk.nextToken());
		}
	}// UseStringTokenizer

	public void UseSplit() {
		String csvData = "Java,Oracle,JDBC,HTML.CSS,JavaScript";
		String[] subjectArray = csvData.split("J");
		// split은 '.'을 자를 수 없다. // '.'으로 자르려면 정규식 형태로 사용 ( csvData.split("[.]"); )

		System.out.println(subjectArray.length);

		for (int i = 0; i < subjectArray.length; i++) {
			System.out.println(subjectArray[i]);
		}
	}

	public static void main(String[] args) {
		new UseStringTokenizer();
		new UseStringTokenizer().UseSplit();
	}

}
