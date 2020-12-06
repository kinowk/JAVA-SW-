package day1104;

/**
 * call by reference method의 parameter가 참조형 데이터이면 하나의 주소가 method안으로 전달
 * 
 * @author owner
 */
public class CallByReference {

	private int i;
	private int j;

	/**
	 * 참조형 데이터를 parameter로 선언하여 주소를 전달받음, 주소는 유일함
	 * 
	 * @param cbr
	 */
	public void swap(CallByReference cbr) {
		int temp = cbr.i;
		cbr.i = cbr.j;
		cbr.j = temp;
	}

	public static void main(String[] args) {
		CallByReference cbr = new CallByReference();
		cbr.i = 11;
		cbr.j = 4;
		System.out.printf("swap전) cbr.i = %d, cbr.j = %d\n", cbr.i, cbr.j); // i = 11, j = 4
		cbr.swap(cbr);
		System.out.printf("swap후) cbr.i = %d, cbr.j = %d\n", cbr.i, cbr.j); // i = 4, j = 11
	}

}
