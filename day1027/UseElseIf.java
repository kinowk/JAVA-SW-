package day1027;

class UseElseIf {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		System.out.print(score + "���� ");
		if (score < 0) {
			System.out.println("0���� �۾Ƽ� ����");
		} else if (score > 100) {
			System.out.println("100���� Ŀ�� ����");
		} else {
			System.out.println("��ȿ����");
		}

		if (score >= 0 && score <= 40) {
			System.out.println("����");
		} else if (score > 40 && score <= 60) {
			System.out.println("�ٸ��������� ����");
		} else if (score > 60 && score <= 100) {
			System.out.println("�հ�");
		}

		System.out.println("----------------------------------------");
		int birthYear = Integer.parseInt(args[1]);
		if (birthYear % 12 == 0) {
			System.out.println("�����̶�");
		} else if (birthYear % 12 == 1) {
			System.out.println("�߶�");
		} else if (birthYear % 12 == 2) {
			System.out.println("����");
		} else if (birthYear % 12 == 3) {
			System.out.println("������");
		} else if (birthYear % 12 == 4) {
			System.out.println("���");
		} else if (birthYear % 12 == 5) {
			System.out.println("�Ҷ�");
		} else if (birthYear % 12 == 6) {
			System.out.println("ȣ���̶�");
		} else if (birthYear % 12 == 7) {
			System.out.println("�䳢��");
		} else if (birthYear % 12 == 8) {
			System.out.println("���");
		} else if (birthYear % 12 == 9) {
			System.out.println("���");
		} else if (birthYear % 12 == 10) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}
		/*
		 * int i = birthYear % 12; if (i == 0) { System.out.println("������"); } else if (i
		 * == 1) { System.out.println("��"); } else if (i == 2) {
		 * System.out.println("��"); } else if (i == 3) { System.out.println("����"); }
		 * else if (i == 4) { System.out.println("��"); } else if (i == 5) {
		 * System.out.println("��"); } else if (i == 6) { System.out.println("ȣ����"); }
		 * else if (i == 7) { System.out.println("�䳢"); } else if (i == 8) {
		 * System.out.println("��"); } else if (i == 9) { System.out.println("��"); } else
		 * if (i == 10) { System.out.println("��"); } else { System.out.println("��"); }
		 */
		System.out.println("-----------------------------------------");
		int i = birthYear % 12;
		switch (i) {
		case 0:
			System.out.println("�����̶�");
			break;
		case 1:
			System.out.println("�߶�");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("���");
			break;
		case 5:
			System.out.println("�Ҷ�");
			break;
		case 6:
			System.out.println("ȣ���̶�");
			break;
		case 7:
			System.out.println("�䳢Ƽ");
			break;
		case 8:
			System.out.println("���");
			break;
		case 9:
			System.out.println("���");
			break;
		case 10:
			System.out.println("����");
			break;
		default:
			System.out.println("���");
		}
	}
}