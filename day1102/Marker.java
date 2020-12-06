package day1102;

/**
 * Marker-pen�� ������� �����Ͽ� ���۵� class<br>
 * �߻�ȭ
 * 
 * @author owner
 */
public class Marker {
	private int cap, body;
	private String color;

	/**
	 * �⺻������<br>
	 * Marker-pen ��ü�� �����Ǹ� cap 1��, body 1��, ���� color��
	 */
	public Marker() {
		this(1, 1, "����");
//		cap = 1;
//		body = 1;
//		color = "����";
	}

	/**
	 * Constructor Overloading
	 * 
	 * @param cap
	 * @param body
	 * @param color
	 */
	public Marker(int cap, int body, String color) {
		this.cap = cap;
		this.body = body;
		this.color = color;
	}

	public void setCap(int cap) {
		if (cap > 10) {
			cap = 10;
		}
		this.cap = cap;
	}

	public int getCap() {
		return cap;
	}

	public void setBody(int body) {
		this.body = body;
	}

	public int getBody() {
		return body;
	}

	public void setColor(String color) {
		if (!(color.equals("����") || color.equals("����") || color.equals("�Ķ�"))) {
			color = "����";
		}
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String write(String msg) {
		return msg + "�� " + color + " color�� Marker-pen���� ȭ��Ʈ���忡 �ۼ��Ѵ�.";
	}

}