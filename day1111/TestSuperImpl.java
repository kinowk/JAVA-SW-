package day1111;

/**
 * 인터페이스를 구현한 클래스<br>
 * 클래스에서 필요한 모든 인터페이스를 구현할 수 있다.<br>
 * 접근제한자 class 클래스명 implements 인터페이스명,,,{
 * 
 * @author owner
 */
public class TestSuperImpl implements TestSuper {

	public static void main(String[] args) {
		// 인터페이스는 객체화 X
		// TestSuper testSuper = new TestSuper();

		// 인터페이스는 구현한 클래스의 객체주소를 저장할 수 있다. - is a 관계의 객체화
		TestSuper ts = new TestSuperImpl();
		// ts객체로 호출 가능한 것 - 부모의 variable, 부모의 method
		ts.methodA();
		ts.methodB();
		System.out.println(ts.name());
		System.out.println(TestSuper.MAX); // System.out.println(ts.MAX);
		// ts.subMethod(); // The method subMethod() is undefined for the type TestSuper - is a 관계의 객체화는 자식의 variable, method를 사용할 수 없다.

		TestSuperImpl tsi = new TestSuperImpl();
		tsi.methodA();
		tsi.methodB();
		System.out.println(tsi.name());
		System.out.println(TestSuper.MAX); // System.out.println(tsi.MAX);
		tsi.subMethod();
	}// main

	@Override
	public void methodA() {
		System.out.println("Override된 methodA");
	}// methodA

	@Override
	public void methodB() {
		System.out.println("Override된 methodB");
	}// methodB

	@Override
	public String name() {
		return "kwonik";
	}// name

	public void subMethod() {
		System.out.println("자식의 method");
	}

}// class
