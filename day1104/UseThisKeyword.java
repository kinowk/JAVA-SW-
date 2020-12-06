package day1104;

/**
 * this - 호출하는 객체의 주소를 참조
 * 
 * @author owner
 */
public class UseThisKeyword {
	int i;

	public void useInstance(UseThisKeyword utk, int i) {
		// i = i; - local variable과 instance variable의 name이 같은 경우 local variable를 먼저 사용
		utk.i = i;
		System.out.println("stack) i = " + i);
	}

	public void UseThis(int i) {
		System.out.println(this);
		this.i = i;
//		this.i = i;
//		System.out.println("this) i = " + i);
	}
	public static void main(String[] args) {
		UseThisKeyword utk = new UseThisKeyword();
		UseThisKeyword utk1 = new UseThisKeyword();
		System.out.println(utk + " / " + utk1); // heap에 생성된 instance 주소
//		utk.useInstance(utk, 2020);
//		System.out.println("main) i = " + utk.i);
		utk.UseThis(5);
		utk1.UseThis(0);
	}

}
