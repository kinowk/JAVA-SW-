package day1026;
class Homework1 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("입력값 " + num + "은 " + (num%2==0?"짝수":"홀수") + "이며");
		System.out.println("절댓값은 " + ( num > 0 ? num : -num) +"이다.");
	}
}
