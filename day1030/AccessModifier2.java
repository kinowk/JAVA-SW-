package day1030;

/**
 * 같은 package 다른 class애서 instance variable 사용
 * public, protected, default
 * @author owner
 */
public class AccessModifier2 {

	public static void main(String[] args) {
		// 객체화
		AccessModifier am = new AccessModifier();
		// Use Variable
		System.out.println("public : " + am.pub);
		System.out.println("protected : " + am.pro);
		// System.out.println("private : " + am.pri); // private 사용 불가
		System.out.println("default : " + am.def);
	}

}
