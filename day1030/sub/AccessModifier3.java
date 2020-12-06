package day1030.sub;

import day1030.AccessModifier;

/**
 * 다른 package의 class애서 instance variable 사용
 * public
 * @author owner
 */
public class AccessModifier3 {

	public static void main(String[] args) {
		// 객체화
		AccessModifier am = new AccessModifier();
		// Use Variable
		System.out.println("public : " + am.pub);
		// System.out.println("protected : " + am.pro);
		// System.out.println("private : " + am.pri);
		// System.out.println("default : " + am.def);
	}

}
