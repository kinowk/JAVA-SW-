package day1023;
/*
8진수(Octal) - 0
10진수(Decimal)
16진수(Hex) - 0x
*/
class UseRadix{
	public static void main(String[] args) {
		int i = 012; //octal
		int j = 10; //decimal
		int k = 0xa; //hex
		System.out.println(i + j + k);

		//hex
		int a0 = 0xab;
		int b0 = 0x6d;
		System.out.println(a0 + " " + b0);
		//octal
		int a1 = 027;
		int b1 = 050;
		System.out.println(a1 + " " + b1);
	}
}
