package day1027;

class UseIf {
	public static void main(String[] args) {
		int inputValue = Integer.parseInt(args[0]);
		if (inputValue < 0) {
			inputValue = -inputValue;
		}
		System.out.println(args[0] + "�� ������ " + inputValue + "�̴�.");

		System.out.println("-----------------------------------------------");
		inputValue = Integer.parseInt(args[0]);
		if (inputValue >= 0 && inputValue <= 100) {
			System.out.println("�Էµ� ���� " + inputValue + "�Դϴ�.");
		}

		System.out.println("\"�����մϴ�.\"");
		// ���ڿ��� �񱳴� equals method�� ����Ͽ� ��
		System.out.println(args[1].equals("Java")); // equals - ��ҹ��� ����
		System.out.println(args[1].equalsIgnoreCase("Java")); // equalsIgnoreCase - ��ҹ��� ����X
		System.out.println(args[2].equals("�ڹ�"));
		if (args[2].equals("�ڹ�")) {
			System.out.println("OOP(Object Oriented Programming) Language");
			System.out.println("Write Once Run Anywhere : �� �� �ۼ��� �ڵ�� OS�� ������� ���డ��");
		}
	}
}