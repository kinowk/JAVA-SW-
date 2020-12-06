package day1109;

/**
 * 자식클래스를 생성하면 부모클래스가 먼저 생성된다.
 * 
 * @author owner
 */
public class TestSub extends TestSuper {

	public TestSub() {
		System.out.println("자식클래스의 생성자");
	}// TestSub

	public static void main(String[] args) {
		TestSub ts = new TestSub();
		// 코드 재사용성 - 부모클래스의 variable, method를 자식클래스에서 자신의 instance로 사용
		System.out.println("public variable : " + ts.a); // 부모클래스의 public variable
		System.out.println("protected variable : " + ts.b); // 부모클래스의 protected variable
		System.out.println("default variable : " + ts.c); // 부모클래스의 default variable(같은 package 사용가능, 다른 package 사용불가)
		// private variable - class 내부에서만 사용
		ts.methodSuper(); // 부모클래스의 method
	}// main

}// class
