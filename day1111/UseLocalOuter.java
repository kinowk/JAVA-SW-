package day1111;

/**
 * method 내부에 정의하고, method 안에서만 사용되는 local class 사용
 * 
 * @author owner
 */
public class UseLocalOuter { //UseLocalOuter.class - bytecode
	int outI; // Local class에서 값 할당 가능

	public void method(int param_i, int param_j) {
		int locI = 10;
		int locJ = 20;

		// local class

		class Local { // UseLocalOuter$1Local.class - bytecode
			int i;

			public Local() {
				System.out.println("Local class의 constructor");
			}

			public void localMethod() {
				System.out.println("Local class의 method");
				System.out.println("Local class의 i = " + i);
				System.out.println("Outer class의 instance variable : outI = " + outI); // instance variable 사용
				System.out.println("Outer class의 method의안의 instance variable : locI = " + locI + ", locJ = " + locJ); // method
																														// 안의
																														// 지역변수
				System.out.println("Outer class의 method의 parameter : param_i = " + param_i + ", param_j = " + param_j);

				// Local class에서 Outer class의 instance variable 값 할당 가능
				outI = 34;
//				locI = 1; // 지역변수 출력 가능, 값 할당 불가
//				locJ = 2;
//				param_i = 3; // 
//				param_j = 4;
			}
		} // local class

		
		// local class의 객체화
		Local local = new Local();
		local.i = 100;
		local.localMethod(); // Local class의 localMethod 호출

	}// method

	public static void main(String[] args) {
		UseLocalOuter ulo = new UseLocalOuter();
		ulo.method(2020, 11);
	}// main

}// class
