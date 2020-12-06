package day1105;

public class Homework {

	private String ssn;
	private int genderNum;

	public Homework() { // default constructor

	}

	public Homework(String ssn) { // ������
		this.ssn = ssn;
		genderNum = Integer.parseInt(ssn.substring(7, 8));
	}

	private int getYear() {
		int year = 0;
		int prefixYear = 1800;
		if (genderNum == 1 || genderNum == 2 || genderNum == 5 || genderNum == 6) {
			prefixYear = 1900;
		} else if (genderNum == 3 || genderNum == 4) {
			prefixYear = 2000;
		}
		year = prefixYear + Integer.parseInt(ssn.substring(0, 2));
		return year;
	}

	public boolean checkSsn() { // �Է¹��� �ֹι�ȣ 14�ڸ� Ȯ��
		return ssn.length() == 14;

//		if (ssn.length() == 14) {
//			return true;
//		} else {
//			return false;
//		}

	}

	public boolean checkHyphen() { // '-' Ȯ��
		return ssn.charAt(6) == '-';

		// return ssn.contains("-");

//		if (ssn.contains("-")) {
//			return true;
//		} else {
//			return false;
//		}
	}

	public String getBirth() {
		String resultBirth = "";
		resultBirth = getYear() + "�� " + ssn.substring(2, 4) + "�� " + ssn.substring(4, 6) + "��";
		return resultBirth;
	}

//	public String birth() { // ������� ��ȯ
//		String year = "19" + ssn.substring(0, 2) + "��";
//		String month = ssn.substring(2, 4).concat("��");
//		String day = ssn.substring(4, 6).concat("��");
//		return year.concat(month).concat(day);
//	}

	public int age() { // ���� ��ȯ
		return 2020 - getYear() + 1;
	}

	public String gender() { // ���� ��ȯ
		int gender = ssn.charAt(7);
//		if (gender % 2 == 0) {
//			return "����";
//		} else {
//			return "����";
//		}
		String gender1 = "����";
		if (gender % 2 == 0) {
			gender1 = "����";
		}
		return gender1;
	}

	public String zodiac() { // �� ��ȯ
		switch (getYear()) {
		case 0:
			return "�����̶�";
		case 1:
			return "�߶�";
		case 2:
			return "����";
		case 3:
			return "������";
		case 4:
			return "���";
		case 5:
			return "�Ҷ�";
		case 6:
			return "ȣ���̶�";
		case 7:
			return "�䳢��";
		case 8:
			return "���";
		case 9:
			return "���";
		case 10:
			return "����";
		default:
			return "���";
		}
	}

	public String getZodiac() {
		String[] temp = { "������", "��", "��", "����", "��", "��", "ȣ����", "�䳢", "��", "��", "��", "��" };
		return temp[getYear() % 12];
	}

}
