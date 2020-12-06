package day1112;

/**
 * Math class - The constructor Math() is not visible -> ��ü����X
 * 
 * @author owner
 */
public class UseMath {

	public UseMath() {
//		Math m = new Math(); // The constructor Math() is not visible

		double d = 10.19;
		System.out.println(d + "�� �ݿø� : " + Math.round(d)); // �Ҽ��� ù ��° �ڸ����� �ݿø� - return int
		System.out.println(d + "�� �ø� : " + Math.ceil(d)); // �ø� - return double
		System.out.println(d + "�� ���� : " + Math.floor(d)); // ���� - return double
		System.out.println(d + "�� �Ҽ��� ���� ���� : " + (int) d); // ���� - Casting

		int i = -11;
		System.out.println(i + "�� ���� : " + Math.abs(i)); // ����

//		Math.random(); // Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
		System.out.println(Math.random());
		System.out.println((int) (Math.random() * 10)); // 0 ~ 9
		System.out.println((int) (Math.random() * 6 + 1)); // 1 ~ 6

		// �빮�� A ~ Z �� ������ ����
		System.out.println((char) (Math.random() * 26 + 65)); // 'A' - 65, 'Z' - 90

	}

	public char randomPick() {
		char randomPick = (char) ((int) (Math.random() * 75 + 48)); // 48 ~ 122
		if ((randomPick >= '0' && randomPick <= '9') || (randomPick >= 'A' && randomPick <= 'Z')
				|| (randomPick >= 'a' && randomPick <= 'z')) {
			return randomPick;
		} else {
			return randomPick();
		}

	}

	public char[] createPassword() { // ������ ����, �빮��, �ҹ��ڷ� ������ 8�ڸ� password ����
		char[] tempPassword = new char[8];

		// 'A' - 65, 'Z' - 90, 'a' - 97, 'z' - 122, '0' - 48, '9' - 57
		// (char) (Math.random() * 26 + 65) - 'A' ~ 'Z'
		// (char) (Math.random() * 26 + 97) - 'a' ~ 'z'
		// (char) (Math.random() * 10 + 48) - '0' ~ '9'

		for (int i = 0; i < tempPassword.length; i++) {
			tempPassword[i] = randomPick();
		}
		return tempPassword;
	}

//	public char[] createPassword() {
//		char[] tempPassword = new char[8];
//		int flagNum = 0;
//		for (int i = 0; i < tempPassword.length; i++) {
//			flagNum = (int) (Math.random() * 3);
//			switch (flagNum) {
//			case 0:
//				tempPassword[i] = (char) (Math.random() * 26 + 65);
//				break;
//			case 1:
//				tempPassword[i] = (char) (Math.random() * 26 + 97);
//				break;
//			case 2:
//				tempPassword[i] = (char) (Math.random() * 10 + 48);
//			}
//		}
//		return tempPassword;
//	}

//	public char[] createPassword() {
//		char[] tempPassword = new char[8];
//		int tempNum = 0;
//		for (int i = 0; i < tempPassword.length; i++) {
//			tempNum = (int) (Math.random() * 123);
//			if ((tempNum > 47 && tempNum < 58) || (tempNum > 64 && tempNum < 91) || (tempNum > 96 && tempNum < 123)) {
//				tempPassword[i] = (char) tempNum;
//			} else {
//				i--;
//			}
//		}
//		return tempPassword;
//	}

//	public char[] createPassword() {
//		char[] tempPassword = new char[8];
//		String temp = "0123456789qazwsxedcrfvtgbyhnujmikolpQAZWSXEDCRFVTGBYHNUJMIKOLP";
//		for (int i = 0; i < tempPassword.length; i++) {
//			// ���ڿ��� ���̸�ŭ ������ �߻����� �ش� �ε����� ���ڸ� ���� �迭�� ����
//			tempPassword[i] = temp.charAt((int) (Math.random() * temp.length()));
//		}
//		return tempPassword;
//	}

	public static void main(String[] args) {
		new UseMath();
		System.out.println();
		System.out.println(new UseMath().createPassword());

	}

}
