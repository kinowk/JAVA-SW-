package day1112;

import java.util.StringTokenizer;

/**
 * String�� Token���� �ڸ� ��
 * 
 * @author owner
 */
public class UseStringTokenizer {

	public UseStringTokenizer() {
		String str = "������������ ������ ������ ���հ�,�Ϳ�,�ӳɳ�,�׳ɳɳ�";

//		StringTokenizer stk = new StringTokenizer(str); // ���ڿ��� �������� ����

//		StringTokenizer stk = new StringTokenizer(str, "��, "); // ���ڿ��� Ư�� String���� ����, ���� ���ڸ� ��ȣ���� �ʴ´�. // '��', ',', ' '�� �������� ����

		StringTokenizer stk = new StringTokenizer(str, "��, ", false); // true - ���ع��� ��ȣ, false - ���ع��� ��ȣ X

		System.out.println("��ū�� �� : " + stk.countTokens()); // 4
//		System.out.println("��ū�� ���� : " + stk.hasMoreTokens()); // true
//		System.out.println("pointer�� �����ϴ� ��ġ�� Token�� ���, pointer�� ���� Token���� �̵� : "+stk.nextToken()); // ������������
//		System.out.println("��ū�� �� : " + stk.countTokens()); // pointer�� �̵��Ͽ� Token�� �� 4 -> 3

		// while - �ݺ�Ƚ���� �� �� ���� �� ����ϴ� �ݺ���
		while (stk.hasMoreTokens()) { // ��� Token ���
			System.out.println(stk.nextToken());
		}
		System.out.println("---------------------------------------");
		// pointer�� ������
		while (stk.hasMoreTokens()) { // ��� Token ���
			System.out.println(stk.nextToken());
		}
	}// UseStringTokenizer

	public void UseSplit() {
		String csvData = "Java,Oracle,JDBC,HTML.CSS,JavaScript";
		String[] subjectArray = csvData.split("J");
		// split�� '.'�� �ڸ� �� ����. // '.'���� �ڸ����� ���Խ� ���·� ��� ( csvData.split("[.]"); )

		System.out.println(subjectArray.length);

		for (int i = 0; i < subjectArray.length; i++) {
			System.out.println(subjectArray[i]);
		}
	}

	public static void main(String[] args) {
		new UseStringTokenizer();
		new UseStringTokenizer().UseSplit();
	}

}
