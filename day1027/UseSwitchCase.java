package day1027;

/*
switch���� ���ǽ� ����� ���� �Ǵ� ���ڿ��̾�� �Ѵ�.
*/
class UseSwitchCase {
	// constant - �������� ����
	public static final int GRADE_A_PLUS = 10;
	public static final int GRADE_A = 9;
	public static final int GRADE_B = 8;
	public static final int GRADE_C = 7;
	public static final int GRADE_D = 6;

	public static void main(String[] args) {
		int i = 0;
		switch (i) { // byte, short, int, char, String type
		case 0:
			System.out.println("A");
		case 1:
			System.out.println("B");
		case 2:
			System.out.println("C");
		default:
			System.out.println("Z");
		} // break;�� ���� ��� �ش�case ������ case ���๮ ���� ����

		System.out.println("-----------------------------------");
		int score = Integer.parseInt(args[0]);
		char grade;
		System.out.print(args[0] + "���� ");
		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println(grade + "����");

		System.out.println("-----------------------------------");

		grade = 64;
		System.out.print(args[0] + "���� ");
		switch (score / 10) {
		case 6:
			grade++;
		case 7:
			grade++;
		case 8:
			grade++;
		case 9:
		case 10:
			grade++;
			break;
		default:
			grade += 6;
		}
		System.out.println(grade + "����");

		System.out.println("-----------------------------------");

		System.out.print(args[0] + "���� ");
		switch (score / 10) { // �������� ���� case�� constant
		case GRADE_A_PLUS:
		case GRADE_A:
			grade = 'A';
			break;
		case GRADE_B:
			grade = 'B';
			break;
		case GRADE_C:
			grade = 'C';
			break;
		case GRADE_D:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println(grade + "����");
	}
}