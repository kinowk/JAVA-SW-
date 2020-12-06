package day1030;

/**
 * instance variable의 접근제한자의 사용 public, protected(inheritance), private,
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
		// 객체화
		AccessModifier am = new AccessModifier();
		// Use Variable
		System.out.println("AccessModifier : " + am.pub + " / " + am.pro + " / " + am.pri + " / " + am.def);
	}

}
