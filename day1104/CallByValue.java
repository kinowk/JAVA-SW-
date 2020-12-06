package day1104;

/**
 * method의 parameter가 기본형 데이터라면 arguments값이 복사되어 전달된다.<br>
 * method안에서는 복사된 값을 가지고 사용하게된다.(원본 값에 영향X)
 * 
 * @author owner
 */
public class CallByValue {

	public void swap(int i, int j) { // 복사된 값을 가지고 사용
		int temp = i;
		i = j;
		j = temp;
		System.out.println("swap) i  = " + i + ", j = " + j); // i = 4, j = 11
	}

	public static void main(String[] args) {
		int i = 11, j = 4;
		System.out.println("i  = " + i + ", j = " + j); // i = 11, j = 4
		CallByValue cbv = new CallByValue();
		cbv.swap(i, j); // 원본 값에 영향X
		// value가 복사되어 전달되므로 method를 호출해도 원래 value는 변경되지 않는다.
		System.out.println("i  = " + i + ", j = " + j); // i = 11, j = 4;
	}

}
