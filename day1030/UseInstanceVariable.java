package day1030;

/**
 * instance variable�� ����� ���
 * 
 * @author owner
 */
public class UseInstanceVariable {

	int year;
	int month;

	public static void main(String[] args) {
		// program�� �����ϸ� ���� ���� ����Ǵ� static area������ instance area�� variable�� ���� ����� �� ����.
		UseInstanceVariable uiv = new UseInstanceVariable(); // ��üȭ instantiate
		uiv.year = 2020;
		uiv.month = 10;
		System.out.println(uiv.year + " - " + uiv.month);

		UseInstanceVariable uiv1 = new UseInstanceVariable();
		uiv1.year = 1994;
		uiv1.month = 04;
		System.out.println(uiv1.year + " - " + uiv1.month);
		System.out.println((uiv.year - uiv1.year + 1) + "��");
	}

}
