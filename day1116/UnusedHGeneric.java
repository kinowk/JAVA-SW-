package day1116;

import java.util.ArrayList;
import java.util.List;

public class UnusedHGeneric {

	public UnusedHGeneric() {
		// JDK 1.4 ���� ���� ( Generic�� �������� ���� �� ) - ��� ���� List�� ����
		// 1. ����
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
//		System.out.println(list.size());
		// 2. �� �߰� ( Generic�� ������� ������ ��� ���� �߰��� �� �ִ�. )
		list.add(10);
		list.add(20);
		list.add(20.11); // Generic�� ������� �ʾ� ��� �� �߰� ����
		list.add("�ȳ��ϼ���");
//		System.out.println(list.size());
		// 3. �� get
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // �ܼ��� ���� ���� �� error �߻����� �ʴ´�.
//			System.out.println(list.get(i) * 10); // ���� ���� ����� �� error �߻�
		}
	}// UnusedHGeneric

	public static void main(String[] args) {
		new UnusedHGeneric();
	}// main

}// class
