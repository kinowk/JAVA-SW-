package day1118;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class work1117 {

	public static final int UNKNOWN_YEAR = 2;

	/**
	 * List�� �����͸� �߰��ϰ� ��ȯ�ϴ� ��
	 * 
	 * @return ���α׷�, �ְ�����, ���߳⵵
	 */
	public List<String> getList() {
		List<String> list = new ArrayList<String>(); // is a ������ ��üȭ
		list.add("Java-James Gosling:1995");
		list.add("Oracle-Larry Ellison");
		list.add("Python-Guido van Rossum:1991");
		list.add("HTML-Tim Berners, LEE:1995");
		list.add("JavaScript-Brendan Eich");
		return list;
	}// getList

	public void printList(List<String> list) { // ó���� �����͸� ���� ����Ʈ�� �Ű������� �޾�
		System.out.println("�׸�\t�ٽɰ�����\t��ǥ�⵵");
		System.out.println("---------------------------------------------------------");
		if (list.isEmpty()) { // �����Ͱ� ���� ��
			System.out.println("ó���� �����Ͱ� �������� �ʽ��ϴ�.");
		} else { // ó���� �����Ͱ� ������ ��
			String data = null; // �ݺ����� List�� ���� �� ���� ����
			StringTokenizer stk = null;
			int countToken = 0;
			for (int i = 0; i < list.size(); i++) {
				data = list.get(i);
				stk = new StringTokenizer(data, "-:");
				countToken = stk.countTokens(); // ���� ���ڿ��� ���е� Token�� ���� ��´�.
				while (stk.hasMoreTokens()) {
					System.out.printf("%s\t", stk.nextToken());
				} // while

				switch (countToken) {
				case UNKNOWN_YEAR:
					System.out.printf("%s", "�˼�����");
				}

//				if (countToken == 2) {
//					System.out.printf("%s", "�˼�����");
//				}
				countToken = 0;
				System.out.println();
			} // for
		} // if
	}// printList

	public static void main(String[] args) {
		work1117 work = new work1117();
		List<String> list = work.getList();
		work.printList(list);
	}// main

}// class
