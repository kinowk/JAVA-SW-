package day1026;
class Homework1 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("�Է°� " + num + "�� " + (num%2==0?"¦��":"Ȧ��") + "�̸�");
		System.out.println("������ " + ( num > 0 ? num : -num) +"�̴�.");
	}
}
