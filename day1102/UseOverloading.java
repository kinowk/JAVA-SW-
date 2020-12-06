package day1102;

/**
 * Overloading - 같은 이름의 method를 정의
 * 
 * @author owner
 */
public class UseOverloading {
	// Overloading
	/**
	 * ★ 하나 출력
	 */
	public void printStar() {
		System.out.print("★");
	}

	/**
	 * ★ parameter개 출력
	 * 
	 * @param num
	 */
	public void printStar(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("★");
		}
	}

	public static void main(String[] args) {
		UseOverloading uo = new UseOverloading();
		uo.printStar();
		uo.printStar(5);

		System.out.println();
		System.out.println("------------------------------------");

		for (int i = 1; i < 5; i++) {
			uo.printStar(i);
			System.out.println();
		}
	}

}
