package day1117;

import java.util.HashMap;
import java.util.Map;

public class UseMap1 {

	public void useHashMap() {
//		1. Map����
		Map<String, String> map = new HashMap<String, String>();
//		2. �� �Ҵ� - 'Key' 'Value' ������ �Է� -> entry
		map.put("A", "�����ϴ�. ģ���ϴ�.");
		map.put("B", "���� ������.");
		map.put("AB", "������");
		map.put("O", "�����δ�");
		// Key�� ���ٸ� �����.
		map.put("B", "�����ϴ�.");
		map.put("AB", "�ٺ� �ƴϸ� õ��");
		map.put("O", "���׿��");
		System.out.println(map);

		String bloodType = "ab".toUpperCase();

		if (map.containsKey(bloodType)) {
			System.out.println(bloodType + "���� Ư¡�� " + map.get(bloodType));
		} else {
			System.out.println(bloodType + "�� ����� �������� �ƴմϴ�.");
		}
	}// useHashMap

	public static void main(String[] args) {
		new UseMap1().useHashMap();
	}// main

}// class
