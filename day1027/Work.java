package day1027;

class Work {

	public static final int LOCAL_BUS = 800;
	public static final int BUS = 1250;
	public static final int SUBWAY = 1350;

	public static void main(String[] args) {
		int distance = Integer.parseInt(args[1]);
		int default_fee = 0;
		int total_fee = 0;

		if (args[0].equals("��������") || args[0].equals("����") || args[0].equals("����ö")) {
			if (args[0].equals("��������")) {
				default_fee = Work.LOCAL_BUS;
			} else if (args[0].equals("����")) {
				default_fee = Work.BUS;
			} else {
				default_fee = Work.SUBWAY;
			}

			total_fee = default_fee;
			if (distance > 10) {
				total_fee = default_fee + (((distance - 10) / 5) + 1) * 100;
			}
			System.out.println("�Է� ���� ���� [ " + args[0] + " ]");
			System.out.println("�̵��Ÿ� [ " + distance + "km ]");
			System.out.println("�⺻��� [ " + default_fee + " ]");
			System.out.println("�ѿ�� [ " + total_fee + " ]");

		} else {
			System.out.println(args[0] + "�� ���߱�������� �ƴմϴ�.");
		}
	}
}
