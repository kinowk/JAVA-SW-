package day1110;

/**
 * AbstractSuper�� �ڽ�Ŭ����(abstract class�� �ڽ�Ŭ����)<br>
 * �θ�Ŭ������ ��� abstract method�� �ݵ�� Override�ؾ��Ѵ�.
 * 
 * @author owner
 */
public class AbstractSub extends AbstractSuper {

	public AbstractSub() {
		System.out.println("�ڽ�Ŭ����");
	}

	public static void main(String[] args) {
		AbstractSub as = new AbstractSub();
		as.methodA(); // �θ��� �Ϲ� method
		as.methodB(); // �θ��� abstract method�� Override�� method
		System.out.println(as.methodC()); // �θ��� abstract method�� Override�� method

	}// main

	@Override
	public void methodB() {
		// super.methodB(); // abstract method�� ���� ȣ���� �� ����.
		System.out.println("Override�� methodB");
	}

	@Override
	public int methodC() {
		return 11;
	}

}// class
