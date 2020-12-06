package day1102;

/**
 * Overloading - ���� �̸��� method�� ����
 * 
 * @author owner
 */
public class UseOverloading {
	// Overloading
	/**
	 * �� �ϳ� ���
	 */
	public void printStar() {
		System.out.print("��");
	}

	/**
	 * �� parameter�� ���
	 * 
	 * @param num
	 */
	public void printStar(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("��");
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
