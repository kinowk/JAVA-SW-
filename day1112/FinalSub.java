package day1112;

/**
 * 부모클래스가 final이면 자식클래스를 가질 수 없다.
 * @author owner
 */
public class FinalSub extends FinalSuper {

	@Override
	public void methodA() {
		System.out.println("Override된 methodA");
	}

	public static void main(String[] args) {

	}// main

}// class
