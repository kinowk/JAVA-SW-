package day1030;

/**
 * instance variable�� �ڵ��ʱ�ȭ ��
 * 
 * @author owner
 */
public class InstanceVariableDefaultValue {
	int i; // 0
	char c; // \u0000
	double d; // 0.0
	boolean b; // false
	// null
	int[] arr;
	String str;
	AccessModifier am; // class

	public static void main(String[] args) {
		InstanceVariableDefaultValue ivdv = new InstanceVariableDefaultValue();
		System.out.println("�ڵ��ʱ�ȭ ��");
		System.out.println("int : " + ivdv.i);
		System.out.println("char : " + (int) ivdv.c);
		System.out.println("double : " + ivdv.d);
		System.out.println("boolean : " + ivdv.b);
		System.out.println("int[] : " + ivdv.arr);
		System.out.println("String : " + ivdv.str);
		System.out.println("class : " + ivdv.am);
	}

}
