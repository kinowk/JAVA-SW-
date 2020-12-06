package day1110;

/**
 * AbstractSuper의 자식클래스(abstract class의 자식클래스)<br>
 * 부모클래스의 모든 abstract method를 반드시 Override해야한다.
 * 
 * @author owner
 */
public class AbstractSub extends AbstractSuper {

	public AbstractSub() {
		System.out.println("자식클래스");
	}

	public static void main(String[] args) {
		AbstractSub as = new AbstractSub();
		as.methodA(); // 부모의 일반 method
		as.methodB(); // 부모의 abstract method를 Override한 method
		System.out.println(as.methodC()); // 부모의 abstract method를 Override한 method

	}// main

	@Override
	public void methodB() {
		// super.methodB(); // abstract method는 직접 호출할 수 없다.
		System.out.println("Override한 methodB");
	}

	@Override
	public int methodC() {
		return 11;
	}

}// class
