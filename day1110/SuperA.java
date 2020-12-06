package day1110;

public class SuperA {
	public SuperA() {
		this(200);
		System.out.println("부모 기본생성자");
	}

	public SuperA(int i) {
		System.out.println("부모 인자생성자 " + i);
	}
}
