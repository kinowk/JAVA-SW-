package day1111;

/**
 * ���� Ŭ������ �ݵ�� �����ؾ��� ���� ��� ����
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
	
	// interface�� abstract method��
	public void methodA(); // abstract method - interface���� abstract ��������
	public abstract void methodB(); 
	public abstract String name(); 
	
}//interface
