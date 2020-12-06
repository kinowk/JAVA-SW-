package day1026;
/*
main method의 arguments input
java class를 실행할 때 외부에서 값을 넣어 실행
외부 값을 입력받으면 사용자가 입력한 값으로 프로그램을 실행하기 때문에 프로그램이 동적으로 동작한다.
*/
class UseArguments {
	public static void main(String[] args ) {
		System.out.println("첫번쨰 입력값 : " + args[0] );
		System.out.println("두번째 입력값 : " + args[1] );
		System.out.println("세번쨰 입력값 : " + args[2] );
		//외부 값을 입력받기위한 parameter의 data type은 String
		System.out.println(args[0] + args[1]); // 10 + 22 -> 1022 (String)
		
		int num1 = Integer.parseInt(args[0]); //Integer.parseInt() method를 사용하여 string tyoe 10을 int type으로 변환
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1+num2);
	}
}
