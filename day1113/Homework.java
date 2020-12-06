package day1113;

import java.util.StringTokenizer;

public class Homework {

	// "��õ, �Ÿ�,�Ŵ��,�븲.�ŵ���, ����,��������û, ���,����, ȫ�� �Ա�"
	public String[] arrStation(String station) {
		String[] arr = null;

		StringBuilder sb = new StringBuilder(station);
		sb.insert(station.indexOf("�Ŵ��") + 4, "���ε����� ����,"); // return StringBuilder
//		String str = (sb.toString()).trim();
//		Returns a string whose value is this string, with any leading and trailing whitespace removed.
//		����, ������ �ʿ���� ������ ����

		String str = (sb.toString()).replace(" ", "");

		StringTokenizer stk = new StringTokenizer(str, ",.");

		int i = stk.countTokens() - 1; // Array index
		arr = new String[stk.countTokens()];
		while (stk.hasMoreTokens()) {
			arr[i] = stk.nextToken();
			i--;
		}
		return arr;
	}

	public void printStationArr(String[] arr) {
		System.out.println("�� ��");
		System.out.println("-----------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		Homework homework = new Homework();
		String[] station = homework.arrStation("��õ, �Ÿ�,�Ŵ��,�븲.�ŵ���, ����,��������û, ���,����, ȫ�� �Ա�");
		homework.printStationArr(station);
	}

}
