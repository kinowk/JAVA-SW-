package day1029;

/**
 * ����loop
 * 
 * @author owner
 */
public class InfiniteFor {

	public static void main(String[] args) {
		for (;;) {
			System.out.println("���� loop");
			break;
		}

		for (int i = 0;; i++) {
			System.out.println("loop" + i);
			break;
		}

		// while ����loop
		while (true) {
			System.out.println("while ����loop");
		}
	}
}