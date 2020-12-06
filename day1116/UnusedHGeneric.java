package day1116;

import java.util.ArrayList;
import java.util.List;

public class UnusedHGeneric {

	public UnusedHGeneric() {
		// JDK 1.4 까지 문법 ( Generic이 지원되지 않을 때 ) - 모든 값을 List에 저장
		// 1. 생성
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
//		System.out.println(list.size());
		// 2. 값 추가 ( Generic을 사용하지 않으면 모든 값을 추가할 수 있다. )
		list.add(10);
		list.add(20);
		list.add(20.11); // Generic을 사용하지 않아 모든 값 추가 가능
		list.add("안녕하세요");
//		System.out.println(list.size());
		// 3. 값 get
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 단순히 값을 꺼낼 때 error 발생하지 않는다.
//			System.out.println(list.get(i) * 10); // 값을 꺼내 사용할 때 error 발생
		}
	}// UnusedHGeneric

	public static void main(String[] args) {
		new UnusedHGeneric();
	}// main

}// class
