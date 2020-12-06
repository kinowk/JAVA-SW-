package day1116;

import java.util.StringTokenizer;

public class Work1113 {

	public String[] stationProcess(String station) {
		String[] temp = null;
//		�Ŵ���� �����ϸ� �Ŵ�� �ڿ� ���ε����� ���� �߰�
		StringBuilder sbTemp = new StringBuilder(station);
		if (station.contains("�Ŵ��")) {
			sbTemp.insert(sbTemp.indexOf("�Ŵ��") + 4, "���ε����� ����,");
		}
		station = sbTemp.toString();

//		���� ����
		station = station.replaceAll(" ", "");

//		parameter�� �Էµ� �����͸� �Ųٷ� �迭�� �־� ��ȯ
//		�Էµ����͸� Token���� ����
//		StringTokenizer - ���� ���ڷ� �ڸ� �� �ִ�. / String.split() - �� ���ڷ� �ڸ� �� �ִ�.
		StringTokenizer stk = new StringTokenizer(station, ",.");

//		Token���� ���е� �����͸� ������ �迭 ����
		temp = new String[stk.countTokens()];
		int index = temp.length - 1; // first data�� last index�� �ֱ� ����
		while (stk.hasMoreTokens()) {
			temp[index] = stk.nextToken();
			index--;
		}
		return temp;
	}

	/**
	 * �Է¹��� Array�� ���
	 * 
	 * @param station
	 */
	public void printStation(String[] station) {
		System.out.println("�� ��");
		System.out.println("------------------------------------");
		for (int i = 0; i < station.length; i++) {
			System.out.println(station[i]);
		}
		System.out.println("------------------------------------");
	}

	public static void main(String[] args) {

//		��üȭ - 5���� ���
//		1. Ŭ������ ��ü�� = new ������();
//		2. new ������();
//		3. new ������().method��();
//		4. �θ�Ŭ������ ��ü�� = new �ڽĻ�����(); (is a ���� ��üȭ) 
//		5. �ٱ�Ŭ������.����Ŭ������ ��ü�� = instance��.new ����Ŭ����������(); (inner class ��üȭ)

		Work1113 work = new Work1113(); // ��üȭ - static�������� instance������ variable, method�� ȣ���ϱ� ����
		String station = "��õ, �Ÿ�,�Ŵ��,�븲.�ŵ���, ����,��������û, ���,����, ȫ�� �Ա�"; // arguments
		String[] temp = work.stationProcess(station);
		work.printStation(temp);

	}// main

}// class
