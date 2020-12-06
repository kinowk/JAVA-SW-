package day1030;

/**
 * instance variable의 자동초기화 값
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
		System.out.println("자동초기화 값");
		System.out.println("int : " + ivdv.i);
		System.out.println("char : " + (int) ivdv.c);
		System.out.println("double : " + ivdv.d);
		System.out.println("boolean : " + ivdv.b);
		System.out.println("int[] : " + ivdv.arr);
		System.out.println("String : " + ivdv.str);
		System.out.println("class : " + ivdv.am);
	}

}
