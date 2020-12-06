package day1104;

public class StringExample {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = new String("abcd");

		System.out.println("str1 == \"abcd\" : " + (str1 == "abcd"));
		System.out.println("str2 == \"abcd\" : " + (str2 == "abcd"));

		System.out.println("str1.equlas(\"abcd\") : " + str1.equals("abcd"));
		System.out.println("str2.equlas(\"abcd\") : " + str2.equals("abcd"));

		System.out.println("안녕하세요.".length());

		String str = "안녕";
		System.out.println(str.length());

		String temp = "ABCD";
		String mail = new String("akk132@naver.com");
		System.out.println(temp + "의 길이 : " + temp.length());
		System.out.println(mail + "의 길이 : " + mail.length());

		System.out.println(mail.toUpperCase());
		// toUpperCase() - Converts all of the characters in this String to upper case
		// using the rules of the default locale

		System.out.println(temp.toLowerCase());
		// toLowerCase() - Converts all of the characters in this String to lower case
		// using the rules of the default locale

		System.out.println(temp.indexOf("C"));
		// indexOf(String) - Returns the index within this string of the first
		// occurrence of the specified substring.
		// 찾는 문자열이 없다면 -1 return
		temp = "Java Oracle";
		System.out.println(temp + "에서 처음 a의 index : " + temp.indexOf("a")); // Left to Right
		System.out.println(temp + "에서 마지막 a의 index : " + temp.lastIndexOf("a")); // Right to Left

		temp = "test@test.com";
		if (temp.indexOf("@") == -1 || temp.indexOf(".") == -1 || temp.length() < 7) {
			System.out.println("이메일 주소가 올바르지 않습니다.");
		} else {
			System.out.println("이메일 주소가 올바릅니다.");
		}

		System.out.println(mail + "에서 11번쨰 index에 해당하는 문자 : " + mail.charAt(11));
		System.out.println(mail + "에서 \'@\'에 해당하는 문자 구하기 : " + mail.charAt(mail.indexOf("@")));
		// charAt(int) - Returns the char value at the specified index

		temp = "김밥을 앙냥냥냥 먹었습니다.";
		System.out.println(temp);
		System.out.println(temp.substring(4, 8)); // 앙냥냥냥 출력
		System.out.println(temp.substring(temp.indexOf("먹"), temp.indexOf("다") + 1)); // 먹었습니다 출력
		// substring(int beginIndex, int endIndex + 1) - Returns a string that is a
		// substring of this string.
		// 마지막 index에 널문자 삽입

		// 이메일 주소를 잘라서 출력 akk132@naver.com
//		substring(int beginIndex, int endIndex) - print index - beginIndex ~ endIndex - 1
		System.out.println(mail.substring(0, mail.indexOf("@")));
		System.out.println(mail.substring(mail.indexOf("@") + 1, mail.length()));
		System.out.println(mail.substring(mail.indexOf("@") + 1));

		String temp1 = "오늘은";
		String temp2 = "수요일";
		System.out.println(temp1.concat(temp2));
		// concat(String) - Concatenates the specified string to the end of this string
		// + operator보다 concat() method를 선호

		temp = "     JAVA            ";
		System.out.println(temp);
		System.out.println(temp.trim());
		temp = "   JAVA Oracle           ";
		System.out.println(temp.trim());
		// trim() - Returns a string whose value is this string, with any leading and
		// trailing whitespace removed

		System.out.println(temp1.startsWith("오늘"));
		// startsWith(String prefix) - Tests if this string starts with the specified
		// prefix.

//		temp = "서울시 마포구 공덕동";
		temp = "서울시 동작구 상도동";
		System.out.println(temp.endsWith("공덕동"));
		// endsWith(String suffix) - Tests if this string ends with the specified suffix

		temp = "배포한 교재는 Java의 정석입니다.";
		System.out.println(temp.contains("정석"));
		// contains(CharSequence s) - Returns true if and only if this string contains
		// the specified sequence of char values.

		temp = null;
		System.out.println(temp == null ? "null" : "empty");
		temp = "";
		System.out.println(temp.isEmpty());
		// isEmpty() - Returns true if, and only if, length() is 0
		int year = 2020;
		// temp = year + "";
		temp = String.valueOf(year);
		System.out.println(year + " / " + temp);
		temp = Integer.toString(year);
		System.out.println(year + " / " + temp);
		// static method - 객체가 가지고 있는 값으로 일을 처리하지 않고, 입력된 값으로만 일을 처리

		// file명에 '.'이 있는지 확인 후 '.'이 있다면 파일명과 확장자를 분리하여 출력, 없다면 파일명을 출력
		String fileName = "test.java";
		if (fileName.contains(".")) { // fileName.indexOf(".") != -1
			System.out.println("fileName의 파일명 : " + fileName.substring(0, fileName.indexOf(".")) + ", fileName의 확장자 : "
					+ fileName.substring(fileName.lastIndexOf(".") + 1));
		} else {
			System.out.println(fileName);
		}

		// 남자(1, 3, 5, 7, 9) or 여자 출력(2, 4, 6, 8, 0)
		String ssn = "880101-1234567";
		if (ssn.charAt(7) == '1' || ssn.charAt(7) == '3' || ssn.charAt(7) == '5' || ssn.charAt(7) == '7'
				|| ssn.charAt(7) == '9') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}

		int gender = ssn.charAt(7); // Integer.parseInt(String)
		// int gender = Integer.parseInt(ssn.substring(7,8)) % 2
		if (gender % 2 == 00) { // '0' == 48, '1' == 49, ...
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
	}

}
