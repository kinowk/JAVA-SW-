package day1105;

public class Array1 {
	public Array1() {
		int[] arr = null;
		int arr1[] = null;

		arr = new int[3];
		arr1 = new int[4];

		System.out.printf("arr�迭�� ���� ���� %d\n", arr.length);
		System.out.printf("arr1�迭�� ���� ���� %d\n", arr1.length);

		arr[0] = 2020;
		arr[1] = 11;
		arr[2] = 5;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %-5d\n", i, arr[i]);
		}

		// array �ڵ��ʱ�ȭ
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
	}

	/**
	 * array�� �⺻�� �������� ���
	 */
	public void useArray1() {
		System.out.println("-----------------------------");

		int[] arr = { 10, 100, 1000, 10000, 100000 }; // ���� ������ ���� �迭�� ���̰� �ڵ����� ����
		arr[1] = 500;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %-10d\n", i, arr[i]);
		}

		String[] name = { "���ϱ�", "��Ǻ�", "���", "�����", "������", "������", "�谭��" };
		int[] score = { 82, 70, 96, 85, 79, 68, 48 };
		System.out.printf("��ȣ\t�̸�\t����\t����\n");
		System.out.println("-----------------------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%d\t%s\t%d\t%s\n", i + 1, name[i], score[i], grade(score[i]));
		}
		System.out.println("-----------------------------------");
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.printf("�����ο�[%d] ����[%d] ���[%.2f]\n", name.length, sum, (double) sum / name.length);
	}

	public String grade(int score) {
		if (score >= 95) {
			return "A+";
		} else if (score >= 90) {
			return "A";
		} else if (score >= 85) {
			return "B+";
		} else if (score >= 80) {
			return "B";
		} else if (score >= 75) {
			return "C+";
		} else if (score >= 70) {
			return "C";
		} else {
			return "F";
		}
	}

	public static void main(String[] args) {
		/*
		 * Array1 ar = new Array1(); ar.useArray1();
		 */
		new Array1();
		new Array1().useArray1();
	}

}
