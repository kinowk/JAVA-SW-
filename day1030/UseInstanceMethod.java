package day1030;

/**
 * instance variable을 사용하는 instance method
 * 
 * @author owner
 */
public class UseInstanceMethod {
	int year = 2020;

	/**
	 * 태어난 년도를 입력받아 나이를 연산하는 업무<br>
	 * 연산식 : 올해 - 태어난해 + 1<br>
	 * 올해는 2020년으로 instance variable에 저장되어 있다.
	 * 
	 * @param birth 태어난 해
	 * @return 나이
	 */
	public int getAge(int birth) {

		return (year - birth + 1);
	}

	public static void main(String[] args) {
		UseInstanceMethod uim = new UseInstanceMethod();
		int birth = 1994;
		int age = uim.getAge(birth); // instance method 호출
		System.out.println("Age : " + age);
	}

}
