package day1030;

/**
 * instance variable�� ������������ ��� public, protected(inheritance), private,
 * default(class)
 * 
 * @author owner
 */
public class AccessModifier {
	public int pub;
	protected int pro;
	private int pri;
	int def;

	public static void main(String[] args) {
		// ��üȭ
		AccessModifier am = new AccessModifier();
		// Use Variable
		System.out.println("AccessModifier : " + am.pub + " / " + am.pro + " / " + am.pri + " / " + am.def);
	}

}
