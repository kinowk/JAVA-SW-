package day1026;
/*
main method�� arguments input
java class�� ������ �� �ܺο��� ���� �־� ����
�ܺ� ���� �Է¹����� ����ڰ� �Է��� ������ ���α׷��� �����ϱ� ������ ���α׷��� �������� �����Ѵ�.
*/
class UseArguments {
	public static void main(String[] args ) {
		System.out.println("ù���� �Է°� : " + args[0] );
		System.out.println("�ι�° �Է°� : " + args[1] );
		System.out.println("������ �Է°� : " + args[2] );
		//�ܺ� ���� �Է¹ޱ����� parameter�� data type�� String
		System.out.println(args[0] + args[1]); // 10 + 22 -> 1022 (String)
		
		int num1 = Integer.parseInt(args[0]); //Integer.parseInt() method�� ����Ͽ� string tyoe 10�� int type���� ��ȯ
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1+num2);
	}
}
