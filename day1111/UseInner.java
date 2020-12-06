package day1111;

/**
 * 클래스안에 클래스가 정의되는 class
 * 
 * @author owner
 */
public class UseInner { // UseInner.class - bytecode 생성

	int outI;

	public UseInner() {
		System.out.println("Outer class의 constructor");
	}

	public void outMethod() {
		System.out.println("Outer class의 method");
		System.out.println("Outer class의 variable outI : " + outI);
//		System.out.println("Inner class의 variable j : " + j); // Inner class의 variable 직접 접근하여 사용X
//		inMethod(); // Inner class의 method 직접 접근X
	}

	// Inner class
	public class Inner { // UseInner$Inner.class - bytecode 생성
		int j;

		public Inner() {
			System.out.println("Inner class의 constructor");
		}

		public void inMethod() {
			System.out.println("Inner class의 method");
			System.out.println("Inner class의 variable j : " + j);
			System.out.println("Outer class의 variable outI : " + outI); // Outer class의 variable 샤용
			outMethod(); // Outer class의 method 사용
		}// inMethod
	}// Inner class

	@SuppressWarnings("unused")
	public void createInner() { // Inner class 객체화
//		Inner inner = this.new Inner(); // this : method를 호출하는 객체의 주소
		Inner inner = new Inner(); // this 생략가능
//		inner.j = 1; // Inner class 객체화 후 variable 사용
//		inner.inMethod(); // Inner class 객체화 후 method 사용
	}// createInner

	public static void main(String[] args) {
		UseInner useInner = new UseInner(); // Outer class 객체화 ( Inner class는 객체화X )
		useInner.createInner();
		System.out.println("--------------------------------------");
		UseInner.Inner inner = useInner.new Inner();
		// Inner class 객체화 - Outerclass.Innerclass 객체명 = Outerclass객체명.new
		// Innerclass생성자();
		// Inner inner = useInner.new Inner(); // Outerclass 생략가능
		inner.j = 11;
		inner.inMethod();// Inner class의 method에서 Outer class의 variable, method 사용 가능
	}// main

}// Outer class
