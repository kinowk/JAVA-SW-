package day1102;

/**
 * printf(); - variable arguments�� ����� method
 * 
 * @author owner
 */
public class UsePrintf {

	public static void main(String[] args) {
		int age = 27;
		int year = 2020;
		// %d - decimal
		System.out.printf("%d�� ���ش�%d��\n", age, year);

		// %c - character
		System.out.printf("%c %c\n", 'A', '��');

		// %f - floating-point
		System.out.printf("%.2f %.1f\n", 2020.1102, 2020.1502); // �Ҽ������� n��° �ڸ����� �ݿø�

		// %s - string
		System.out.printf("%s %s\n", "������", "������");

		// �ڸ��� ����
		System.out.printf("[%4d] [%-5d]\n", 11, 15); // 4bit ������ ����, 5bit ���� ����
		System.out.printf("[%8.1f] [%-8.1f]\n", 12.345678, 12.345678); // 8bit ������ ����, 8bit ���� ����
		System.out.format("[%4d] [%-5d]\n", 11, 15);
		System.out.format("[%8.1f] [%-8.1f]\n", 12.345678, 12.345678);
	}

}
