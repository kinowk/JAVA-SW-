package day1104;

/**
 * this�� method���� constructor���� �ٸ�constructor�� ȣ���� ��
 * 
 * @author owner
 */
public class UseThis {

	public UseThis() { // new UseThis();
		this(0);
		System.out.println("�⺻������ : default constructor");
	}

	public UseThis(int temp) { // new UseThis(intValue);
		//this(); // Constructor call must me the first statement in a constructor
		System.out.println("parameter�ִ� constructor : overloading constructor");
	}
char c;
	public static void main(String[] args) {
		new UseThis();
	}

}
