package day1021;

/*
1. Source Code write
 주의 - 대소문자를 구분한다.
      - 괄호는 짝으로 구성한다. (), {}, []
      - 문장의 끝에는 반드시 ;을 붙힌다.
*/
public class Hello {
	// main method : Hello class를 단독으로 실행 시킬 때 main method를 정의
	// Java Application
	public static void main(String[] args) {

		System.out.println("Hello");
		System.out.println("Java");
		System.out.println("Hello Java :) 2020-10-21");

	}// main

}// class

/*
 * 2. Save : 파일명.java - 파일명은 class의 이름과 동일하게 설정한다. Hello.java
 * 
 * 3. Compile ( Compiler - javac.exe ) : DOS창에서 Source Code가 있는 위치에서 수행 javac
 * -option -파일명.java Success - bytecode 생성 ( 파일명.class )
 * 
 * 4. Run ( 실행기 - java.exe ) : JVM 실행되고 class가 loading되어 실행된다. java -option
 * -bytecode명 ( .class 안씀 )
 */