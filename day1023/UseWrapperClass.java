package day1023;
/*
primitive data type�� ��ü�� ���μ� �������� ��� Wrapper Class ���
*/
class UseWrapperClass{
	public static void main(String[] args) {
		//constant
		System.out.println("byte�� �ּҰ� : " + Byte.MIN_VALUE + ", �ִ밪 : " + Byte.MAX_VALUE);
		System.out.println();
		//���
		int i = 100;
		System.out.println(i + "�� Binary�� ��ȯ : " + Integer.toBinaryString(i)); //java.lang pachage - Integer class - toBinaryString method
		System.out.println(i + "�� Octal�� ��ȯ : " + Integer.toOctalString(i));
		System.out.println(i + "�� Hex�� ��ȯ : " + Integer.toHexString(i));

	}
}
