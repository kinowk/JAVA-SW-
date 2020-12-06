package day1117;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map - 'Key'와 'Value'의 쌍으로 데이터가 존재<br>
 * Hashtable - Constructs an empty HashMap with the default initial capacity
 * (11) and the default load factor (0.75)<br>
 * HashMap - Constructs an empty HashMap with the default initial capacity (16)
 * and the default load factor (0.75)
 * 
 * @author owner
 */
public class UseMap {

	/**
	 * 기본생성자를 사용하여 객체를 생성하면 11개의 행이 생성되는 Hashtable을 사용
	 */
	public void useHashtable() { // 동기화 -> 느린 속도
		// 1. 생성
		Map<String, String> map = new Hashtable<String, String>();
		// 2.값 할당
		map.put("Java", "OOP언어");
		map.put("Oracle", "대용량 데이터베이스");
		map.put("HTML", "웹페이지의 구조설정");
		map.put("CSS", "웹페이지의 통일성있는 디자인설정");
		map.put("Python", "OOP언어"); // Value 중복가능
		// Key는 유일 -> 같은 Key가 존재하면 덮어쓴다
		map.put("Java", "완벽한 OOP언어"); // Value - "OOP언어" -> "완벽한 OOP언어"
		System.out.println(map);
		// 3. 행의 수
		System.out.println(map.size());
		// 4. 값 얻기
		System.out.println(map.get("Oracle"));
		// 5. Key가 존재하는지
		System.out.println(map.containsKey("Oracle"));
		// 6. 모든 Key 얻기
		Set<String> set = map.keySet(); // return Set<E>
		System.out.println("모든 키 : " + set);
		// 7. 모든 Value 얻기
		Iterator<String> iterator = set.iterator(); // Set의 제어권을 Iterator에 넘겨줌
		while (iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
			// iterator.next() - return Key --> map.get(iterator.next()) - return Value
		}
	}// useHashtable

	public void useHashMap() { // 비동기화 -> 빠른속도
		// 1. 생성
		Map<String, String> map = new HashMap<String, String>();
		// 2.값 할당
		map.put("Java", "OOP언어");
		map.put("Oracle", "대용량 데이터베이스");
		map.put("HTML", "웹페이지의 구조설정");
		map.put("CSS", "웹페이지의 통일성있는 디자인설정");
		map.put("Python", "OOP언어"); // Value 중복가능
		// Key는 유일 -> 같은 Key가 존재하면 덮어쓴다
		map.put("Java", "완벽한 OOP언어"); // Value - "OOP언어" -> "완벽한 OOP언어"
		System.out.println(map);
		// 3. 행의 수
		System.out.println(map.size());
		// 4. 값 얻기
		System.out.println(map.get("Oracle"));
		// 5. Key가 존재하는지
		System.out.println(map.containsKey("Oracle"));
		// 6. 모든 Key 얻기
		Set<String> set = map.keySet(); // return Set<E>
		System.out.println("모든 키 : " + set);
		// 7. 모든 Value 얻기
		Iterator<String> iterator = set.iterator(); // Set의 제어권을 Iterator에 넘겨줌
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
