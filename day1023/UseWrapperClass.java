package day1023;
/*
primitive data type을 객체로 감싸서 여러가지 기능 Wrapper Class 사용
*/
class UseWrapperClass{
	public static void main(String[] args) {
		//constant
		System.out.println("byte의 최소값 : " + Byte.MIN_VALUE + ", 최대값 : " + Byte.MAX_VALUE);
		System.out.println();
		//기능
		int i = 100;
		System.out.println(i + "를 Binary로 변환 : " + Integer.toBinaryString(i)); //java.lang pachage - Integer class - toBinaryString method
		System.out.println(i + "를 Octal로 변환 : " + Integer.toOctalString(i));
		System.out.println(i + "를 Hex로 변환 : " + Integer.toHexString(i));

	}
}
