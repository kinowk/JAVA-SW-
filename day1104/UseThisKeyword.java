package day1104;

/**
 * this - ȣ���ϴ� ��ü�� �ּҸ� ����
 * 
 * @author owner
 */
public class UseThisKeyword {
	int i;

	public void useInstance(UseThisKeyword utk, int i) {
		// i = i; - local variable�� instance variable�� name�� ���� ��� local variable�� ���� ���
		utk.i = i;
		System.out.println("stack) i = " + i);
	}

	public void UseThis(int i) {
		System.out.println(this);
		this.i = i;
//		this.i = i;
//		System.out.println("this) i = " + i);
	}
	public static void main(String[] args) {
		UseThisKeyword utk = new UseThisKeyword();
		UseThisKeyword utk1 = new UseThisKeyword();
		System.out.println(utk + " / " + utk1); // heap�� ������ instance �ּ�
//		utk.useInstance(utk, 2020);
//		System.out.println("main) i = " + utk.i);
		utk.UseThis(5);
		utk1.UseThis(0);
	}

}
