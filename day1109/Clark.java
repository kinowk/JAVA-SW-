package day1109;

/**
 * 공통 특징은 Person class에서 사용하고, 자신만의 특징은 자식클래스에 정의하여 사용
 * 
 * @author owner
 */
public class Clark extends Person {
	public int power;

	/**
	 * 일반적인 power는 2, Clark 높은 power
	 */
	public Clark() {
		power = 7;
	}// Clark

	/**
	 * Clark의 power는 stone에 의해 제어
	 * 
	 * @param stone Stone Type
	 * @return Result By Stone
	 */
	public String power(String stone) {
		String result = null;
		if (stone.equals("다이아몬드")) {
			power = 10;
			result = "감사합니다.";
		} else if (stone.equals("크립토나이트")) {
			power = 0;
			result = "힘이 사라진다.";
		} else {
			power = 11;
			result = "힘이 폭발";
		}
		return result;
	}// power

	/**
	 * Person의 eat()을 자식클래스에 적합하게 재정의 - Override
	 */
	@Override
	public String eat() {
		// name의 접근제한자는 private이므로 자식클래스에서 사용할 수 없다.
		// 부모클래스의 private variable는 setter method, getter method을 사용하여 접근
		return getName() + "이(가) 집에서 빵을 먹는다.";
	}

	@Override
	public String eat(String menu, int price) {
		return getName() + "이(가) 레스토랑에서 " + menu + "을(를) " + price + "달러 주고 사먹었다.";
	}
}// class
