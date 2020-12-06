package day1117;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList - java.util.List�� ������ class<br>
 * ������ �迭�� ����, ����������, �߻��� �����Ͱ� ������ ������ ���̿� ���� ���� ����� ���
 * 
 * @author owner
 */
public class UseLinkedList {
	
	public UseLinkedList() {
		// 1. ����
		LinkedList<String> linkedList = new LinkedList<String>();
		List<String> list = new LinkedList<String>();
		
		//2.�� �߰�
		linkedList.add("Java");
		linkedList.add("Oracle");
		linkedList.add("JDBC");
		
		list.add("Java");
		list.add("JSP");
		list.add("XML");
		list.add("JSON");
		
		System.out.println(linkedList.size() + " / " + linkedList);
		System.out.println(list.size() + " / " + list);
		
		// ������ ������ ���̿� ���� �߰��� �� ArrayList���� ȿ��
		list.add(1, "Oracle");
		list.add(2, "JDBC");
		System.out.println(list.size() + " / " + list);
		
		//3. �� ����
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
