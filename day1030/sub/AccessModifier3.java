package day1030.sub;

import day1030.AccessModifier;

/**
 * �ٸ� package�� class�ּ� instance variable ���
 * public
 * @author owner
 */
public class AccessModifier3 {

	public static void main(String[] args) {
		// ��üȭ
		AccessModifier am = new AccessModifier();
		// Use Variable
		System.out.println("public : " + am.pub);
		// System.out.println("protected : " + am.pro);
		// System.out.println("private : " + am.pri);
		// System.out.println("default : " + am.def);
	}

}
