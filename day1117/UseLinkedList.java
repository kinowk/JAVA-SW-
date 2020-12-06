package day1117;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList - java.util.List를 구현한 class<br>
 * 일차원 배열의 형식, 가변길이형, 발생된 데이터가 기존의 데이터 사이에 들어가는 일이 빈번한 경우
 * 
 * @author owner
 */
public class UseLinkedList {
	
	public UseLinkedList() {
		// 1. 생성
		LinkedList<String> linkedList = new LinkedList<String>();
		List<String> list = new LinkedList<String>();
		
		//2.값 추가
		linkedList.add("Java");
		linkedList.add("Oracle");
		linkedList.add("JDBC");
		
		list.add("Java");
		list.add("JSP");
		list.add("XML");
		list.add("JSON");
		
		System.out.println(linkedList.size() + " / " + linkedList);
		System.out.println(list.size() + " / " + list);
		
		// 기존의 데이터 사이에 값을 추가할 때 ArrayList보다 효율
		list.add(1, "Oracle");
		list.add(2, "JDBC");
		System.out.println(list.size() + " / " + list);
		
		//3. 값 삭제
		list.remove("XML"); // object
//		list.remove(2); // index
		System.out.println(list.size() + " / " + list);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}// UseLinkedList

	public static void main(String[] args) {
		new UseLinkedList();
	}// main

}// class
