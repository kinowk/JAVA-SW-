package day1110;

/**
 * 자식클래스
 * 
 * @author owner
 */
public class TestSub extends TestSuper {

	int j; // 부모클래스에 같은 이름의 variable 존재
	int k;

	public TestSub() {
		super(11);
		System.out.println("TestSub의 기본생성자(Child)");

	}

	@Override
	public void print() {
		j = 11;
		k = 10;
		i = 20000; // 부모클래스에 존재하는 variable
//		this.i = 20000;
//		super.i = 20000;
		// 부모와 자식이 같은 이름의 variable을 갖는 경우
		super.j = 2020; // 부모의 variable - super

		System.out.println(this);
//		System.out.println(super); // 자식클래스에서 부모클래스의 주소를 출력할 수 없다.
		System.out.println("자식 : j = " + j + ", k : " + k);
		super.print();
	}

	public static void main(String[] args) {
		TestSub ts = new TestSub();
		ts.print(); // TestSub의 print() method
		// 객체의 주소로는 부모와 자식의 이름이 같다면 식별되지 못하기 때문에 부모의 자원을 호출할 수 없다.(super - instance영역에서만 사용)
//		TestSuper test_super = new TestSub();
//		test_super.print(); // TestSub의 print() method 실행

	}// main

}// class
