package day1117;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map - 'Key'�� 'Value'�� ������ �����Ͱ� ����<br>
 * Hashtable - Constructs an empty HashMap with the default initial capacity
 * (11) and the default load factor (0.75)<br>
 * HashMap - Constructs an empty HashMap with the default initial capacity (16)
 * and the default load factor (0.75)
 * 
 * @author owner
 */
public class UseMap {

	/**
	 * �⺻�����ڸ� ����Ͽ� ��ü�� �����ϸ� 11���� ���� �����Ǵ� Hashtable�� ���
	 */
	public void useHashtable() { // ����ȭ -> ���� �ӵ�
		// 1. ����
		Map<String, String> map = new Hashtable<String, String>();
		// 2.�� �Ҵ�
		map.put("Java", "OOP���");
		map.put("Oracle", "��뷮 �����ͺ��̽�");
		map.put("HTML", "���������� ��������");
		map.put("CSS", "���������� ���ϼ��ִ� �����μ���");
		map.put("Python", "OOP���"); // Value �ߺ�����
		// Key�� ���� -> ���� Key�� �����ϸ� �����
		map.put("Java", "�Ϻ��� OOP���"); // Value - "OOP���" -> "�Ϻ��� OOP���"
		System.out.println(map);
		// 3. ���� ��
		System.out.println(map.size());
		// 4. �� ���
		System.out.println(map.get("Oracle"));
		// 5. Key�� �����ϴ���
		System.out.println(map.containsKey("Oracle"));
		// 6. ��� Key ���
		Set<String> set = map.keySet(); // return Set<E>
		System.out.println("��� Ű : " + set);
		// 7. ��� Value ���
		Iterator<String> iterator = set.iterator(); // Set�� ������� Iterator�� �Ѱ���
		while (iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
			// iterator.next() - return Key --> map.get(iterator.next()) - return Value
		}
	}// useHashtable

	public void useHashMap() { // �񵿱�ȭ -> �����ӵ�
		// 1. ����
		Map<String, String> map = new HashMap<String, String>();
		// 2.�� �Ҵ�
		map.put("Java", "OOP���");
		map.put("Oracle", "��뷮 �����ͺ��̽�");
		map.put("HTML", "���������� ��������");
		map.put("CSS", "���������� ���ϼ��ִ� �����μ���");
		map.put("Python", "OOP���"); // Value �ߺ�����
		// Key�� ���� -> ���� Key�� �����ϸ� �����
		map.put("Java", "�Ϻ��� OOP���"); // Value - "OOP���" -> "�Ϻ��� OOP���"
		System.out.println(map);
		// 3. ���� ��
		System.out.println(map.size());
		// 4. �� ���
		System.out.println(map.get("Oracle"));
		// 5. Key�� �����ϴ���
		System.out.println(map.containsKey("Oracle"));
		// 6. ��� Key ���
		Set<String> set = map.keySet(); // return Set<E>
		System.out.println("��� Ű : " + set);
		// 7. ��� Value ���
		Iterator<String> iterator = set.iterator(); // Set�� ������� Iterator�� �Ѱ���
		while (iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
			// iterator.next() - return Key --> map.get(iterator.next()) - return Value
		}

	}// useHashMap

	public static void main(String[] args) {
		UseMap um = new UseMap();
		um.useHashtable();
		System.out.println("-------------------------------------------------------");
		um.useHashMap();
	}// main

}// class
