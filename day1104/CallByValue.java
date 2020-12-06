package day1104;

/**
 * method�� parameter�� �⺻�� �����Ͷ�� arguments���� ����Ǿ� ���޵ȴ�.<br>
 * method�ȿ����� ����� ���� ������ ����ϰԵȴ�.(���� ���� ����X)
 * 
 * @author owner
 */
public class CallByValue {

	public void swap(int i, int j) { // ����� ���� ������ ���
		int temp = i;
		i = j;
		j = temp;
		System.out.println("swap) i  = " + i + ", j = " + j); // i = 4, j = 11
	}

	public static void main(String[] args) {
		int i = 11, j = 4;
		System.out.println("i  = " + i + ", j = " + j); // i = 11, j = 4
		CallByValue cbv = new CallByValue();
		cbv.swap(i, j); // ���� ���� ����X
		// value�� ����Ǿ� ���޵ǹǷ� method�� ȣ���ص� ���� value�� ������� �ʴ´�.
		System.out.println("i  = " + i + ", j = " + j); // i = 11, j = 4;
	}

}
