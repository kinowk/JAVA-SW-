package day1104;

public class StringExample {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = new String("abcd");

		System.out.println("str1 == \"abcd\" : " + (str1 == "abcd"));
		System.out.println("str2 == \"abcd\" : " + (str2 == "abcd"));

		System.out.println("str1.equlas(\"abcd\") : " + str1.equals("abcd"));
		System.out.println("str2.equlas(\"abcd\") : " + str2.equals("abcd"));

		System.out.println("�ȳ��ϼ���.".length());

		String str = "�ȳ�";
		System.out.println(str.length());

		String temp = "ABCD";
		String mail = new String("akk132@naver.com");
		System.out.println(temp + "�� ���� : " + temp.length());
		System.out.println(mail + "�� ���� : " + mail.length());

		System.out.println(mail.toUpperCase());
		// toUpperCase() - Converts all of the characters in this String to upper case
		// using the rules of the default locale

		System.out.println(temp.toLowerCase());
		// toLowerCase() - Converts all of the characters in this String to lower case
		// using the rules of the default locale

		System.out.println(temp.indexOf("C"));
		// indexOf(String) - Returns the index within this string of the first
		// occurrence of the specified substring.
		// ã�� ���ڿ��� ���ٸ� -1 return
		temp = "Java Oracle";
		System.out.println(temp + "���� ó�� a�� index : " + temp.indexOf("a")); // Left to Right
		System.out.println(temp + "���� ������ a�� index : " + temp.lastIndexOf("a")); // Right to Left

		temp = "test@test.com";
		if (temp.indexOf("@") == -1 || temp.indexOf(".") == -1 || temp.length() < 7) {
			System.out.println("�̸��� �ּҰ� �ùٸ��� �ʽ��ϴ�.");
		} else {
			System.out.println("�̸��� �ּҰ� �ùٸ��ϴ�.");
		}

		System.out.println(mail + "���� 11���� index�� �ش��ϴ� ���� : " + mail.charAt(11));
		System.out.println(mail + "���� \'@\'�� �ش��ϴ� ���� ���ϱ� : " + mail.charAt(mail.indexOf("@")));
		// charAt(int) - Returns the char value at the specified index

		temp = "����� �ӳɳɳ� �Ծ����ϴ�.";
		System.out.println(temp);
		System.out.println(temp.substring(4, 8)); // �ӳɳɳ� ���
		System.out.println(temp.substring(temp.indexOf("��"), temp.indexOf("��") + 1)); // �Ծ����ϴ� ���
		// substring(int beginIndex, int endIndex + 1) - Returns a string that is a
		// substring of this string.
		// ������ index�� �ι��� ����

		// �̸��� �ּҸ� �߶� ��� akk132@naver.com
//		substring(int beginIndex, int endIndex) - print index - beginIndex ~ endIndex - 1
		System.out.println(mail.substring(0, mail.indexOf("@")));
		System.out.println(mail.substring(mail.indexOf("@") + 1, mail.length()));
		System.out.println(mail.substring(mail.indexOf("@") + 1));

		String temp1 = "������";
		String temp2 = "������";
		System.out.println(temp1.concat(temp2));
		// concat(String) - Concatenates the specified string to the end of this string
		// + operator���� concat() method�� ��ȣ

		temp = "     JAVA            ";
		System.out.println(temp);
		System.out.println(temp.trim());
		temp = "   JAVA Oracle           ";
		System.out.println(temp.trim());
		// trim() - Returns a string whose value is this string, with any leading and
		// trailing whitespace removed

		System.out.println(temp1.startsWith("����"));
		// startsWith(String prefix) - Tests if this string starts with the specified
		// prefix.

//		temp = "����� ������ ������";
		temp = "����� ���۱� �󵵵�";
		System.out.println(temp.endsWith("������"));
		// endsWith(String suffix) - Tests if this string ends with the specified suffix

		temp = "������ ����� Java�� �����Դϴ�.";
		System.out.println(temp.contains("����"));
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
		// static method - ��ü�� ������ �ִ� ������ ���� ó������ �ʰ�, �Էµ� �����θ� ���� ó��

		// file�� '.'�� �ִ��� Ȯ�� �� '.'�� �ִٸ� ���ϸ�� Ȯ���ڸ� �и��Ͽ� ���, ���ٸ� ���ϸ��� ���
		String fileName = "test.java";
		if (fileName.contains(".")) { // fileName.indexOf(".") != -1
			System.out.println("fileName�� ���ϸ� : " + fileName.substring(0, fileName.indexOf(".")) + ", fileName�� Ȯ���� : "
					+ fileName.substring(fileName.lastIndexOf(".") + 1));
		} else {
			System.out.println(fileName);
		}

		// ����(1, 3, 5, 7, 9) or ���� ���(2, 4, 6, 8, 0)
		String ssn = "880101-1234567";
		if (ssn.charAt(7) == '1' || ssn.charAt(7) == '3' || ssn.charAt(7) == '5' || ssn.charAt(7) == '7'
				|| ssn.charAt(7) == '9') {
			System.out.println("����");
		} else {
			System.out.println("����");
		}

		int gender = ssn.charAt(7); // Integer.parseInt(String)
		// int gender = Integer.parseInt(ssn.substring(7,8)) % 2
		if (gender % 2 == 00) { // '0' == 48, '1' == 49, ...
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}

}
