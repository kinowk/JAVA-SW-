package day1023;
/*
constant - public static final
*/
class TestConstant{
	//class field���� constant ����
	public static final int MAX_SCORE = 100; //public - class �ܺο��� ��� ����, static - ��� memory���� ���� ����, final - ���� �Ұ� 
	public static final int MIN_SCORE = 0;

	public static void main(String[] args) {
		//MAX_SCORE = 200; //error (final)
		System.out.println("�ְ� ���� : " + MAX_SCORE);
		System.out.println("���� ���� : " + TestConstant.MIN_SCORE);

		int myScore = 89;

		myScore = 87;
		System.out.println("ȹ������ : " + myScore);
		System.out.println("�ְ�����(" + TestConstant.MAX_SCORE + "��)���� ȹ������ (" + myScore + "��)�� �� ������ " + (TestConstant.MAX_SCORE - myScore));
	}
}
