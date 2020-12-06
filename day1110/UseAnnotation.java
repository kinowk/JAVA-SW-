package day1110;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * annotation���
 * 
 * @author owner
 */
public class UseAnnotation {

	@Override // annotation : Override�� Compiler�� check
	public String toString() {
		return "���� �ּҸ� ��ȯ�ϱ� �Ⱦ�";
	}

	/**
	 * �������� ����ϱ� ����� ��� �����ϴ� annotation ��ü class�� method ����
	 * 
	 * @Deprecated
	 */
	@Deprecated
	public void test() {
		System.out.println("�����ڵ�����");
	}// test

	// unused - variable�� ������ ���� �� Warning ���ֱ�
	// rawtypes - ���������� �������� ���� Generic�� ����ϴ� ������ �����ϴµ� Generic�� ������� �ʰ� JCF�� ����ؾ��� �� Warning ���ֱ�
	@SuppressWarnings({ "rawtypes", "unused" })
	public void temp() {
//		@SuppressWarnings("unused")
		int i;

//		@SuppressWarnings({ "rawtypes", "unused" })
		List l = null;
	}// temp

	public static void main(String[] args) {

		String str = new String("������ ȭ�����Դϴ�.");
		System.out.println(str); // �ּ�X
		System.out.println(str.toString()); // Object.toString()�� Override�Ͽ� �ּҰ� �ƴϰ� ���� ���´�.
		UseAnnotation ua = new UseAnnotation();
		System.out.println(ua); // �ּ� // Object.toString()�� Override ���� �ʤ��� Object�� �����ϴ� �ּ� ���°� ���ڿ��� ��ȯ
		System.out.println(ua.toString()); // getClass().getName() + '@' + Integer.toHexString(hashCode())
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString()); // Object.toString()�� Override�Ͽ� �ּҰ� �ƴ� �޼����� ��ȯ�Ǿ� ���´�.
//		System.out.println(date.getYear() + 1900); //Deprecated - ����õ method

		ua.test();
	}// main

}// class
