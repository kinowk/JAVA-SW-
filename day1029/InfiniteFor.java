package day1029;

/**
 * 公茄loop
 * 
 * @author owner
 */
public class InfiniteFor {

	public static void main(String[] args) {
		for (;;) {
			System.out.println("公茄 loop");
			break;
		}

		for (int i = 0;; i++) {
			System.out.println("loop" + i);
			break;
		}

		// while 公茄loop
		while (true) {
			System.out.println("while 公茄loop");
		}
	}
}