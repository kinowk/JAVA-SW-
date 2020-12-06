package day1110;

/**
 * ����� ���ؼ� ����� class<br>
 * �ڽ�Ŭ������ �ݵ�� �����ؾ��� ���� ����� abstract method�� ������ �� �ִ�.
 * 
 * @author owner
 */
public abstract class AbstractSuper {
	public AbstractSuper() {
		System.out.println("abstract class�� constructor");
	}

	public void methodA() { // �ڽ�Ŭ������ ȣ���Ͽ� ����� �� �ִ� method
		System.out.println("�Ϲ� methodA");
	}

	// abstract method�� �ڽ�Ŭ�������� �ݵ�� Override - ������ ������
	public abstract void methodB(); // abstract method - method�� body ����

	public abstract int methodC();

	public static void main(String[] args) {
		// new AbstractSuper(); // abstract class�� ���� ��üȭ �� �� ����.

	}
}