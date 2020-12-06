package day1111;

/**
 * 구현 클래스가 반드시 구현해야할 일의 목록 정의
 * 
 * @author owner
 */
public interface TestSuper {
//	int i ; // variable X
	public static final int MAX = 999999;
	
//	public TestSuper() { // Interfaces cannot have constructors
//		
//	}
	
//	public void test() { // Abstract methods do not specify a body
//		
//	}
	
	// interface는 abstract method만
	public void methodA(); // abstract method - interface에서 abstract 생략가능
	public abstract void methodB(); 
	public abstract String name(); 
	
}//interface
