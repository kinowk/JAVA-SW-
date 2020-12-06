package day1023;
class Homework1 {
	public static void main(String[] args) {
		System.out.println("byte의 최소값 : " + Byte.MIN_VALUE + ", 최고값 : " + Byte.MAX_VALUE);
		System.out.println("short의 최소값 : " + Short.MIN_VALUE + ", 최고값 : " + Short.MAX_VALUE);
		System.out.println("int의 최소값 : " + Integer.MIN_VALUE + ", 최고값 : " + Integer.MAX_VALUE);
		System.out.println("long의 최소값 : " + Long.MIN_VALUE + ", 최고값 : " + Long.MAX_VALUE);
		System.out.println("float의 최소값 : " + Float.MIN_VALUE + ", 최고값 : " + Float.MAX_VALUE);
		System.out.println("double의 최소값 : " + Double.MIN_VALUE + ", 최고값 : " + Double.MAX_VALUE);
		System.out.println("char의 최소값 : " + (int)Character.MIN_VALUE + ", 최고값 : " + (int)Character.MAX_VALUE);
		// MIN_VALUE == \u0000 (출력종료의미), MAX_VALUE == \uFFFF
	}
}
