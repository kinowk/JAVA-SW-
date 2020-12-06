package day1030;

/**
 * instance variable의 선언과 사용
 * 
 * @author owner
 */
public class UseInstanceVariable {

	int year;
	int month;

	public static void main(String[] args) {
		// program을 실행하면 가장 먼저 실행되는 static area에서는 instance area의 variable을 직접 사용할 수 없다.
		UseInstanceVariable uiv = new UseInstanceVariable(); // 객체화 instantiate
		uiv.year = 2020;
		uiv.month = 10;
		System.out.println(uiv.year + " - " + uiv.month);

		UseInstanceVariable uiv1 = new UseInstanceVariable();
		uiv1.year = 1994;
		uiv1.month = 04;
		System.out.println(uiv1.year + " - " + uiv1.month);
		System.out.println((uiv.year - uiv1.year + 1) + "살");
	}

}
