package day1030;

/**
 * instance variable�� ����ϴ� instance method
 * 
 * @author owner
 */
public class UseInstanceMethod {
	int year = 2020;

	/**
	 * �¾ �⵵�� �Է¹޾� ���̸� �����ϴ� ����<br>
	 * ����� : ���� - �¾�� + 1<br>
	 * ���ش� 2020������ instance variable�� ����Ǿ� �ִ�.
	 * 
	 * @param birth �¾ ��
	 * @return ����
	 */
	public int getAge(int birth) {

		return (year - birth + 1);
	}

	public static void main(String[] args) {
		UseInstanceMethod uim = new UseInstanceMethod();
		int birth = 1994;
		int age = uim.getAge(birth); // instance method ȣ��
		System.out.println("Age : " + age);
	}

}
