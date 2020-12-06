package day1116;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set - �˻����X, �ߺ� ������ ���X, ������ �Է�X<br>
 * Iterator�� �̿��Ͽ� ���
 * 
 * @author owner
 */
public class UseSet {

	public UseSet() {
		// 1. ����
		Set<String> set = new HashSet<String>();

		// 2. �� �ֱ�
		System.out.println(set.size() + " / " + set);
		set.add("�ä̤�");
		set.add("���ұ�");
		set.add("Ż���");
		set.add("������");
		set.add("������");
		set.add("Ż���"); // �ߺ� ������ �߰� X

		// 3. �� ����
		set.remove("���ұ�");
		System.out.println(set.size() + " / " + set);

		// 4. �˻� - Iterator
		Iterator<String> iterator = set.iterator(); // Iterator�� Set�� ������� �Ѱ��ش�.

		// 5. ���
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); // ���� ���, �����͸� �ѱ��.
		}

	}// UseSet

	public static void main(String[] args) {
		new UseSet();
	}// main

}// class
