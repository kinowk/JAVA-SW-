package day1111;

/**
 * Ŭ�����ȿ� Ŭ������ ���ǵǴ� class
 * 
 * @author owner
 */
public class UseInner { // UseInner.class - bytecode ����

	int outI;

	public UseInner() {
		System.out.println("Outer class�� constructor");
	}

	public void outMethod() {
		System.out.println("Outer class�� method");
		System.out.println("Outer class�� variable outI : " + outI);
//		System.out.println("Inner class�� variable j : " + j); // Inner class�� variable ���� �����Ͽ� ���X
//		inMethod(); // Inner class�� method ���� ����X
	}

	// Inner class
	public class Inner { // UseInner$Inner.class - bytecode ����
		int j;

		public Inner() {
			System.out.println("Inner class�� constructor");
		}

		public void inMethod() {
			System.out.println("Inner class�� method");
			System.out.println("Inner class�� variable j : " + j);
			System.out.println("Outer class�� variable outI : " + outI); // Outer class�� variable ����
			outMethod(); // Outer class�� method ���
		}// inMethod
	}// Inner class

	@SuppressWarnings("unused")
	public void createInner() { // Inner class ��üȭ
//		Inner inner = this.new Inner(); // this : method�� ȣ���ϴ� ��ü�� �ּ�
		Inner inner = new Inner(); // this ��������
//		inner.j = 1; // Inner class ��üȭ �� variable ���
//		inner.inMethod(); // Inner class ��üȭ �� method ���
	}// createInner

	public static void main(String[] args) {
		UseInner useInner = new UseInner(); // Outer class ��üȭ ( Inner class�� ��üȭX )
		useInner.createInner();
		System.out.println("--------------------------------------");
		UseInner.Inner inner = useInner.new Inner();
		// Inner class ��üȭ - Outerclass.Innerclass ��ü�� = Outerclass��ü��.new
		// Innerclass������();
		// Inner inner = useInner.new Inner(); // Outerclass ��������
		inner.j = 11;
		inner.inMethod();// Inner class�� method���� Outer class�� variable, method ��� ����
	}// main

}// Outer class
