package day1029;

/**
 * while�� - 0�� ~ ���Ǳ��� �ݺ�
 * 
 * @author owner
 */
public class UseWhile {

	public static void main(String[] args) {
		int i = 0;

		while (i < 10) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("---------------------------");
		// ������ 5�� ���
		int j = 1;
		while (j < 10) {
			System.out.println("5 * " + j + " = " + 5 * j);
			j++;
		}
		System.out.println("---------------------------");

		// 100�������� 0���� 1�� ����
		int k = 100;
		while (k >= 0) {
			System.out.println(k);
			k--;
		}

	}

}
