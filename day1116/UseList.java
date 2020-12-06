package day1116;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * List - �˻� ���, �ߺ� ������ ���� ���<br>
 * ����������(������ �߰�, ���� �۾��� ���� ���� ������ ����)
 * 
 * @author owner
 */
public class UseList {

	/**
	 * Multi Thread���� ���� ���� �Ұ���(����ȭ)
	 */
	public void useVector() {
		// 1. ���� - Generic(�⺻���� Wrapper Class ���)
		Vector<Integer> vec = new Vector<Integer>(3); // Constructs an empty list with the specified initial capacity
		// size�� ���� ũ�Ⱑ ������ ����, �����Ͱ� �߰��Ǹ� ���� ũ�⵵ �þ
		List<String> list = new Vector<String>();

		System.out.println("Vector�� ũ�� : " + vec.size());
		System.out.println("List�� ũ�� : " + list.size());

		// 2. �� �߰� - Generic���� ������ ���������� �߰� ����
		vec.add(10); // vec.add(new Integer(10));
		// �⺻�� �����͸� �߰��ϸ�, JVM�� �⺻�� �����Ϳ� �����Ǵ� Wrapper Class�� ����Ͽ� ��ü�� ���� �� �߰�(autoboxing)
		vec.add(20);
		System.out.println("Vector�� ũ�� : " + vec.size());
		vec.add(30);
		vec.add(10); // initial capacity�� ũ�⸦ �ʰ��ϴ��� ���� �߰��ȴ�.
		System.out.println("Vector�� ũ�� : " + vec.size());
		System.out.println(vec); // Object.toString()�� Vector class���� Override�Ͽ� �ּҰ� �ƴ� ���� ���

		list.add("������");
		list.add("������");
		list.add("������");
		list.add("������");
		list.add("������");
		System.out.println("List�� ũ�� : " + list.size());
		System.out.println(list);

		// �迭�� ����
		// �迭�� List�� ũ��� ����
//		int[] intArr = new int[vec.size()]; // �⺻�� int�� ������ Integer�� ���� ���������� �ƴϴ�.
		Integer[] intArr = new Integer[vec.size()]; // !!!
		String[] strArr = new String[list.size()];
		// ���� - Generic ���Է½� error
		vec.toArray(intArr);
		list.toArray(strArr);

		// 3. �� ��� - Unboxing
		String name = list.get(0); // �Էµ��������� �����ϴ� ���������� ���ٸ� Unboxing X

		int num = vec.get(0);
//		Generic���� Wrapper Class�� �����Ǿ����� ��, �⺻�� �����ͷ� ���� ������ JVM�� Wrapper Class���� �⺻������ ���� ���� Unboxing ����
//		int num = vec.get(0).intValue(); - Integer -> int
		// 4. �ϰ�ó��
		for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 5. �� ����
		// index
		vec.remove(1); // 20 removed
		list.remove(3); // "������" removed
		System.out.println(vec);
		System.out.println(list);
		// Object
//		vec.remove(new Integer(30)); // 30 removed
		vec.remove(Integer.valueOf(30)); // 30 removed - valueOf() static method ���
		list.remove("������"); // "������" removed
		System.out.println(vec);
		System.out.println(list);

		System.out.println("Vector empty ? : " + vec.isEmpty());
		System.out.println("List empty ? : " + list.isEmpty());

		vec.clear();
		list.clear();

		System.out.println(vec);
		System.out.println(list);

		System.out.println("Vector empty ? : " + vec.isEmpty());
		System.out.println("List empty ? : " + list.isEmpty());

//		(list.size() == 0) - isEmpty()
		System.out.println("------------------------�迭�� ������ ���� ���-----------------------");

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

	}// useVector

	/**
	 * Multi Thread���� ���� ���� ����(�񵿱�ȭ)
	 */
	public void useArrayList() {
		// 1. ���� - Generic(�⺻���� Wrapper Class ���)
		ArrayList<Integer> al = new ArrayList<Integer>(3); // Constructs an empty list with the specified initial
															// capacity
		// size�� ���� ũ�Ⱑ ������ ����, �����Ͱ� �߰��Ǹ� ���� ũ�⵵ �þ
		List<String> list = new ArrayList<String>();

		System.out.println("ArrayList�� ũ�� : " + al.size());
		System.out.println("List�� ũ�� : " + list.size());

		// 2. �� �߰� - Generic���� ������ ���������� �߰� ����
		al.add(10); // al.add(new Integer(10));
		// �⺻�� �����͸� �߰��ϸ�, JVM�� �⺻�� �����Ϳ� �����Ǵ� Wrapper Class�� ����Ͽ� ��ü�� ���� �� �߰�(autoboxing)
		al.add(20);
		System.out.println("ArrayList�� ũ�� : " + al.size());
		al.add(30);
		al.add(10); // initial capacity�� ũ�⸦ �ʰ��ϴ��� ���� �߰��ȴ�.
		System.out.println("ArrayList�� ũ�� : " + al.size());
		System.out.println(al); // Object.toString()�� ArrayList class���� Override�Ͽ� �ּҰ� �ƴ� ���� ���

		list.add("������");
		list.add("������");
		list.add("������");
		list.add("������");
		list.add("������");
		System.out.println("List�� ũ�� : " + list.size());
		System.out.println(list);

		// �迭�� ����
		// �迭�� List�� ũ��� ����
//		int[] intArr = new int[al.size()]; // �⺻�� int�� ������ Integer�� ���� ���������� �ƴϴ�.
		Integer[] intArr = new Integer[al.size()]; // !!!
		String[] strArr = new String[list.size()];
		// ���� - Generic ���Է½� error
		al.toArray(intArr);
		list.toArray(strArr);

		// 3. �� ��� - Unboxing
		String name = list.get(0); // �Էµ��������� �����ϴ� ���������� ���ٸ� Unboxing X

		int num = al.get(0);
//		Generic���� Wrapper Class�� �����Ǿ����� ��, �⺻�� �����ͷ� ���� ������ JVM�� Wrapper Class���� �⺻������ ���� ���� Unboxing ����
//		int num = al.get(0).intValue(); - Integer -> int

		// 4. �ϰ�ó��
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 5. �� ����
		// index
		al.remove(1); // 20 removed
		list.remove(3); // "������" removed
		System.out.println(al);
		System.out.println(list);
		// Object
//		al.remove(new Integer(30)); // 30 removed
		al.remove(Integer.valueOf(30)); // 30 removed - valueOf() static method ���
		list.remove("������"); // "������" removed
		System.out.println(al);
		System.out.println(list);

		System.out.println("ArrayList empty ? : " + al.isEmpty());
		System.out.println("List empty ? : " + list.isEmpty());

		al.clear();
		list.clear();

		System.out.println(al);
		System.out.println(list);

		System.out.println("ArrayList empty ? : " + al.isEmpty());
		System.out.println("List empty ? : " + list.isEmpty());

//		(list.size() == 0) - isEmpty()
		System.out.println("------------------------�迭�� ������ ���� ���-----------------------");

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

	}// uesList

	public static void main(String[] args) {
		UseList ul = new UseList();
		ul.useVector();
		System.out.println("-----------------------------------------------------------------------------------------");
		ul.useArrayList();

	}// main

}// class
