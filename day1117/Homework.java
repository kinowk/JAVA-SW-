package day1117;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Homework {

	public Homework() {
		Random random = new Random();
		int num = random.nextInt() % 5;

//		y - year, M - month, d - day, E - DAY_OF_WEEK, a - AM/PM, h - hour(0~12), m - minute, s - second
//		다른 언어 - Locale class
		switch (num) {
		case 0:
			SimpleDateFormat koreaDate = new SimpleDateFormat("yyyy-MM-dd EEEE a hh:mm:ss", Locale.KOREA);
			String koreaFormatDate = koreaDate.format(new Date()); // Date 객체를 전달받아 원하는 형식의 날짜 문자열을 반환
			System.out.println("한국 날짜 형식 : " + koreaFormatDate);
			break;
		case 1:
			SimpleDateFormat ukDate = new SimpleDateFormat("yyyy-MM-dd EEEE a hh:mm:ss", Locale.UK);
			String ukFormatDate = ukDate.format(new Date());
			System.out.println("영국 날짜 형식 : " + ukFormatDate);
			break;
		case 2:
			SimpleDateFormat usDate = new SimpleDateFormat("yyyy-MM-dd EEEE a hh:mm:ss", Locale.US);
			String usFormatDate = usDate.format(new Date());
			System.out.println("미국 날짜 형식 : " + usFormatDate);
			break;
		case 3:
			SimpleDateFormat japanDate = new SimpleDateFormat("yyyy-MM-dd EEEE a hh:mm:ss", Locale.JAPAN);
			String japanFormatDate = japanDate.format(new Date());
			System.out.println("일본 날짜 형식 : " + japanFormatDate);
			break;
		default:
			SimpleDateFormat chinaDate = new SimpleDateFormat("yyyy-MM-dd EEEE a hh:mm:ss", Locale.CHINA);
			String chinaFormatDate = chinaDate.format(new Date());
			System.out.println("중국 날짜 형식 : " + chinaFormatDate);
		}

		Locale[] locale = { Locale.KOREA, Locale.UK, Locale.US, Locale.JAPAN, Locale.CHINA };
		String[] country = { "한국", "영국", "미국", "일 본", "중국" };
		int randomNumber = new Random().nextInt(locale.length);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEE a hh:mm:ss", locale[randomNumber]);
		System.out.println(country[randomNumber] + " " + sdf.format(new Date()));

	}// Homework

	public static void main(String[] args) {
		new Homework();
	}// main

}// class
