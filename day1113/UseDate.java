package day1113;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * ������ �ִ� ��¥ ������ ����� ��
 * 
 * @author owner
 */
public class UseDate {

	public UseDate() {
		// �ý����� ��¥
//		Date date = new Date();
//		System.out.println(date);

		// SimpleDateFormat - ����ڰ� ���ϴ� ��¥ ������ ���� �� �ִ� class
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh(HH, kk):mm:ss EEEE"); // OS�� ���� ����
		// ��-��-��- ����/���� ��(1~12) (��(0~23), ��(1~24)):��:�� ����

		// �ٸ� ��� - Locale class�� ���
		// new SimpleDateFormat("pattern', Locale.Constant);
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy a hh(HH):mm:ss EEE", Locale.KOREA);
		String formatDate = sdf.format(new Date()); // Date ��ü�� ���޹޾� ���ϴ� ������ ��¥ ���ڿ��� ��ȯ
		System.out.println(formatDate);
	}// UseDate

	public static void main(String[] args) {
		new UseDate();
	}// main

}// class
