package day1030;

/**
 * ���� package �ٸ� class�ּ� instance variable ���
 * public, protected, default
 * @author owner
 */
public class AccessModifier2 {

	public static void main(String[] args) {
		// ��üȭ
		AccessModifier am = new AccessModifier();
		// Use Variable
		System.out.println("public : " + am.pub);
		System.out.println("protected : " + am.pro);
		// System.out.println("private : " + am.pri); // private ��� �Ұ�
		System.out.println("default : " + am.def);
	}

}
