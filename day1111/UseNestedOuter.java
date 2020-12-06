package day1111;

/**
 * ��øŬ���� : class�ȿ� static class�� �����ϴ� class
 * 
 * @author owner
 */
public class UseNestedOuter { // UseNestedOuter.class - bytecode
	int outI; // instance variable
	static int outJ; // static variable

	public void outInstanceMethod() {
		System.out.println("Outer class�� instance method");
	}

	public static void outStaticMethod() {
		System.out.println("Outer class�� static method");
	}

	// Nested class

	static class Inner { // UseNestedOuter$Inner.class - bytecode
		static int inI;

//		public Inner() {} // Nested class�� �����ڸ� ����X
		public static void inMethod() {
			System.out.println("Inner class�� static method");
//			outI = 100; // Cannot make a static reference to the non-static field outI
			// static�������� instance variable ���X
//			outInstanceMethod(); // static�������� instance method ���X
			outJ = 100;
			outStaticMethod();
		}
	}// Inner class

	public static void main(String[] args) {
		Inner.inI = 10; // Inner class�� static variable ���
		Inner.inMethod(); // Inner class�� method�� static�������� ���
		System.out.println(Inner.inI);
		// static variable, static method ���
		System.out.println(outJ);
		outStaticMethod();
		// instance variable, instance method ���
		UseNestedOuter uno = new UseNestedOuter();
		uno.outI = 11;
		uno.outInstanceMethod();
	}// main

}// class
