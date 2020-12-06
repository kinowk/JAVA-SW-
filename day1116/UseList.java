package day1116;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * List - 검색 기능, 중복 데이터 저장 허용<br>
 * 가변길이형(데이터 추가, 삭제 작업에 따라 방의 개수가 변경)
 * 
 * @author owner
 */
public class UseList {

	/**
	 * Multi Thread에서 동시 접근 불가능(동기화)
	 */
	public void useVector() {
		// 1. 생성 - Generic(기본형은 Wrapper Class 사용)
		Vector<Integer> vec = new Vector<Integer>(3); // Constructs an empty list with the specified initial capacity
		// size로 방의 크기가 나오지 않음, 데이터가 추가되면 방의 크기도 늘어남
		List<String> list = new Vector<String>();

		System.out.println("Vector의 크기 : " + vec.size());
		System.out.println("List의 크기 : " + list.size());

		// 2. 값 추가 - Generic으로 설정된 데이터형만 추가 가능
		vec.add(10); // vec.add(new Integer(10));
		// 기본형 데이터를 추가하면, JVM이 기본형 데이터에 대응되는 Wrapper Class를 사용하여 객체를 생성 후 추가(autoboxing)
		vec.add(20);
		System.out.println("Vector의 크기 : " + vec.size());
		vec.add(30);
		vec.add(10); // initial capacity의 크기를 초과하더라도 방이 추가된다.
		System.out.println("Vector의 크기 : " + vec.size());
		System.out.println(vec); // Object.toString()를 Vector class에서 Override하여 주소가 아닌 값이 출력

		list.add("함혜림");
		list.add("최혜원");
		list.add("최은혜");
		list.add("정예진");
		list.add("정소윤");
		System.out.println("List의 크기 : " + list.size());
		System.out.println(list);

		// 배열로 복사
		// 배열을 List의 크기로 생성
//		int[] intArr = new int[vec.size()]; // 기본형 int와 참조형 Integer은 같은 데이터형이 아니다.
		Integer[] intArr = new Integer[vec.size()]; // !!!
		String[] strArr = new String[list.size()];
		// 복사 - Generic 미입력시 error
		vec.toArray(intArr);
		list.toArray(strArr);

		// 3. 값 얻기 - Unboxing
		String name = list.get(0); // 입력데이터형과 저장하는 데이터형이 같다면 Unboxing X

		int num = vec.get(0);
//		Generic으로 Wrapper Class가 설정되어있을 때, 기본형 데이터로 값을 얻으면 JVM이 Wrapper Class에서 기본형으로 값을 얻어내는 Unboxing 수행
//		int num = vec.get(0).intValue(); - Integer -> int
		// 4. 일괄처리
		for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 5. 값 삭제
		// index
		vec.remove(1); // 20 removed
		list.remove(3); // "정예진" removed
		System.out.println(vec);
		System.out.println(list);
		// Object
//		vec.remove(new Integer(30)); // 30 removed
		vec.remove(Integer.valueOf(30)); // 30 removed - valueOf() static method 사용
		list.remove("함혜림"); // "함혜림" removed
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
		System.out.println("------------------------배열에 복사한 내용 출력-----------------------");

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

	}// useVector

	/**
	 * Multi Thread에서 동시 접근 가능(비동기화)
	 */
	public void useArrayList() {
		// 1. 생성 - Generic(기본형은 Wrapper Class 사용)
		ArrayList<Integer> al = new ArrayList<Integer>(3); // Constructs an empty list with the specified initial
															// capacity
		// size로 방의 크기가 나오지 않음, 데이터가 추가되면 방의 크기도 늘어남
		List<String> list = new ArrayList<String>();

		System.out.println("ArrayList의 크기 : " + al.size());
		System.out.println("List의 크기 : " + list.size());

		// 2. 값 추가 - Generic으로 설정된 데이터형만 추가 가능
		al.add(10); // al.add(new Integer(10));
		// 기본형 데이터를 추가하면, JVM이 기본형 데이터에 대응되는 Wrapper Class를 사용하여 객체를 생성 후 추가(autoboxing)
		al.add(20);
		System.out.println("ArrayList의 크기 : " + al.size());
		al.add(30);
		al.add(10); // initial capacity의 크기를 초과하더라도 방이 추가된다.
		System.out.println("ArrayList의 크기 : " + al.size());
		System.out.println(al); // Object.toString()를 ArrayList class에서 Override하여 주소가 아닌 값이 출력

		list.add("함혜림");
		list.add("최혜원");
		list.add("최은혜");
		list.add("정예진");
		list.add("정소윤");
		System.out.println("List의 크기 : " + list.size());
		System.out.println(list);

		// 배열로 복사
		// 배열을 List의 크기로 생성
//		int[] intArr = new int[al.size()]; // 기본형 int와 참조형 Integer은 같은 데이터형이 아니다.
		Integer[] intArr = new Integer[al.size()]; // !!!
		String[] strArr = new String[list.size()];
		// 복사 - Generic 미입력시 error
		al.toArray(intArr);
		list.toArray(strArr);

		// 3. 값 얻기 - Unboxing
		String name = list.get(0); // 입력데이터형과 저장하는 데이터형이 같다면 Unboxing X

		int num = al.get(0);
//		Generic으로 Wrapper Class가 설정되어있을 때, 기본형 데이터로 값을 얻으면 JVM이 Wrapper Class에서 기본형으로 값을 얻어내는 Unboxing 수행
//		int num = al.get(0).intValue(); - Integer -> int

		// 4. 일괄처리
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 5. 값 삭제
		// index
		al.remove(1); // 20 removed
		list.remove(3); // "정예진" removed
		System.out.println(al);
		System.out.println(list);
		// Object
//		al.remove(new Integer(30)); // 30 removed
		al.remove(Integer.valueOf(30)); // 30 removed - valueOf() static method 사용
		list.remove("함혜림"); // "함혜림" removed
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
		System.out.println("------------------------배열에 복사한 내용 출력-----------------------");

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
