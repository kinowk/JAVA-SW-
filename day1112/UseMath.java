package day1112;

/**
 * Math class - The constructor Math() is not visible -> 객체생성X
 * 
 * @author owner
 */
public class UseMath {

	public UseMath() {
//		Math m = new Math(); // The constructor Math() is not visible

		double d = 10.19;
		System.out.println(d + "를 반올림 : " + Math.round(d)); // 소숫점 첫 번째 자리에서 반올림 - return int
		System.out.println(d + "를 올림 : " + Math.ceil(d)); // 올림 - return double
		System.out.println(d + "를 내림 : " + Math.floor(d)); // 내림 - return double
		System.out.println(d + "를 소숫점 이하 절삭 : " + (int) d); // 절삭 - Casting

		int i = -11;
		System.out.println(i + "의 절댓값 : " + Math.abs(i)); // 절댓값

//		Math.random(); // Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
		System.out.println(Math.random());
		System.out.println((int) (Math.random() * 10)); // 0 ~ 9
		System.out.println((int) (Math.random() * 6 + 1)); // 1 ~ 6

		// 대문자 A ~ Z 중 임임의 문자
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

	public char[] createPassword() { // 임의의 숫자, 대문자, 소문자로 구성된 8자리 password 생성
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
//			// 문자열의 길이만큼 난수를 발생시켜 해당 인덱스에 문자를 꺼내 배열에 삽입
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
