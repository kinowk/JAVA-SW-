package day1030.sub;

import day1030.AccessModifier;

/**
 * 다른package에 inheritance의 child class(AccessModifier4)에서 parent
 * class(AccessModifier)의 instance variable 사용 public, protected
 * 
 * @author owner
 */
public class AccessModifier4 extends AccessModifier {

	public static void main(String[] args) {
		// child class 객체화
		AccessModifier4 am4 = new AccessModifier4();

		// Use Variable
		System.out.println("public : " + am4.pub);
		System.out.println("protected : " + am4.pro);
//		System.out.println("private : " + am4.pri);
//		System.out.println("default : " + am4.def);
	}

}
