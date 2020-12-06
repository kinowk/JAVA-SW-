package day1102;

/**
 * variable arguments(가변인자형)의 사용 method를 호출할 떄 arguments(입력값)을 동적으로 넣어도 호출 가능한
 * method 형태 variable arguments를 정의할 때 가장 마지막에만 정의할 수 있다.
 * 
 * @author owner
 */
public class UseVariableArguments {
	public void testVA(int... param) {
		// System.out.println(param); // array는 참조형 데이터이므로 주소가 출력된다.
		for (int val : param) { // 향상된 for문
			System.out.println(val);
		}
	}
		
	// public int sumAge(int... paramAge, char c) { // 마지막에 정의
	public int sumAge(char c, int... paramAge) { // int[] paramAge; - array로 처리된다.
		int sum = 0;
		for(int inputAge : paramAge) {
			sum += inputAge;
		}
		return sum;
	}

	public static void main(String[] args) {
		UseVariableArguments uva = new UseVariableArguments();
		// uva.testVA(); // 입력값을 다양하게 설정하여 호출 가능
		uva.testVA(1, 2);
		
		int sumAge = uva.sumAge('0', 27, 1);
		System.out.println(sumAge);
	}

}
