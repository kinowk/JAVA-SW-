package day1113;

public class replaceMethod {

	public void test() {
		// replace("ã�� ����", "������ ����"), replaceAll("ã�� ����", "������ ����")
		String message = "���õ� �����ϼ̽��ϴ�.";
		System.out.println(message.replace("����", "����"));
	}

	public static void main(String[] args) {
		replaceMethod test = new replaceMethod();
		test.test();
	}// main

}// class
