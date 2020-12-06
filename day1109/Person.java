package day1109;

/**
 * 사람을 추상화하여 만드는 class<br>
 * 부모클래스 - 사람의 공통 특징만 정의하여 만듬<br>
 * eye, nose, mouth, name<br>
 * eat
 * 
 * @author owner
 */
public class Person {
	private int eye, nose, mouth;
	private String name;

	/**
	 * Person class의 default constructor<br>
	 * eye == 2, nose == 1, mouth == 1 가 설정되는 Person 객체를 생성할 때 사용
	 */
	public Person() {
		this(2, 1, 1);
//		eye = 2;
//		nose = 1;
//		mouth = 1;
	}

	public Person(int eye, int nose, int mouth) {
		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;
	}

	public void setEye(int eye) {
		this.eye = eye;
	}

	public int getEye() {
		return eye;
	}

	public void setNose(int nose) {
		this.nose = nose;
	}

	public int getNose() {
		return nose;
	}

	public void setMouth(int mouth) {
		this.mouth = mouth;
	}

	public int getMouth() {
		return mouth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String eat() {
		return name + "이(가) 집에서 밥을 먹는다.";
	}

	public String eat(String menu, int price) {
		return name + "이(가) 식당에서 " + menu + "를 " + price + "원 주고 사먹었다.";
	}

}
