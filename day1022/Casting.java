package day1022;
/*
��������ȯ
*/

class Casting{
	public static void main(String[] args) {
		float f = 3.1415f; //����� : literal�� ũ����ü�� ����Ͽ� �� �ְ� ������ �Ҵ�;
		int i = 0;

		//i=f; data type�� �ٸ�
		i = (int)f; //��������ȯ - �� �ս�
		System.out.println("float : " + f + ", int : " + i);

		float f1 = (float)3.14; //��������ȯ : literal�� ũ����ü�� �����ǰ�, ������ �Ҵ��� �� ���� float���� �����Ͽ� �Ҵ�;
		System.out.println("float : " + f1);

		byte num1 = 4;
		byte num2 = 26;
		byte result = 0;

		result = (byte)(num1+num2);
		System.out.println(num1 + " + " + num2 + " = " + result);

		char c = 'A';
		System.out.println(c + "�� �����ڵ� �� : " + (int)c);
	}
}
