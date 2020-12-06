package day1110;

/**
 * OverrideSuper의 자식클래스<br>
 * 자식클래스에서는 부모클래스를 알 수 있다.<br>
 * 자식클래스가 객체화되면 부모클래스가 먼저 생성되고 난 후 자식클래스가 생성된다.
 * 
 * @author owner
 */
public class OverrideSub2 extends OverrideSuper {
	/**
	 * Override된 method 형식) 반환형, method명, parameter는 같아야 한다.
	 */
	@Override
	public void methodA() {
		System.out.println("OverrideSub2 class에서 Override한 methodA");
	}

	@Override
	public void methodB() {
		System.out.println("OverrideSub2 class에서 Override한 methodB");
	}

	public void childMehtod() { // is a 관계의 객체화가 되었을 때에는 사용할 수 없다.
		System.out.println("OverrideSub2 class의 method");
	}
}
