package day1026;
/*
���Կ����� =, +=, -=, *=, /=, %=, <<=, >>=, >>>=, &=, |=, ^=,
*/
class Operator7 {
	public static void main(String[] args) {
		int i = 3;
		i += 3; //6
		i -= 2; //4
		i *= 3; //12
		i /= 5; //2
		i %= 3; //2
		
		i <<= 4; //32
		i >>= 2; //8
		i >>>= 3; //1

		i &= 15; //1
		i |= 9; //9
		i ^= 6; //15
		System.out.println("i = "+i);
		System.out.println("----------------------------------");
		int j = -10;
		System.out.println(j+"�� ���� : " + ( j> 0 ? j : -j ) );

		char c = '��'; //12593 - 
		System.out.println(c+"�� ���� 1byte �� : " + (byte)c);
		System.out.println(c+"�� ���� 1byte �� : " + ( c & 0x00FF ));
		System.out.println(c+"�� ���� 1byte �� : " + ( c & 0xFF00 ));
	}
}
