package day1022;
/*
method�ȿ��� �����ϰ�, method�ȿ����� ���Ǵ� local variable - �ڵ��ʱ�ȭX
method�� ȣ��Ǹ� memory�� �����ǰ�, ȣ���� ������ �����
*/

class LocalVariable{
	public static void main(String[] args) 	{
		int i;
		i = 5;
		System.out.println(i);
		i = 200;
		System.out.println(i);
	
		//int j; //�ʱ�ȭ ���� �ʿ�
		//System.out.println(j); //error

		//int i; //���� �̸��� variable ���� X 

		int maxScore = 100;
		int myScore = 80;
		System.out.println("�� ���� : " + myScore + ", ���� : " + maxScore);
	}
}
