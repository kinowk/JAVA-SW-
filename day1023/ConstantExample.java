package day1023;
class ConstantExample{

	public static final int AGE = 27;
	public static final int YEAR = 2020;
	public static final int K_AGE_LAW = 1;
	public static final char FIRST_INI = 'P';
	public static final double LEFT_EYE = 0.1;
	public static final double RIGHT_EYE = 0.2;

	public static void main(String[] args) {
		System.out.println("���̴� " + AGE + "�� ���ش� " + YEAR + "�� �¾ ��" + (YEAR - AGE + K_AGE_LAW) + "�� �Դϴ�.");
		System.out.println("�� �̸��� �̴ϼ� ù ���ڴ� " + FIRST_INI + "�Դϴ�." );
		System.out.println("���� ���� �÷� " + LEFT_EYE + " ������ ���� �÷��� " + RIGHT_EYE + " ��� �÷��� " + (LEFT_EYE + RIGHT_EYE)/2 + "�Դϴ�.");
	}
}
