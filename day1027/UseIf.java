package day1027;

class UseIf {
	public static void main(String[] args) {
		int inputValue = Integer.parseInt(args[0]);
		if (inputValue < 0) {
			inputValue = -inputValue;
		}
		System.out.println(args[0] + "의 절댓값은 " + inputValue + "이다.");

		System.out.println("-----------------------------------------------");
		inputValue = Integer.parseInt(args[0]);
		if (inputValue >= 0 && inputValue <= 100) {
			System.out.println("입력된 값은 " + inputValue + "입니다.");
		}

		System.out.println("\"감사합니다.\"");
		// 문자열의 비교는 equals method를 사용하여 비교
		System.out.println(args[1].equals("Java")); // equals - 대소문자 구분
		System.out.println(args[1].equalsIgnoreCase("Java")); // equalsIgnoreCase - 대소문자 구분X
		System.out.println(args[2].equals("자바"));
		if (args[2].equals("자바")) {
			System.out.println("OOP(Object Oriented Programming) Language");
			System.out.println("Write Once Run Anywhere : 한 번 작성된 코드는 OS에 상관없이 실행가능");
		}
	}
}