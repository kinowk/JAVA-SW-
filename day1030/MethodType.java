package day1030;

/**
 *	4 types method
 * @author owner
 */
public class MethodType {
	
	/**
	 * 고정된 work
	 */
	public void method1() {
		System.out.println("method1");
	}
	
	/**
	 * 동적인 work
	 * @param i
	 */
	public void method2(int i) {
		System.out.println("method2 " + i);
	}
	
	/**
	 * 고정 value
	 * @return
	 */
	public int method3() {
		return 30;
	}
	
	/**
	 * 가변 value
	 * @param c
	 * @return
	 */
	public int method4(char c) {
		return c;
	}
	
	public static void main(String[] args) {
		MethodType mt = new MethodType();
		
		mt.method1();
		
		mt.method2(10);
		
		int today = mt.method3();
		System.out.println(today);
		
		char c = 'a';
		int value = mt.method4(c);
		System.out.println(value);
	}

}
