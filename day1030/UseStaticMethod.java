package day1030;

/**
 * static method
 * 
 * @author owner
 */
public class UseStaticMethod {
	/**
	 * Àý´ñ°ª ±¸ÇÏ±â
	 * 
	 * @param value
	 * @return Àý´ñ°ª
	 */
	public static int abs(int value) {
		return value > 0 ? value : -value;
	}

	public static void main(String[] args) {
		int num = -31;
		int resultValue = UseStaticMethod.abs(num);
		System.out.println(resultValue);
	}

}
