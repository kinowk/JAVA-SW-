package day1030.sub;

import day1030.AccessModifier;

/**
 * �ٸ�package�� inheritance�� child class(AccessModifier4)���� parent
 * class(AccessModifier)�� instance variable ��� public, protected
 * 
 * @author owner
 */
public class AccessModifier4 extends AccessModifier {

	public static void main(String[] args) {
		// child class ��üȭ
		AccessModifier4 am4 = new AccessModifier4();

		// Use Variable
		System.out.println("public : " + am4.pub);
		System.out.println("protected : " + am4.pro);
//		System.out.println("private : " + am4.pri);
//		System.out.println("default : " + am4.def);
	}

}
