package day1104;

/**
 * this의 method형식 constructor에서 다른constructor를 호출할 때
 * 
 * @author owner
 */
public class UseThis {

	public UseThis() { // new UseThis();
		this(0);
		System.out.println("기본생성자 : default constructor");
	}

	public UseThis(int temp) { // new UseThis(intValue);
		//this(); // Constructor call must me the first statement in a constructor
		System.out.println("parameter있는 constructor : overloading constructor");
	}
char c;
	public static void main(String[] args) {
		new UseThis();
	}

}
