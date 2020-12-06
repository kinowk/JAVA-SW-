package day1022;
/*
method안에서 정의하고, method안에서만 사용되는 local variable - 자동초기화X
method가 호출되면 memory에 생성되고, 호출이 끝나면 사라짐
*/

class LocalVariable{
	public static void main(String[] args) 	{
		int i;
		i = 5;
		System.out.println(i);
		i = 200;
		System.out.println(i);
	
		//int j; //초기화 선언 필요
		//System.out.println(j); //error

		//int i; //같은 이름의 variable 선언 X 

		int maxScore = 100;
		int myScore = 80;
		System.out.println("내 점수 : " + myScore + ", 만점 : " + maxScore);
	}
}
