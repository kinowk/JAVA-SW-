package day1110;

/**
 * OverrideSuper�� �ڽ�Ŭ����<br>
 * �ڽ�Ŭ���������� �θ�Ŭ������ �� �� �ִ�.<br>
 * �ڽ�Ŭ������ ��üȭ�Ǹ� �θ�Ŭ������ ���� �����ǰ� �� �� �ڽ�Ŭ������ �����ȴ�.
 * 
 * @author owner
 */
public class OverrideSub2 extends OverrideSuper {
	/**
	 * Override�� method ����) ��ȯ��, method��, parameter�� ���ƾ� �Ѵ�.
	 */
	@Override
	public void methodA() {
		System.out.println("OverrideSub2 class���� Override�� methodA");
	}

	@Override
	public void methodB() {
		System.out.println("OverrideSub2 class���� Override�� methodB");
	}

	public void childMehtod() { // is a ������ ��üȭ�� �Ǿ��� ������ ����� �� ����.
		System.out.println("OverrideSub2 class�� method");
	}
}
