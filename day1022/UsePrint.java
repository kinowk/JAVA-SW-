package day1022;
/*
	Java에서 제공하는 표준 출력 method사용
	System.out.print(); // 출력 후 줄변경 X
	System.out.println(); // 출력 후 줄변경
*/
class  UsePrint{
	public static void main(String[] args) 	{
	/*
		System.out.print("Hello");
		System.out.print("Java");
	*/
	//값에 대한 출력 - constant
	System.out.println(2020); //int
	System.out.println(2020.22); //double
	System.out.println('A'); //char
	System.out.println("오늘은 목요일입니다."); //string
	System.out.println(true); //boolean
	
	//값에 대한 출력 - variable
	int i=10; //기본형 데이터형
	UsePrint up = new UsePrint(); //참조형 데이터형
	System.out.println("---------------------------------------------");
	System.out.println(i);
	System.out.println(up);
	System.out.println("---------------------------------------------");
	System.out.println(10+22);
	System.out.println("10+22=" + 10 + 22 ); //String에 +기호를 사용하면 덧붙임 의미 - output 10+22=1022
	
	//System.out.println(); // 값을 넣지 않으면 줄바꿈 수행
	//System.out.print(); // 값을 넣지 않으면 error
	System.out.println("-----------------------A----------------------");
	System.out.println();
	System.out.println("-----------------------B----------------------");
	//System.out.print(); //error
	//byte b=128; //error(range)

	long j = 2147483647;
	long l = 3000000000L; //접미사 l이 붙어 리터럴의 크기가 8byt로 변경
	//상수 리터럴의 크기가 4byte이므로 약 21억까지만 저장가능
	//정수상수의 저장 literal의 크기를 늘릴 때 "형명시" 사용
	//형명시 : 상수뒤에만 붙일 수 있다.
	//literal의 크기를 일시적으로 변경할 때 사용
	//정수literal : L,l		4byte의 literal을 8byte로 크게 변환
	//실수literal : F,f		4byte의 literal을 4byte로 작게 변환
	//				D,d		크기변환 없음(8byte -> 8byte)

	//자동형변환 : int의 하위데이터형(byte, short)으로 변수를 선언하고 값을 할당할 때 발생
	byte b = 127; //4byte의 literal이 1byte로 변환되어 할당
	short s = 1;
	System.out.println(b+" , "+s);

	byte b1=10;
	byte b2=20;
	//byte result = 0;
	int result = 0;
	result = b1+b2; //constant를 할당하는게 아니라 byte타입의 변수 result에 int타입의 값 b1+b2을 할당 불가
	System.out.println(b1+"+"+b2+"="+result);
	
	char c = 44032; //'가'의 유니코드값 44032 
	System.out.println(c); //가
	
	float f = 3.14f; 
	//3.14는 접미사가 붙지 않았으므로 float literal이 아니라 double literal로 간주
	//3.14가 float타입의 범위에 속한 값임에도 불구하고 컴파일시 error
	System.out.println(f);

	double d = 3.14;
	System.out.println(d);
	}
}