package day1103;

public class Homework {
	private int noodle, powder, soup, price;
	private String name;

	// default constructor
	public Homework() {
		noodle = 1;
		powder = 1;
		soup = 1;
	}

	// constructor
	public Homework(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public void setNoodle(int noodle) {
		this.noodle = noodle;
	}

	public int getNoodle() {
		return noodle;
	}

	public void setPowder(int powder) {
		this.powder = powder;
	}

	public int getPowder() {
		return powder;
	}

	public void setSoup(int soup) {
		this.soup = soup;
	}

	public int getSoup() {
		return soup;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void sell() {
		System.out.println(name + "을(를) " + price + "원에 판매하고 있습니다.");
	}
	

}
