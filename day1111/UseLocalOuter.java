package day1111;

/**
 * method ���ο� �����ϰ�, method �ȿ����� ���Ǵ� local class ���
 * 
 * @author owner
 */
public class UseLocalOuter { //UseLocalOuter.class - bytecode
	int outI; // Local class���� �� �Ҵ� ����

	public void method(int param_i, int param_j) {
		int locI = 10;
		int locJ = 20;

		// local class

		class Local { // UseLocalOuter$1Local.class - bytecode
			int i;

			public Local() {
				System.out.println("Local class�� constructor");
			}

			public void localMethod() {
				System.out.println("Local class�� method");
				System.out.println("Local class�� i = " + i);
				System.out.println("Outer class�� instance variable : outI = " + outI); // instance variable ���
				System.out.println("Outer class�� method�Ǿ��� instance variable : locI = " + locI + ", locJ = " + locJ); // method
																														// ����
																														// ��������
				System.out.println("Outer class�� method�� parameter : param_i = " + param_i + ", param_j = " + param_j);

				// Local class���� Outer class�� instance variable �� �Ҵ� ����
				outI = 34;
//				locI = 1; // �������� ��� ����, �� �Ҵ� �Ұ�
//				locJ = 2;
//				param_i = 3; // 
//				param_j = 4;
			}
		} // local class

		
		// local class�� ��üȭ
		Local local = new Local();
		local.i = 100;
		local.localMethod(); // Local class�� localMethod ȣ��

	}// method

	public static void main(String[] args) {
		UseLocalOuter ulo = new UseLocalOuter();
		ulo.method(2020, 11);
	}// main

}// class
