package day1029;

/**
 * do{ ���๮ }while(���ǽ�);
 * 
 * @author owner
 */
public class UseDoWhile {

	public static void main(String[] args) {
		int i = 100;

		do {
			System.out.println("i = " + i);
			i++;
		} while (i < 10);
		System.out.println("--------------------------------------------------------------------");

		// 1 ~ 100������ �� �߿� 4�� ��� ��, 4�� ��� ������ ���
		// while��
		int sum = 0;
		int count = 0;
		i = 1;
		while (i <= 100) {
			if (i % 4 == 0) {
				count++;
				sum += i;
			}
			i++;
		}
		System.out.println("1 ~ 100���� 4�� ����� �� : " + sum + ", 4�� ����� ���� : " + count);

		System.out.println("--------------------------------------------------------------------");
		// do-while��
		i = 1;
		sum = 0;
		count = 0;
		do {
			if (i % 4 == 0) {
				count++;
				sum += i;
			}
			i++;
		} while (i <= 100);
		System.out.println("1 ~ 100���� 4�� ����� �� : " + sum + ", 4�� ����� ���� : " + count);
	}

}
