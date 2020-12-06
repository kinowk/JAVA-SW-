package day1111;

/**
 * 중첩클래스 : class안에 static class를 정의하는 class
 * 
 * @author owner
 */
public class UseNestedOuter { // UseNestedOuter.class - bytecode
	int outI; // instance variable
	static int outJ; // static variable

	public void outInstanceMethod() {
		System.out.println("Outer class의 instance method");
	}

	public static void outStaticMethod() {
		System.out.println("Outer class의 static method");
	}

	// Nested class

	static class Inner { // UseNestedOuter$Inner.class - bytecode
		static int inI;

//		public Inner() {} // Nested class는 생성자를 정의X
		public static void inMethod() {
			System.out.println("Inner class의 static method");
//			outI = 100; // Cannot make a static reference to the non-static field outI
			// static영역에서 instance variable 사용X
//			outInstanceMethod(); // static영역에서 instance method 사용X
			outJ = 100;
			outStaticMethod();
		}
	}// Inner class

	public static void main(String[] args) {
		Inner.inI = 10; // Inner class의 static variable 사용
		Inner.inMethod(); // Inner class의 method를 static문법으로 사용
		System.out.println(Inner.inI);
		// static variable, static method 사용
		System.out.println(outJ);
		outStaticMethod();
		// instance variable, instance method 사용
		UseNestedOuter uno = new UseNestedOuter();
		uno.outI = 11;
		uno.outInstanceMethod();
	}// main

}// class
