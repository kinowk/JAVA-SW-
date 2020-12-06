package day1113;

public class replaceMethod {

	public void test() {
		// replace("찾을 문자", "변경할 문자"), replaceAll("찾을 문자", "변경할 문자")
		String message = "오늘도 ㅅㄱ하셨습니다.";
		System.out.println(message.replace("ㅅㄱ", "수고"));
	}

	public static void main(String[] args) {
		replaceMethod test = new replaceMethod();
		test.test();
	}// main

}// class
