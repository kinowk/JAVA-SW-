package day1022;
/*
자동 형변환, 형명시
*/

class DataType 
{
	public static void main(String[] args) 
	{
		byte a = 10; //자동형변환
		short b = 20; //자동형변환
		int c = 30;
		long d = 40;
		long e = 2147483648L; //형명시
		System.out.println("byte : " + a + ", short : " + b + ", int : " + c + ", long : " + d + "," + e );
		
		System.out.println("------------------------------------------------------------------------------");
		char f = 'A'; //유니코드 65
		char g = 'a'; //유니코드 97
		char h = '0'; //유니코드 48
		System.out.println("char : " + f + ", " + g + ", " + h);
		
		System.out.println("------------------------------------------------------------------------------");
		float i = 2020.22f; //8byte literal을 4byte literal로 축소
		double j = 2020.22;
		System.out.println("float : "+i+", double : "+ j);

		System.out.println("------------------------------------------------------------------------------");
		boolean k = true;
		boolean l = false;
		System.out.println("boolean : "+k+", "+l);

		byte num1=3;
		short num2=4;
		//short result = num1 + num2; // num1+num2 - int (byte가 short로 변환되고 short + short가 연산되어 결과가 int)
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
