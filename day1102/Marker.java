package day1102;

/**
 * Marker-pen을 대상으로 선정하여 제작된 class<br>
 * 추상화
 * 
 * @author owner
 */
public class Marker {
	private int cap, body;
	private String color;

	/**
	 * 기본생성자<br>
	 * Marker-pen 객체가 생성되면 cap 1개, body 1개, 검정 color가
	 */
	public Marker() {
		this(1, 1, "검정");
//		cap = 1;
//		body = 1;
//		color = "검정";
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
		if (!(color.equals("검정") || color.equals("빨강") || color.equals("파랑"))) {
			color = "검정";
		}
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String write(String msg) {
		return msg + "를 " + color + " color인 Marker-pen으로 화이트보드에 작성한다.";
	}

}