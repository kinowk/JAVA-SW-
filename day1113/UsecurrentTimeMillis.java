package day1113;

/**
 * 시스템의 시간 얻기
 * 
 * @author owner
 */
public class UsecurrentTimeMillis {

	public UsecurrentTimeMillis() {
//		System.out.println(System.currentTimeMillis());
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
//			System.out.println("i = " + i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime + "ms");
//		System.out.println(System.currentTimeMillis());

	}// UsecurrentTimeMillis

	public static void main(String[] args) {
		new UsecurrentTimeMillis();
	}// main

}// class
