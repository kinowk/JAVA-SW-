package day1111;

import day1111.sub.Clark;
import day1111.sub.Fly;

/**
 * method�� class, interface�� parameter�� �����ϰ� ���� ��<br>
 * ������ class�� �ۼ����� �ʰ�, method�� ȣ�� �� �� �ִ� �͸�Ŭ������ ���
 * 
 * @author owner
 */
public class UseAnonymous { // UseAnonymous.class - bytecode

	public void useFly(Fly fly) {
		System.out.println(fly.drivingForce() + " / " + fly.upwardForce());
	}

	public static void main(String[] args) {

		// 1. Fly�� ������ Ŭ������ �ۼ��ϰ�, ��üȭ
		Clark c = new Clark();
		
		Fly f = new Clark(); // is a ���� ��üȭ

		// method�� ȣ���ϱ����� ��üȭ
		UseAnonymous ua = new UseAnonymous();
		// method ȣ��
		ua.useFly(c); // Clark�� Fly�� is a �����̹Ƿ� Clark instance�� �Ҵ� �� �� �ִ�.
		ua.useFly(f);
		// 2. Fly interface�� ������ class file�� ������ �ۼ����� �ʰ�, anonymous inner class�� ó���� �� �ִ�.
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
