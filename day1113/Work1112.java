package day1113;

import java.util.StringTokenizer;

public class Work1112 {

	/**
	 * CSV Data�� Token���� �и��Ͽ� �迭�� ��� ��
	 * 
	 * @return
	 */
	public String[] csvprocess() {
		String[] stationArr = null;
		String station = "��õ,�Ÿ�,�Ŵ��.���ε����д���,�븲.�ŵ���,����,��������û,���,����,ȫ���Ա�";

		// �ϳ��� ���ڿ����� Ư�� ���ڷ� �и��� �� �ִ� class���� (StringTokenizer)

		// StringTokenizer stk = new StringTokenizer(station, ",.", false);
		StringTokenizer stk = new StringTokenizer(station, ",."); // 11���� Token - ��õ �Ÿ� �Ŵ�� ,,, ���� ȫ���Ա�

		// new String[Token�� ����] - ���� �Ҵ�
		stationArr = new String[stk.countTokens()]; // stk.countTokens() == 11

		// Token�� ���翩�� Ȯ�� �� Token�� String[]�� ����
		int i = 0;
		while (stk.hasMoreTokens()) {
			stationArr[i] = stk.nextToken();
			i++;
		}
		return stationArr;
	}// csvProcess

	public void printarray(String[] stationArr) {
		int count = 0;

		System.out.println("����");
		System.out.println("----------------------------");
		for (int i = 0; i < stationArr.length; i++) {
			System.out.println(stationArr[i]);
			// startsWith(String prefix) - return boolean // Tests if this string starts
			// with the specified prefix.
			if (stationArr[i].startsWith("��")) { // "��"���� �����ϴ� ���� ����
				count++;
			}
		}
		System.out.println("----------------------------");
		System.out.printf("������ �� : [%d]��, '��'���� �����ϴ� ���� ���� [%d]��\n", stationArr.length, count);
	}// printArray\

	public int[] lottoProcess() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break; // ���� ����� �ݺ��� Ż��
				}
			}
		}
		return arr;
	}

	public int[] lotto() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;// ���� ����� �ݺ��� Ż��
				}
			}
		}
		return arr;
	}

	public void printLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%-4d", lotto[i]);

		}
	}

	public static void main(String[] args) {
		Work1112 work = new Work1112();
		work.printarray(work.csvprocess());
		System.out.println("---------------------------------------------");
		work.printLotto(work.lottoProcess());
		System.out.println("");

	}// main

}// class
