package day1111;

import day1111.sub.Clark;
import day1111.sub.Fly;

/**
 * method가 class, interface를 parameter로 선언하고 있을 때<br>
 * 별도의 class을 작성하지 않고, method를 호출 할 수 있는 익명클래스의 사용
 * 
 * @author owner
 */
public class UseAnonymous { // UseAnonymous.class - bytecode

	public void useFly(Fly fly) {
		System.out.println(fly.drivingForce() + " / " + fly.upwardForce());
	}

	public static void main(String[] args) {

		// 1. Fly를 구현한 클래스를 작성하고, 객체화
		Clark c = new Clark();
		
		Fly f = new Clark(); // is a 관계 객체화

		// method를 호출하기위해 객체화
		UseAnonymous ua = new UseAnonymous();
		// method 호출
		ua.useFly(c); // Clark은 Fly와 is a 관계이므로 Clark instance를 할당 할 수 있다.
		ua.useFly(f);
		// 2. Fly interface를 구현한 class file을 별도로 작성하지 않고, anonymous inner class로 처리할 수 있다.
		// anonymous inner class
		ua.useFly(new Fly() { // anonymous inner class // UseAnonymous$1.class - bytecode

			@Override
			public int upwardForce() {
				return 0;
			}

			@Override
			public int drivingForce() {
				return 0;
			} // anonymous inner class

		});

//		Fly fly = new Fly() {
//			
//			@Override
//			public int upwardForce() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public int drivingForce() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
	}

}
