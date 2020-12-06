package day1023;
/*
constant - public static final
*/
class TestConstant{
	//class field에서 constant 선언
	public static final int MAX_SCORE = 100; //public - class 외부에서 사용 가능, static - 모든 memory에서 접근 가능, final - 변경 불가 
	public static final int MIN_SCORE = 0;

	public static void main(String[] args) {
		//MAX_SCORE = 200; //error (final)
		System.out.println("최고 점수 : " + MAX_SCORE);
		System.out.println("최저 점수 : " + TestConstant.MIN_SCORE);

		int myScore = 89;

		myScore = 87;
		System.out.println("획득점수 : " + myScore);
		System.out.println("최고점수(" + TestConstant.MAX_SCORE + "점)에서 획득점수 (" + myScore + "점)을 뺀 점수는 " + (TestConstant.MAX_SCORE - myScore));
	}
}
