package day1111;

/**
 * interface 안에서 method의 body를 구현할 수 있는 default method 사용<br>
 * extends를 사용하여 interface끼리 다중 상속<br>
 * 자식 interface는 부모 interface의 abstract method를 Override 하지 않는다.(class만 구현의 강제성)
 * 
 * @author owner
 */
public interface UseDefaultMethod extends SuperA, SuperB {
	public void methodC();

	public default void methodDefault() {
		System.out.println("interface가 제공하는 구현된 method");
	}// methodDefault

	public default String methodDefault1() {
		return "return이 있는 default method";
	}// methodDefault1
}
