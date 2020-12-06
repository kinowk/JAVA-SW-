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
				System.out.println("나이는 : " + age);
				System.out.println("성별 : ".concat(gender));
				System.out.println("띠 : ".concat(zodiac));
			} else {
				System.out.println("-을 확인하세요.");
			}
		} else {
			System.out.println("주민번호의 자릿수를 확인하세요.");
		}
		
		
	}
}
