package day1023;
class ConstantExample{

	public static final int AGE = 27;
	public static final int YEAR = 2020;
	public static final int K_AGE_LAW = 1;
	public static final char FIRST_INI = 'P';
	public static final double LEFT_EYE = 0.1;
	public static final double RIGHT_EYE = 0.2;

	public static void main(String[] args) {
		System.out.println("나이는 " + AGE + "살 올해는 " + YEAR + "년 태어난 해" + (YEAR - AGE + K_AGE_LAW) + "년 입니다.");
		System.out.println("내 이름의 이니셜 첫 글자는 " + FIRST_INI + "입니다." );
		System.out.println("왼쪽 눈의 시력 " + LEFT_EYE + " 오른쪽 눈의 시력은 " + RIGHT_EYE + " 양안 시력은 " + (LEFT_EYE + RIGHT_EYE)/2 + "입니다.");
	}
}
