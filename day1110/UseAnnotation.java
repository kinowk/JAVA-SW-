package day1110;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * annotation사용
 * 
 * @author owner
 */
public class UseAnnotation {

	@Override // annotation : Override를 Compiler가 check
	public String toString() {
		return "나는 주소를 반환하기 싫어";
	}

	/**
	 * 정상동작을 기대하기 어려운 경우 설정하는 annotation 대체 class와 method 제시
	 * 
	 * @Deprecated
	 */
	@Deprecated
	public void test() {
		System.out.println("업무코드정의");
	}// test

	// unused - variable이 사용되지 않을 때 Warning 없애기
	// rawtypes - 데이터형의 안정성을 위해 Generic를 사용하는 문법을 권장하는데 Generic을 사용하지 않고 JCF를 사용해야할 때 Warning 없애기
	@SuppressWarnings({ "rawtypes", "unused" })
	public void temp() {
//		@SuppressWarnings("unused")
		int i;

//		@SuppressWarnings({ "rawtypes", "unused" })
		List l = null;
	}// temp

	public static void main(String[] args) {

		String str = new String("오늘은 화요일입니다.");
		System.out.println(str); // 주소X
		System.out.println(str.toString()); // Object.toString()를 Override하여 주소가 아니고 값이 나온다.
		UseAnnotation ua = new UseAnnotation();
		System.out.println(ua); // 주소 // Object.toString()를 Override 하지 않ㅇ아 Object이 제공하는 주소 형태가 문자열로 반환
		System.out.println(ua.toString()); // getClass().getName() + '@' + Integer.toHexString(hashCode())
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString()); // Object.toString()를 Override하여 주소가 아닌 메세지가 반환되어 나온다.
//		System.out.println(date.getYear() + 1900); //Deprecated - 비추천 method

		ua.test();
	}// main

}// class
