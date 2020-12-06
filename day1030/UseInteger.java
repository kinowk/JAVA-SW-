package day1030;

/**
 * Integer class���� �����ϴ� instance method�� static method ���<br>
 * - instance method�� ��ü�� instance variable�� ����Ͽ� ó��<br>
 * - static method�� parameter�� �Էµ� �����θ� ����ó��
 * 
 * @author owner
 */
public class UseInteger {

	public static void main(String[] args) {
		// instance method
		Integer i = new Integer(30);
		System.out.println("��ü i : " + i);

		byte b = i.byteValue(); // i��ü�� �����ϰ� �ִ� instance variable�� ���� instance method�� ����Ͽ� byte���� ������ ��ȯ
		System.out.println("byte : " + b);

		double d = i.doubleValue();
		System.out.println("double : " + d);

		// staic method�� ��ü�� ���� ���� �ƴ� �Էµ� ��(parameter)���θ� �Ͻ����� ó��
		Integer.parseInt("2020");
	}

}
