package day1029;

/**
 * 무한loop
 * 
 * @author owner
 */
public class InfiniteFor {

	public static void main(String[] args) {
		for (;;) {
			System.out.println("무한 loop");
			break;
		}

		for (int i = 0;; i++) {
			System.out.println("loop" + i);
			break;
		}

		// while 무한loop
		while (true) {
			System.out.println("while 무한loop");
		}
	}
}