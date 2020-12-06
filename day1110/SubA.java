package day1110;

public class SubA extends SuperA {
	public SubA() {
		//super();
		System.out.println("자식 기본생성자");
	}

	public SubA(int i) {
		this();
		System.out.println("자식 인자생성자 " + i);
	}
}
