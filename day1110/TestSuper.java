package day1110;

/**
 * 부모클래스 : 자식클래스이 사용할 공통 코드 정의
 * 
 * @author owner
 */
public class TestSuper {

	int i;
	int j;

	public TestSuper() {
		System.out.println("TestSuper의 기본생성자(Parent)");
	} // TestSuper

	public TestSuper(int i) {
		this();
		System.out.println("TestSuper의 매개변수 있는 생성자(Parent)");

	}
	
	public void print() {
		System.out.println("부모 : i = " + i + ", j : " + j);
	}
}