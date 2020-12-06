package day1029;

public class EscapeCharacter {

	public static void main(String[] args) {

		System.out.println("\"안녕하세요?\""); // 안녕하세요?
		System.out.println("c:\\dev\\env.bat"); // c:\dev\env.bat
		// \r - carriage return - Windows에서만 사용
		System.out.println("안\r\n녕"); // \n - new line
		System.out.println("안\t녕"); // \t - tab
		System.out.println("안\t녕\b"); // \b - backspace << 사용안함
		
	}// main

}// class
