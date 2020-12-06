package day1117;

import java.util.HashMap;
import java.util.Map;

public class UseMap1 {

	public void useHashMap() {
//		1. Map생성
		Map<String, String> map = new HashMap<String, String>();
//		2. 값 할당 - 'Key' 'Value' 쌍으로 입력 -> entry
		map.put("A", "세삼하다. 친절하다.");
		map.put("B", "성질 더럽다.");
		map.put("AB", "싸이코");
		map.put("O", "우유부단");
		// Key가 같다면 덮어쓴다.
		map.put("B", "터프하다.");
		map.put("AB", "바보 아니면 천재");
		map.put("O", "개그욕심");
		System.out.println(map);

		String bloodType = "ab".toUpperCase();

		if (map.containsKey(bloodType)) {
			System.out.println(bloodType + "형의 특징은 " + map.get(bloodType));
		} else {
			System.out.println(bloodType + "은 사람의 혈액형이 아닙니다.");
		}
	}// useHashMap

	public static void main(String[] args) {
		new UseMap1().useHashMap();
	}// main

}// class
