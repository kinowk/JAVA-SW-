package day1109;

/**
 * 상속관계의 class에서 부모클래스를 객체화하여 사용하는 일 보다, 자식클래스를 객체화하여 사용하는 일이 더 많다.
 * 
 * @author owner
 */
public class UsePerson {

	public static void main(String[] args) {
		HongGilDong hgd = new HongGilDong(); // 자식을 생성하면 부모가 먼저 생성된다.
		Clark superman = new Clark();

		hgd.setName("홍길동"); // 부모클래스의 method
		superman.setName("클락"); // 부모클래스의 method

		System.out.println(
				hgd.getName() + "은 눈 " + hgd.getEye() + "개, 코 " + hgd.getNose() + "개, 입 " + hgd.getMouth() + "개");
		System.out.println(superman.getName() + "은 눈 " + superman.getEye() + "개, 코 " + superman.getNose() + "개, 입 "
				+ superman.getMouth() + "개");

		System.out.println(hgd.eat());
		System.out.println(superman.eat()); // 부모클래스의 method 변경 필요 -> Override된 method 호출
		System.out.println(hgd.eat("국밥", 1)); // 부모클래스의 method 변경 필요 -> Override된 method 호출
		System.out.println(superman.eat("스테이크", 10)); // 부모클래스의 method 변경 필요 -> Override된 method 호출
		System.out.println("--------------------------------------------------------------------------------");
		// 자식클래스에서 정의한 자신만의 특징 호출
		System.out.println(hgd.fight(5)); // level : 6 -> 7
		System.out.println(hgd.fight(6)); // level : 7 -> 8
		System.out.println(hgd.fight(8)); // level : 8
		System.out.println(hgd.fight(9)); // level : 8 -> 7
		System.out.println(hgd.fight(7)); // level : 7
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println(superman.power("짱돌")); // power : 11
		System.out.println(superman.power("크립토나이트")); // power : 0
		System.out.println(superman.power("다이아몬드")); // power : 10
		System.out.println("--------------------------------------------------------------------------------");

		Park park = new Park();
		park.setName("Park");
		System.out.println("Park의 눈의 개수 : " + park.getEye());
		System.out.println("Park의 입의 개수 : " + park.getMouth());
		System.out.println("Park의 코의 개수 : " + park.getNose());
		System.out.println(park.eat());
		System.out.println(park.eat("볶음밥", 6500));

		System.out.println(park.did("공부", 3)); // score : 90 -> 96
		System.out.println(park.did("게임", 4)); // score : 96 -> 80
	}

}
