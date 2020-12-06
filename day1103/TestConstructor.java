package day1103;

public class TestConstructor {

	// default constructor(기본생성자)
	public TestConstructor() {
		System.out.println("default constructor");
	}

	// constructor의 overloading
	public TestConstructor(int i) {
		System.out.println("parameter가 있는 constructor");
		// TestConstructor(); - 생성자는 직접 호출X - this(), super()로 호출
		// method();
	}

	public void method() {
		System.out.println("일반 method");
	}

	public static void main(String[] args) {
		new TestConstructor(); // 생성자를 호출하면 객체가 한 생성된다.
		new TestConstructor(0);
	}
}
