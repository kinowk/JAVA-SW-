package day1111.sub;

/**
 * 공통 특징은 Person class에서 사용하고, 자신만의 특징은 자식클래스에 정의하여 사용
 * 
 * @author owner
 */
public class HongGilDong extends Person {
	private int level;

	/**
	 * 일반적인 level는 3, 최대 level은 10<br>
	 * 홍길동의 level는 6
	 */
	public HongGilDong() {
		level = 6;
	}// HongGilDong

	/**
	 * fight method<br>
	 * 낮은 level의 상대와 싸우면 win, 같은 level의 상대와 싸우면 draw, 높은 level의 상대와 싸우면 lose
	 * 
	 * @param yourLevel
	 * @return
	 */
	public String fight(int yourLevel) {
		String result = null;
		if (level < yourLevel) {
			level--;
			if (level < 0) {
				level = 0;
			}
			result = "Lose";
		} else if (level > yourLevel) {
			level++;
			if (level > 10) {
				level = 10;
			}
			result = "Win";
		} else {
			result = "Draw";
		}
		return result;
	}// fight

	/**
	 * 부모클래스에서 제공하는 기능이 자식클래스와 맞지 않아, 자식클래스에서 method를 Override
	 */
	@Override
	public String eat(String menu, int price) {
		return getName() + "이(가) 주막에서 " + menu + "을(를) " + price + "냥 주고 사먹었다.";
	}

	@Override
	public String eat() {
		return getName() + "이(가) 집에서 밥을 먹는다.";
	}

	@Override
	public String[] language() {
		String[] language = { "한국어", "증국어" };
		return language;
	}

} // class
