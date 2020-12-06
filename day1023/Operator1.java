package day1023;
/*
단항operator
*/
class Operator1{
	public static void main(String[] args) {
		//~ : 1의 보수
		int i = 3;
		int j = -34;
		System.out.println("~"+i+" = "+ ~i); //부호 변경, 절댓값 1증가
		System.out.println("~"+j+" = "+ ~j); //부호 변경, 절댓값 1감소

		boolean flag1 = true, flag2 = false;
		System.out.println("!"+flag1+" = "+!flag1); // ! == not
 		System.out.println("!"+flag2+" = "+!flag2);

		i = 1;
		j = 5;
		++i; //2
		--j; //4
		System.out.println("전위 연산 후 i : " + i + ", j : " + j);

		i++; //3
		j--; //3
		System.out.println("후위 연산 후 i : " + i + ", j : " + j);

		i = 4;
		int result = 0;
		result = ++i;
		System.out.println("전위 연산 후 result : " + result + ", i : " + i);

		i = 4;
		result = 0;
		result = i++;
		System.out.println("전위 연산 후 result : " + result + ", i : " + i);
	}
}
