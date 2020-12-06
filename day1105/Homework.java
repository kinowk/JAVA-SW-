package day1105;

public class Homework {

	private String ssn;
	private int genderNum;

	public Homework() { // default constructor

	}

	public Homework(String ssn) { // »ı¼ºÀÚ
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

	public boolean checkSsn() { // ÀÔ·Â¹ŞÀº ÁÖ¹Î¹øÈ£ 14ÀÚ¸® È®ÀÎ
		return ssn.length() == 14;

//		if (ssn.length() == 14) {
//			return true;
//		} else {
//			return false;
//		}

	}

	public boolean checkHyphen() { // '-' È®ÀÎ
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
		resultBirth = getYear() + "³â " + ssn.substring(2, 4) + "¿ù " + ssn.substring(4, 6) + "ÀÏ";
		return resultBirth;
	}

//	public String birth() { // »ı³â¿øÀÏ ¹İÈ¯
//		String year = "19" + ssn.substring(0, 2) + "³â";
//		String month = ssn.substring(2, 4).concat("¿ù");
//		String day = ssn.substring(4, 6).concat("ÀÏ");
//		return year.concat(month).concat(day);
//	}

	public int age() { // ³ªÀÌ ¹İÈ¯
		return 2020 - getYear() + 1;
	}

	public String gender() { // ¼ºº° ¹İÈ¯
		int gender = ssn.charAt(7);
//		if (gender % 2 == 0) {
//			return "¿©ÀÚ";
//		} else {
//			return "³²ÀÚ";
//		}
		String gender1 = "³²ÀÚ";
		if (gender % 2 == 0) {
			gender1 = "¿©ÀÚ";
		}
		return gender1;
	}

	public String zodiac() { // ¶ì ¹İÈ¯
		switch (getYear()) {
		case 0:
			return "¿ø¼şÀÌ¶ì";
		case 1:
			return "´ß¶ì";
		case 2:
			return "°³¶ì";
		case 3:
			return "µÅÁö¶ì";
		case 4:
			return "Áã¶ì";
		case 5:
			return "¼Ò¶ì";
		case 6:
			return "È£¶ûÀÌ¶ì";
		case 7:
			return "Åä³¢¶ì";
		case 8:
			return "¿ë¶ì";
		case 9:
			return "¹ì¶ì";
		case 10:
			return "¸»¶ì";
		default:
			return "¾ç¶ì";
		}
	}

	public String getZodiac() {
		String[] temp = { "¿ø¼şÀÌ", "´ß", "°³", "µÅÁö", "Áã", "¼Ò", "È£¶ûÀÌ", "Åä³¢", "¿ë", "¹ì", "¸»", "¾ç" };
		return temp[getYear() % 12];
	}

}
