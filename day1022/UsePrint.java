package day1022;
/*
	Java���� �����ϴ� ǥ�� ��� method���
	System.out.print(); // ��� �� �ٺ��� X
	System.out.println(); // ��� �� �ٺ���
*/
class  UsePrint{
	public static void main(String[] args) 	{
	/*
		System.out.print("Hello");
		System.out.print("Java");
	*/
	//���� ���� ��� - constant
	System.out.println(2020); //int
	System.out.println(2020.22); //double
	System.out.println('A'); //char
	System.out.println("������ ������Դϴ�."); //string
	System.out.println(true); //boolean
	
	//���� ���� ��� - variable
	int i=10; //�⺻�� ��������
	UsePrint up = new UsePrint(); //������ ��������
	System.out.println("---------------------------------------------");
	System.out.println(i);
	System.out.println(up);
	System.out.println("---------------------------------------------");
	System.out.println(10+22);
	System.out.println("10+22=" + 10 + 22 ); //String�� +��ȣ�� ����ϸ� ������ �ǹ� - output 10+22=1022
	
	//System.out.println(); // ���� ���� ������ �ٹٲ� ����
	//System.out.print(); // ���� ���� ������ error
	System.out.println("-----------------------A----------------------");
	System.out.println();
	System.out.println("-----------------------B----------------------");
	//System.out.print(); //error
	//byte b=128; //error(range)

	long j = 2147483647;
	long l = 3000000000L; //���̻� l�� �پ� ���ͷ��� ũ�Ⱑ 8byt�� ����
	//��� ���ͷ��� ũ�Ⱑ 4byte�̹Ƿ� �� 21������� ���尡��
	//��������� ���� literal�� ũ�⸦ �ø� �� "�����" ���
	//����� : ����ڿ��� ���� �� �ִ�.
	//literal�� ũ�⸦ �Ͻ������� ������ �� ���
	//����literal : L,l		4byte�� literal�� 8byte�� ũ�� ��ȯ
	//�Ǽ�literal : F,f		4byte�� literal�� 4byte�� �۰� ��ȯ
	//				D,d		ũ�⺯ȯ ����(8byte -> 8byte)

	//�ڵ�����ȯ : int�� ������������(byte, short)���� ������ �����ϰ� ���� �Ҵ��� �� �߻�
	byte b = 127; //4byte�� literal�� 1byte�� ��ȯ�Ǿ� �Ҵ�
	short s = 1;
	System.out.println(b+" , "+s);

	byte b1=10;
	byte b2=20;
	//byte result = 0;
	int result = 0;
	result = b1+b2; //constant�� �Ҵ��ϴ°� �ƴ϶� byteŸ���� ���� result�� intŸ���� �� b1+b2�� �Ҵ� �Ұ�
	System.out.println(b1+"+"+b2+"="+result);
	
	char c = 44032; //'��'�� �����ڵ尪 44032 
	System.out.println(c); //��
	
	float f = 3.14f; 
	//3.14�� ���̻簡 ���� �ʾ����Ƿ� float literal�� �ƴ϶� double literal�� ����
	//3.14�� floatŸ���� ������ ���� ���ӿ��� �ұ��ϰ� �����Ͻ� error
	System.out.println(f);

	double d = 3.14;
	System.out.println(d);
	}
}