package day1116;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set - 검색기능X, 중복 데이터 허용X, 순차적 입력X<br>
 * Iterator를 이용하여 출력
 * 
 * @author owner
 */
public class UseSet {

	public UseSet() {
		// 1. 생성
		Set<String> set = new HashSet<String>();

		// 2. 값 넣기
		System.out.println(set.size() + " / " + set);
		set.add("ㅓㅜㅑ");
		set.add("가불기");
		set.add("탈룰라");
		set.add("오지고");
		set.add("지리고");
		set.add("탈룰라"); // 중복 데이터 추가 X

		// 3. 값 삭제
		set.remove("가불기");
		System.out.println(set.size() + " / " + set);

		// 4. 검색 - Iterator
		Iterator<String> iterator = set.iterator(); // Iterator에 Set의 제어권을 넘겨준다.

		// 5. 출력
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); // 값을 얻고, 포인터를 넘긴다.
		}

	}// UseSet

	public static void main(String[] args) {
		new UseSet();
	}// main

}// class
