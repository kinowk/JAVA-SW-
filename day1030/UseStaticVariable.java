package day1030;

/**
 * static variable - ����
 * 
 * @author owner
 */
public class UseStaticVariable {
	static int i; // method area loading
	int j;

	public static void main(String[] args) {
		// static variable ���
		System.out.println(UseStaticVariable.i);

		UseStaticVariable usv1 = new UseStaticVariable();
		UseStaticVariable usv2 = new UseStaticVariable();
		usv1.j = 100;
		usv2.j = 200;
		System.out.println("usv1.j : " + usv1.j);
		System.out.println("usv2.j : " + usv2.j);

		// static variable�� ����
//		usv1.i=10000;
//		usv2.i=30000;
//		System.out.println("usv1.i : " + usv1.i );
//		System.out.println("usv2.i : " + usv2.i );
		
		UseStaticVariable.i=10000;
		System.out.println(UseStaticVariable.i);
	}

}
