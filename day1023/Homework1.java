package day1023;
class Homework1 {
	public static void main(String[] args) {
		System.out.println("byte�� �ּҰ� : " + Byte.MIN_VALUE + ", �ְ� : " + Byte.MAX_VALUE);
		System.out.println("short�� �ּҰ� : " + Short.MIN_VALUE + ", �ְ� : " + Short.MAX_VALUE);
		System.out.println("int�� �ּҰ� : " + Integer.MIN_VALUE + ", �ְ� : " + Integer.MAX_VALUE);
		System.out.println("long�� �ּҰ� : " + Long.MIN_VALUE + ", �ְ� : " + Long.MAX_VALUE);
		System.out.println("float�� �ּҰ� : " + Float.MIN_VALUE + ", �ְ� : " + Float.MAX_VALUE);
		System.out.println("double�� �ּҰ� : " + Double.MIN_VALUE + ", �ְ� : " + Double.MAX_VALUE);
		System.out.println("char�� �ּҰ� : " + (int)Character.MIN_VALUE + ", �ְ� : " + (int)Character.MAX_VALUE);
		// MIN_VALUE == \u0000 (��������ǹ�), MAX_VALUE == \uFFFF
	}
}
