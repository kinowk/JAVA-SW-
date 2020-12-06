package day1102;

/**
 * variable arguments(����������)�� ��� method�� ȣ���� �� arguments(�Է°�)�� �������� �־ ȣ�� ������
 * method ���� variable arguments�� ������ �� ���� ���������� ������ �� �ִ�.
 * 
 * @author owner
 */
public class UseVariableArguments {
	public void testVA(int... param) {
		// System.out.println(param); // array�� ������ �������̹Ƿ� �ּҰ� ��µȴ�.
		for (int val : param) { // ���� for��
			System.out.println(val);
		}
	}
		
	// public int sumAge(int... paramAge, char c) { // �������� ����
	public int sumAge(char c, int... paramAge) { // int[] paramAge; - array�� ó���ȴ�.
		int sum = 0;
		for(int inputAge : paramAge) {
			sum += inputAge;
		}
		return sum;
	}

	public static void main(String[] args) {
		UseVariableArguments uva = new UseVariableArguments();
		// uva.testVA(); // �Է°��� �پ��ϰ� �����Ͽ� ȣ�� ����
		uva.testVA(1, 2);
		
		int sumAge = uva.sumAge('0', 27, 1);
		System.out.println(sumAge);
	}

}
