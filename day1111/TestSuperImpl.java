package day1111;

/**
 * �������̽��� ������ Ŭ����<br>
 * Ŭ�������� �ʿ��� ��� �������̽��� ������ �� �ִ�.<br>
 * ���������� class Ŭ������ implements �������̽���,,,{
 * 
 * @author owner
 */
public class TestSuperImpl implements TestSuper {

	public static void main(String[] args) {
		// �������̽��� ��üȭ X
		// TestSuper testSuper = new TestSuper();

		// �������̽��� ������ Ŭ������ ��ü�ּҸ� ������ �� �ִ�. - is a ������ ��üȭ
		TestSuper ts = new TestSuperImpl();
		// ts��ü�� ȣ�� ������ �� - �θ��� variable, �θ��� method
		ts.methodA();
		ts.methodB();
		System.out.println(ts.name());
		System.out.println(TestSuper.MAX); // System.out.println(ts.MAX);
		// ts.subMethod(); // The method subMethod() is undefined for the type TestSuper - is a ������ ��üȭ�� �ڽ��� variable, method�� ����� �� ����.

		TestSuperImpl tsi = new TestSuperImpl();
		tsi.methodA();
		tsi.methodB();
		System.out.println(tsi.name());
		System.out.println(TestSuper.MAX); // System.out.println(tsi.MAX);
		tsi.subMethod();
	}// main

	@Override
	public void methodA() {
		System.out.println("Override�� methodA");
	}// methodA

	@Override
	public void methodB() {
		System.out.println("Override�� methodB");
	}// methodB

	@Override
	public String name() {
		return "kwonik";
	}// name

	public void subMethod() {
		System.out.println("�ڽ��� method");
	}

}// class
