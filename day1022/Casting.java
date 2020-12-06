package day1022;
/*
강제형변환
*/

class Casting{
	public static void main(String[] args) {
		float f = 3.1415f; //형명시 : literal의 크기자체를 축소하여 값 넣고 변수에 할당;
		int i = 0;

		//i=f; data type이 다름
		i = (int)f; //강제형변환 - 값 손실
		System.out.println("float : " + f + ", int : " + i);

		float f1 = (float)3.14; //강제형변환 : literal의 크기자체는 유지되고, 변수에 할당할 때 값을 float으로 변경하여 할당;
		System.out.println("float : " + f1);

		byte num1 = 4;
		byte num2 = 26;
		byte result = 0;

		result = (byte)(num1+num2);
		System.out.println(num1 + " + " + num2 + " = " + result);

		char c = 'A';
		System.out.println(c + "의 유니코드 값 : " + (int)c);
	}
}
