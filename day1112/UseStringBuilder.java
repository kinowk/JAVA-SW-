package day1112;

/**
 * StringBuffer, StringBuilder - �� ���ڿ��� ����� �� ���� class
 * 
 * @author owner
 */
public class UseStringBuilder {

	public void useStringBuffer() {
		StringBuffer sb = new StringBuffer(); // ��ü���� - �ٸ� class�� ����� ����ϱ� ���� // MultiThread���� �������� X ( ����ȭ O ) - ���� �ӵ�

//		append(); - �̾� ���̱�
//		sb.append("������ ");
//		sb.append(11);
//		sb.append("�� ");
//		sb.append(12);
//		sb.append("��"); // ������ 11�� 12��
		sb.append("������ ").append(11).append("�� ").append(12).append("��"); // method chain // ������ 11�� 12��

		System.out.println(sb);

//		insert();
		sb.insert(4, "2020�� "); // ������ 2020�� 11�� 12��

//		delete(int start, int end); // endIndex + 1

		sb.delete(4, 5 + 1); // ������ 20�� 11�� 12��

//		reverse();
		sb.reverse(); // ��21 ��11 ��02 ���ÿ�
		sb.reverse(); // ������ 20�� 11�� 12��

//		return StringBuffer

		System.out.println(sb);

		// StringBuffer -> String
		String str = sb.toString();

		System.out.println(str);
	}// useStringBuffer

	public void useStringBuilder() { // MultiThread���� �������� O ( ����ȭ X ) - ���� �ӵ�
		StringBuilder sb = new StringBuilder();

		// append();
		sb.append("������ ");
		sb.append(11);
		sb.append("�� ");
		sb.append(12);
		sb.append("��"); // ������ 11�� 12��

		// insert();
		sb.insert(4, "2020�� "); // ������ 2020�� 11�� 12��

		// delete(int start, int end); // endIndex + 1
		sb.delete(4, 5 + 1); // ������ 20�� 11�� 12��

		// reverse();
		sb.reverse(); // ��21 ��11 ��02 ���ÿ�
		sb.reverse(); // ������ 20�� 11�� 12��

		// return StringBuilder

		System.out.println(sb);

		// StringBuilder -> String
		String str = sb.toString();
		System.out.println(str);
	}// useStringBuilder

	public static void main(String[] args) {

		UseStringBuilder usb = new UseStringBuilder();
		usb.useStringBuffer();
		System.out.println("------------------------------------------------------------------------");
		usb.useStringBuilder();

		// String(���ڿ�)�� + ������ ����ϸ� Compiler�� + ������ StringBuilder�� ����
//		String str = "�ȳ�";
//		str += "�ϼ���.";
//		str += " ������ ������Դϴ�.";
//		System.out.println(str);

//		String str = "\uC548\uB155";
//      str = (new StringBuilder(String.valueOf(str))).append("\uD558\uC138\uC694.").toString();
//      str = (new StringBuilder(String.valueOf(str))).append(" \uC624\uB298\uC740 \uBAA9\uC694\uC77C\uC785\uB2C8\uB2E4.").toString();

	}// main

}// class
