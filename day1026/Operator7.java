package day1026;
/*
대입연산자 =, +=, -=, *=, /=, %=, <<=, >>=, >>>=, &=, |=, ^=,
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
		System.out.println(j+"의 절댓값 : " + ( j> 0 ? j : -j ) );

		char c = 'ㄱ'; //12593 - 
		System.out.println(c+"의 하위 1byte 값 : " + (byte)c);
		System.out.println(c+"의 하위 1byte 값 : " + ( c & 0x00FF ));
		System.out.println(c+"의 상위 1byte 값 : " + ( c & 0xFF00 ));
	}
}
