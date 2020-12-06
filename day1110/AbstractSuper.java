package day1110;

/**
 * 상속을 위해서 만드는 class<br>
 * 자식클래스가 반드시 구현해야할 일의 목록을 abstract method로 정의할 수 있다.
 * 
 * @author owner
 */
public abstract class AbstractSuper {
	public AbstractSuper() {
		System.out.println("abstract class의 constructor");
	}

	public void methodA() { // 자식클래스가 호출하여 사용할 수 있는 method
		System.out.println("일반 methodA");
	}

	// abstract method는 자식클래스에서 반드시 Override - 구현의 강제성
	public abstract void methodB(); // abstract method - method의 body 없음

	public abstract int methodC();

	public static void main(String[] args) {
		// new AbstractSuper(); // abstract class는 직접 객체화 될 수 없다.

	}
}