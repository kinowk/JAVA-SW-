package day1111;

/**
 * interface �ȿ��� method�� body�� ������ �� �ִ� default method ���<br>
 * extends�� ����Ͽ� interface���� ���� ���<br>
 * �ڽ� interface�� �θ� interface�� abstract method�� Override ���� �ʴ´�.(class�� ������ ������)
 * 
 * @author owner
 */
public interface UseDefaultMethod extends SuperA, SuperB {
	public void methodC();

	public default void methodDefault() {
		System.out.println("interface�� �����ϴ� ������ method");
	}// methodDefault

	public default String methodDefault1() {
		return "return�� �ִ� default method";
	}// methodDefault1
}
