package day1110;

/**
 * �θ�Ŭ���� : �ڽ�Ŭ������ ����� ���� �ڵ� ����
 * 
 * @author owner
 */
public class TestSuper {

	int i;
	int j;

	public TestSuper() {
		System.out.println("TestSuper�� �⺻������(Parent)");
	} // TestSuper

	public TestSuper(int i) {
		this();
		System.out.println("TestSuper�� �Ű����� �ִ� ������(Parent)");

	}
	
	public void print() {
		System.out.println("�θ� : i = " + i + ", j : " + j);
	}
}