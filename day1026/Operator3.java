package day1026;
/*
쉬프트 연산자 <<, >>, >>>
*/
class Operator3 {
	public static void main(String[] args) {
		int i = 30;
		System.out.println(i + " << 2 = " + (i << 2));

		int j = 128;
		System.out.println(j + " >> 3 = " + (j >> 3));

		int k = 96;
		System.out.println(k + " >>> 4 = " + (k >>> 4));

		int l = 1;
		System.out.println(l+" << 31 = " + (l<<31));
	}
}
