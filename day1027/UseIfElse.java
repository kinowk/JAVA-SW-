package day1027;

/*
if-else
*/
class UseIfElse {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.print(num + "�� ");
		if (num >= 0) {
			System.out.print("���");
		} else {
			System.out.print("����");
		}
		if (num % 2 == 0) {
			System.out.println(" ¦��");
		} else {
			System.out.println(" Ȧ��");
		}

		int age = Integer.parseInt(args[1]);
		System.out.print(args[1] + "���� ");
		if (age >= 19) {
			System.out.println("����");
		} else {
			System.out.println("�̼���");
		}

		int score = Integer.parseInt(args[2]);
		System.out.print(args[2] + "���� ");
		if (score >= 0 && score <= 100) {
			System.out.println("��ȿ����");
		} else {
			System.out.println("�߸��� ����");
		}

		if (args[3].equals("Java") || args[3].equals("Python") || args[3].equals("C#")) {
			System.out.println("�ֱ� OOP���");
		} else {
			System.out.println("���α׷��� ���");
		}

		long inputValue = Long.parseLong(args[4]);
		System.out.print(args[4] + "�� ");
		if (inputValue >= Integer.MIN_VALUE && inputValue <= Integer.MAX_VALUE) { // Integer.MIN_VALUE == -2147483648,
																					// Integer.MAX_VALUE == 2147483647
			System.out.println("int");
		} else {
			System.out.println("long");
		}
	}
}