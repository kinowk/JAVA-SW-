package day1109;

/**
 * 부모클래스 - 자식클래스가 갖는 공통 특징 정의(variable, method 정의)
 * 
 * @author owner
 */
public class TestSuper {
	public int a;
	protected int b;
	int c;
	private int d;

	public TestSuper() {
		System.out.println("부모클래스의 생성자");
	}// TestSuper

	public void methodSuper() {
		System.out.println("부모클래스의 method");
	}// methodSuper
}// class
