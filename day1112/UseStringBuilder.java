package day1112;

/**
 * StringBuffer, StringBuilder - 긴 문자열을 사용할 때 쓰는 class
 * 
 * @author owner
 */
public class UseStringBuilder {

	public void useStringBuffer() {
		StringBuffer sb = new StringBuffer(); // 객체생성 - 다른 class의 기능을 사용하기 위해 // MultiThread에서 동시접근 X ( 동기화 O ) - 느린 속도

//		append(); - 이어 붙이기
//		sb.append("오늘은 ");
//		sb.append(11);
//		sb.append("월 ");
//		sb.append(12);
//		sb.append("일"); // 오늘은 11월 12일
		sb.append("오늘은 ").append(11).append("월 ").append(12).append("일"); // method chain // 오늘은 11월 12일

		System.out.println(sb);

//		insert();
		sb.insert(4, "2020년 "); // 오늘은 2020년 11월 12일

//		delete(int start, int end); // endIndex + 1

		sb.delete(4, 5 + 1); // 오늘은 20년 11월 12일

//		reverse();
		sb.reverse(); // 일21 월11 년02 은늘오
		sb.reverse(); // 오늘은 20년 11월 12일

//		return StringBuffer

		System.out.println(sb);

		// StringBuffer -> String
		String str = sb.toString();

		System.out.println(str);
	}// useStringBuffer

	public void useStringBuilder() { // MultiThread에서 동시접근 O ( 동기화 X ) - 빠른 속도
		StringBuilder sb = new StringBuilder();

		// append();
		sb.append("오늘은 ");
		sb.append(11);
		sb.append("월 ");
		sb.append(12);
		sb.append("일"); // 오늘은 11월 12일

		// insert();
		sb.insert(4, "2020년 "); // 오늘은 2020년 11월 12일

		// delete(int start, int end); // endIndex + 1
		sb.delete(4, 5 + 1); // 오늘은 20년 11월 12일

		// reverse();
		sb.reverse(); // 일21 월11 년02 은늘오
		sb.reverse(); // 오늘은 20년 11월 12일

		// return StringBuilder

		System.out.println(sb);

		// StringBuilder -> String
		String str = sb.toString();
		System.out.println(str);
	}// useStringBuilder

	public static void main(String[] args) {

		UseStringBuilder usb = new UseStringBuilder();
		usb.useStringBuffer();
		System.out.println("------------------------------------------------------------------------");
		usb.useStringBuilder();

		// String(문자열)에 + 연산을 사용하면 Compiler가 + 연산을 StringBuilder로 변경
//		String str = "안녕";
//		str += "하세요.";
//		str += " 오늘은 목요일입니다.";
//		System.out.println(str);

//		String str = "\uC548\uB155";
//      str = (new StringBuilder(String.valueOf(str))).append("\uD558\uC138\uC694.").toString();
//      str = (new StringBuilder(String.valueOf(str))).append(" \uC624\uB298\uC740 \uBAA9\uC694\uC77C\uC785\uB2C8\uB2E4.").toString();

	}// main

}// class
