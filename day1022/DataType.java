package day1022;
/*
�ڵ� ����ȯ, �����
*/

class DataType 
{
	public static void main(String[] args) 
	{
		byte a = 10; //�ڵ�����ȯ
		short b = 20; //�ڵ�����ȯ
		int c = 30;
		long d = 40;
		long e = 2147483648L; //�����
		System.out.println("byte : " + a + ", short : " + b + ", int : " + c + ", long : " + d + "," + e );
		
		System.out.println("------------------------------------------------------------------------------");
		char f = 'A'; //�����ڵ� 65
		char g = 'a'; //�����ڵ� 97
		char h = '0'; //�����ڵ� 48
		System.out.println("char : " + f + ", " + g + ", " + h);
		
		System.out.println("------------------------------------------------------------------------------");
		float i = 2020.22f; //8byte literal�� 4byte literal�� ���
		double j = 2020.22;
		System.out.println("float : "+i+", double : "+ j);

		System.out.println("------------------------------------------------------------------------------");
		boolean k = true;
		boolean l = false;
		System.out.println("boolean : "+k+", "+l);

		byte num1=3;
		short num2=4;
		//short result = num1 + num2; // num1+num2 - int (byte�� short�� ��ȯ�ǰ� short + short�� ����Ǿ� ����� int)
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
