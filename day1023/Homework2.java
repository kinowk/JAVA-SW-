package day1023;
class Homework2 {

	public static final int PIN_MONEY = 100000;
	public static final int ONE_WAY_FARE = 1350;

	public static void main(String[] args) {
		int lunchFare = 6500;
		System.out.println("하루용돈 : " + PIN_MONEY + ", 편도차비 : " + ONE_WAY_FARE + ", 왕복차비 : " + ONE_WAY_FARE * 2
			+ ", 점심값 : " + lunchFare + ", 남은금액 : " + (PIN_MONEY - ONE_WAY_FARE * 2 - lunchFare));
	}
}
