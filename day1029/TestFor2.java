package day1029;

/**
 * ���� for�� * @author owner
 */
public class TestFor2 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("-------------------");
			for (int j = 0; j < 6; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println("-------------------");
		}

		System.out.println();

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "�� ����");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println(i + "�� ��");
		}

		System.out.println();

		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				System.out.print(i + " " + j + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + " " + j + " ");
			}
			System.out.println();
		}
	}

}