package day1027;

class Homework1 {

	public static final int TOWN_BUS = 850;
	public static final int BUS = 1250;
	public static final int SUBWAY = 1350;
	public static final int ADD_FEE = 100;

	public static void main(String[] args) {

		int distance = Integer.parseInt(args[1]);

		int basicFee;
		int extraFee;
		int fee;

		if (distance <= 10) {
			extraFee = 0;
		} else {
			extraFee = (distance - 1) / 5 - 1;
		}

		if (args[0].equals("��������")) {
			basicFee = TOWN_BUS;
			fee = TOWN_BUS + ADD_FEE * extraFee;
			System.out.println("�Է±������ : " + args[0] + ", �̵��Ÿ� : " + distance + "km, �⺻��� : " + basicFee + "��, �� ��� : "
					+ fee + "��");
		} else if (args[0].equals("����")) {
			basicFee = BUS;
			fee = BUS + ADD_FEE * extraFee;
			System.out.println("�Է±������ : " + args[0] + ", �̵��Ÿ� : " + distance + "km, �⺻��� : " + basicFee + "��, �� ��� : "
					+ fee + "��");
		} else if (args[0].equals("����ö")) {
			basicFee = SUBWAY;
			fee = SUBWAY + ADD_FEE * extraFee;
			System.out.println("�Է±������ : " + args[0] + ", �̵��Ÿ� : " + distance + "km, �⺻��� : " + basicFee + "��, �� ��� : "
					+ fee + "��");
		} else {
			System.out.println("���߱�������� �ƴմϴ�.");
		}
		System.out.println("-------------------------------------------");
	}
}