package day1026;
/*
�������� &&, ||, &, |, ^
*/	
class Operator5 {
	public static void main(String[] args) {
		boolean flag1 = true, flag2 = false, flag3 = true, flag4 = false;
		System.out.println(10 < 26 && 10 > 5);
		System.out.println("-----------------&&-------------------");
		System.out.println(flag1+" && " +flag3+" = "+ (flag1 && flag3));
		System.out.println(flag1+" && " +flag2+" = "+ (flag1 && flag2));
		System.out.println(flag2+" && " +flag1+" = "+ (flag2 && flag1));
		System.out.println(flag2+" && " +flag4+" = "+ (flag2 && flag4));
		//���� �ǿ����ڰ� false�̸�, ���� �ǿ������� ���� ������ �ʴ´�. (�ӵ�) 
		System.out.println("-----------------||-------------------");
		System.out.println(flag1+" || " +flag3+" = "+ (flag1 || flag3));
		System.out.println(flag1+" || " +flag2+" = "+ (flag1 || flag2));
		System.out.println(flag2+" || " +flag1+" = "+ (flag2 || flag1));
		System.out.println(flag2+" || " +flag4+" = "+ (flag2 || flag4));
		//���� �ǿ����ڰ� true �̸�, ���� �ǿ������� ���� ������ �ʴ´�. (�ӵ�)

		flag1 = true;
		flag2 = true;
		flag3 = true;

		flag3 = (flag1 = 3<2) && (flag2 = 4>5);
		System.out.println("���� : " + flag1 + ", ���� : " + flag2 + ", ��� : " + flag3); //������ false�̹Ƿ� ������ ���������ʾ� flag2�� true�� ���

		System.out.println("---------------------------------------");

		int i = 20;
		int j = 19;
		System.out.println(i+" & "+j+" = "+ (i&j));
		i = 17;
		j = 13;
		System.out.println(i+" | "+j+" = "+ (i|j));
		System.out.println(i+" ^ "+j+" = "+ (i^j));
	}
}
