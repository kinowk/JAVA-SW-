package day1023;
class Homework2 {

	public static final int PIN_MONEY = 100000;
	public static final int ONE_WAY_FARE = 1350;

	public static void main(String[] args) {
		int lunchFare = 6500;
		System.out.println("�Ϸ�뵷 : " + PIN_MONEY + ", ������ : " + ONE_WAY_FARE + ", �պ����� : " + ONE_WAY_FARE * 2
			+ ", ���ɰ� : " + lunchFare + ", �����ݾ� : " + (PIN_MONEY - ONE_WAY_FARE * 2 - lunchFare));
	}
}
