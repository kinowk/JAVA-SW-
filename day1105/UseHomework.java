package day1105;

public class UseHomework {

	public static void main(String[] args) {
		Homework homework = new Homework("940701-1234567");
		if (homework.checkSsn()) {
			if (homework.checkHyphen()) {
				String birth = homework.getBirth();
				int age = homework.age();
				String gender = homework.gender();
				String zodiac = homework.getZodiac();
				System.out.println(birth);
				System.out.println("���̴� : " + age);
				System.out.println("���� : ".concat(gender));
				System.out.println("�� : ".concat(zodiac));
			} else {
				System.out.println("-�� Ȯ���ϼ���.");
			}
		} else {
			System.out.println("�ֹι�ȣ�� �ڸ����� Ȯ���ϼ���.");
		}
		
		
	}
}
