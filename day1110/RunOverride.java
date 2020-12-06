package day1110;

public class RunOverride {

	public static void main(String[] args) {
		// 자식클래스로 객체 생성
		OverrideSub overridesub = new OverrideSub();
		OverrideSub2 overridesub2 = new OverrideSub2();

		overridesub.methodA(); // 부모의 method
		overridesub.methodB();

		// 다형성 - Override
		overridesub2.methodA();
		overridesub2.methodB();
		overridesub2.childMehtod();
		System.out.println("--------------------------------------------");

		// is a 관계의 객체화 - 객체다형성을 사용(같은 class로 만들어진 객체가 다른 일을 수행)
		// 부모클래스 객체명 = new 자식클래스생성자();
		// 데이터형이 부모클래스 -> 부모의 자원만 사용 가능
		// method는 부보클래스가 가진 method만 호출 가능
		OverrideSuper overridesuper = new OverrideSub();
		OverrideSuper overridesuper2 = new OverrideSub2();

		overridesuper.methodA(); // Override 하지 않음 - 부모의 method
		overridesuper.methodB();

		overridesuper2.methodA(); // Override - 자식의 method 호출
		overridesuper2.methodB();
		// overridesuper2.childMethod(); // 부모클래스가 가진 method만 호출 가능
	}
}
