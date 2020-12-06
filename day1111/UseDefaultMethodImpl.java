package day1111;

/**
 * interface를 구현한 class<br>
 * interface가 상속을 받았다면 부모 interface의 모든 abstract method를 Override 해야한다.
 * 
 * @author owner
 */
public class UseDefaultMethodImpl implements UseDefaultMethod {

	public static void main(String[] args) {
		// is a 관계의 객체화
		UseDefaultMethod udm = new UseDefaultMethodImpl();
		// udm 객체로 호출 가능한 method - 구현한 interface에 존재하는 모든 abstract method, default
		// method
		udm.methodA(); // 호출되지 않으면 자식클래스로 강제형변환 하여 호출 - ((UseDefaultMethodImpl)udm.)methodA();

		int temp = udm.methodB("안녕");
		System.out.println(temp);

		udm.methodC();

		udm.methodDefault(); // interface의 default method 호출

		udm.methodDefault1(); // interface의 default method 호출
		System.out.println(udm.methodDefault1());
	}// main

	/**
	 * SuperA interface의 abstract method
	 */
	@Override
	public void methodA() {
		System.out.println("Override된 methodA");
	}

	/**
	 * SuperB interface의 abstract method
	 */
	@Override
	public int methodB(String input) {
		return 11;
	}

	/**
	 * UseDefaultMethod의 abstract method
	 */
	@Override
	public void methodC() {
		System.out.println("Override된 methodC");
	}

}// class
