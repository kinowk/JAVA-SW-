package day1110;

/**
 * �ڽ�Ŭ����
 * 
 * @author owner
 */
public class TestSub extends TestSuper {

	int j; // �θ�Ŭ������ ���� �̸��� variable ����
	int k;

	public TestSub() {
		super(11);
		System.out.println("TestSub�� �⺻������(Child)");

	}

	@Override
	public void print() {
		j = 11;
		k = 10;
		i = 20000; // �θ�Ŭ������ �����ϴ� variable
//		this.i = 20000;
//		super.i = 20000;
		// �θ�� �ڽ��� ���� �̸��� variable�� ���� ���
		super.j = 2020; // �θ��� variable - super

		System.out.println(this);
//		System.out.println(super); // �ڽ�Ŭ�������� �θ�Ŭ������ �ּҸ� ����� �� ����.
		System.out.println("�ڽ� : j = " + j + ", k : " + k);
		super.print();
	}

	public static void main(String[] args) {
		TestSub ts = new TestSub();
		ts.print(); // TestSub�� print() method
		// ��ü�� �ּҷδ� �θ�� �ڽ��� �̸��� ���ٸ� �ĺ����� ���ϱ� ������ �θ��� �ڿ��� ȣ���� �� ����.(super - instance���������� ���)
//		TestSuper test_super = new TestSub();
//		test_super.print(); // TestSub�� print() method ����

	}// main

}// class
