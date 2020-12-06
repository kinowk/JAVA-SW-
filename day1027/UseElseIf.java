package day1027;

class UseElseIf {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		System.out.print(score + "Á¡Àº ");
		if (score < 0) {
			System.out.println("0º¸´Ù ÀÛ¾Æ¼­ ½ÇÆÐ");
		} else if (score > 100) {
			System.out.println("100º¸´Ù Ä¿¼­ ½ÇÆÐ");
		} else {
			System.out.println("À¯È¿Á¡¼ö");
		}

		if (score >= 0 && score <= 40) {
			System.out.println("°ú¶ô");
		} else if (score > 40 && score <= 60) {
			System.out.println("´Ù¸¥°ú¸ñÁ¡¼ö ÂüÁ¶");
		} else if (score > 60 && score <= 100) {
			System.out.println("ÇÕ°Ý");
		}

		System.out.println("----------------------------------------");
		int birthYear = Integer.parseInt(args[1]);
		if (birthYear % 12 == 0) {
			System.out.println("¿ø¼þÀÌ¶ì");
		} else if (birthYear % 12 == 1) {
			System.out.println("´ß¶ì");
		} else if (birthYear % 12 == 2) {
			System.out.println("°³¶ì");
		} else if (birthYear % 12 == 3) {
			System.out.println("µÅÁö¶ì");
		} else if (birthYear % 12 == 4) {
			System.out.println("Áã¶ì");
		} else if (birthYear % 12 == 5) {
			System.out.println("¼Ò¶ì");
		} else if (birthYear % 12 == 6) {
			System.out.println("È£¶ûÀÌ¶ì");
		} else if (birthYear % 12 == 7) {
			System.out.println("Åä³¢¶ì");
		} else if (birthYear % 12 == 8) {
			System.out.println("¿ë¶ì");
		} else if (birthYear % 12 == 9) {
			System.out.println("¹ì¶ì");
		} else if (birthYear % 12 == 10) {
			System.out.println("¸»¶ì");
		} else {
			System.out.println("¾ç¶ì");
		}
		/*
		 * int i = birthYear % 12; if (i == 0) { System.out.println("¿ø¼þÀÌ"); } else if (i
		 * == 1) { System.out.println("´ß"); } else if (i == 2) {
		 * System.out.println("°³"); } else if (i == 3) { System.out.println("µÅÁö"); }
		 * else if (i == 4) { System.out.println("Áã"); } else if (i == 5) {
		 * System.out.println("¼Ò"); } else if (i == 6) { System.out.println("È£¶ûÀÌ"); }
		 * else if (i == 7) { System.out.println("Åä³¢"); } else if (i == 8) {
		 * System.out.println("¿ë"); } else if (i == 9) { System.out.println("¹ì"); } else
		 * if (i == 10) { System.out.println("¸»"); } else { System.out.println("¾ç"); }
		 */
		System.out.println("-----------------------------------------");
		int i = birthYear % 12;
		switch (i) {
		case 0:
			System.out.println("¿ø¼þÀÌ¶ì");
			break;
		case 1:
			System.out.println("´ß¶ì");
			break;
		case 2:
			System.out.println("°³¶ì");
			break;
		case 3:
			System.out.println("µÅÁö¶ì");
			break;
		case 4:
			System.out.println("Áã¶ì");
			break;
		case 5:
			System.out.println("¼Ò¶ì");
			break;
		case 6:
			System.out.println("È£¶ûÀÌ¶ì");
			break;
		case 7:
			System.out.println("Åä³¢Æ¼");
			break;
		case 8:
			System.out.println("¿ë¶ì");
			break;
		case 9:
			System.out.println("¹ì¶ì");
			break;
		case 10:
			System.out.println("¸»¶ì");
			break;
		default:
			System.out.println("¾ç¶ì");
		}
	}
}