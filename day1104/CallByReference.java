package day1104;

/**
 * call by reference method�� parameter�� ������ �������̸� �ϳ��� �ּҰ� method������ ����
 * 
 * @author owner
 */
public class CallByReference {

	private int i;
	private int j;

	/**
	 * ������ �����͸� parameter�� �����Ͽ� �ּҸ� ���޹���, �ּҴ� ������
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
		System.out.printf("swap��) cbr.i = %d, cbr.j = %d\n", cbr.i, cbr.j); // i = 11, j = 4
		cbr.swap(cbr);
		System.out.printf("swap��) cbr.i = %d, cbr.j = %d\n", cbr.i, cbr.j); // i = 4, j = 11
	}

}
