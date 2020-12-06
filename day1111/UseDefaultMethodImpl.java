package day1111;

/**
 * interface�� ������ class<br>
 * interface�� ����� �޾Ҵٸ� �θ� interface�� ��� abstract method�� Override �ؾ��Ѵ�.
 * 
 * @author owner
 */
public class UseDefaultMethodImpl implements UseDefaultMethod {

	public static void main(String[] args) {
		// is a ������ ��üȭ
		UseDefaultMethod udm = new UseDefaultMethodImpl();
		// udm ��ü�� ȣ�� ������ method - ������ interface�� �����ϴ� ��� abstract method, default
		// method
		udm.methodA(); // ȣ����� ������ �ڽ�Ŭ������ ��������ȯ �Ͽ� ȣ�� - ((UseDefaultMethodImpl)udm.)methodA();

		int temp = udm.methodB("�ȳ�");
		System.out.println(temp);

		udm.methodC();

		udm.methodDefault(); // interface�� default method ȣ��

		udm.methodDefault1(); // interface�� default method ȣ��
		System.out.println(udm.methodDefault1());
	}// main

	/**
	 * SuperA interface�� abstract method
	 */
	@Override
	public void methodA() {
		System.out.println("Override�� methodA");
	}

	/**
	 * SuperB interface�� abstract method
	 */
	@Override
	public int methodB(String input) {
		return 11;
	}

	/**
	 * UseDefaultMethod�� abstract method
	 */
	@Override
	public void methodC() {
		System.out.println("Override�� methodC");
	}

}// class
