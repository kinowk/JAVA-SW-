package day1110;

public class SubA extends SuperA {
	public SubA() {
		//super();
		System.out.println("�ڽ� �⺻������");
	}

	public SubA(int i) {
		this();
		System.out.println("�ڽ� ���ڻ����� " + i);
	}
}
