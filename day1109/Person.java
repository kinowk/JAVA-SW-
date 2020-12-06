package day1109;

/**
 * ����� �߻�ȭ�Ͽ� ����� class<br>
 * �θ�Ŭ���� - ����� ���� Ư¡�� �����Ͽ� ����<br>
 * eye, nose, mouth, name<br>
 * eat
 * 
 * @author owner
 */
public class Person {
	private int eye, nose, mouth;
	private String name;

	/**
	 * Person class�� default constructor<br>
	 * eye == 2, nose == 1, mouth == 1 �� �����Ǵ� Person ��ü�� ������ �� ���
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
		return name + "��(��) ������ ���� �Դ´�.";
	}

	public String eat(String menu, int price) {
		return name + "��(��) �Ĵ翡�� " + menu + "�� " + price + "�� �ְ� ��Ծ���.";
	}

}
