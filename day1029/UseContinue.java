package day1029;

/**
 * continue
 * 
 * @author owner
 */
public class UseContinue {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}