package day1103;

public class TestConstructor {

	// default constructor(�⺻������)
	public TestConstructor() {
		System.out.println("default constructor");
	}

	// constructor�� overloading
	public TestConstructor(int i) {
		System.out.println("parameter�� �ִ� constructor");
		// TestConstructor(); - �����ڴ� ���� ȣ��X - this(), super()�� ȣ��
		// method();
	}

	public void method() {
		System.out.println("�Ϲ� method");
	}

	public static void main(String[] args) {
		new TestConstructor(); // �����ڸ� ȣ���ϸ� ��ü�� �� �����ȴ�.
		new TestConstructor(0);
	}
}
