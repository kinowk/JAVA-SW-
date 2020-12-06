package day1117;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Homework2 {

	public static final int YEAR = 3;

	public List<String> inputList(String str) {
		List<String> list = new ArrayList<String>();

		StringTokenizer stk = new StringTokenizer(str, "-:");

		while (stk.hasMoreTokens()) {
			list.add(stk.nextToken());
		}
		return list;
	}

	public void print(List<List> list) {
		System.out.println("항목\t\t\t핵심개발자\t\t\t개발년도");
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.printf("%s\t\t\t", list.get(i).get(j));
			}
			if (list.get(i).size() < YEAR) {
				System.out.println("알수없음");
			} else {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Homework2 homework = new Homework2();
		List<String> list1 = homework.inputList("Java-James Gosling:1995");
		List<String> list2 = homework.inputList("Oracle-Larry Ellison");
		List<String> list3 = homework.inputList("Python-Guido van Rossum:1991");
		List<String> list4 = homework.inputList("HTML-Tim Berners, LEE:1995");
		List<String> list5 = homework.inputList("JavaScript-Brendan Eich");
		
		List<List> list = new ArrayList<List>();
		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		list.add(list5);
//		{ list1, list2, list3, list4, list5 };
//		List<String> strArr = new ArrayList<String>[5];
//		List<String>[] arr1 = new List[] { list1, list2, list3, list4, list5 };
		homework.print(list);
	}

}
