package day1103;

/**
 * setter, getter Person class�� ���
 * 
 * @author owner
 */
public class UsePerson {

	/**
	 * Java Application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person();
		/*
		 * person.setEye(2); person.setNose(1); person.setMouth(1);
		 */
		person.setName("��Ǻ�");

		System.out.println("�� : " + person.getEye());
		System.out.println("�� : " + person.getNose());
		System.out.println("�� : " + person.getMouth());
		System.out.println(person.eat());
		System.out.println(person.eat("�δ��", 8000));

		Person p = new Person();
		/*
		 * p.setEye(2); p.setMouth(1); p.setNose(1);
		 */
		p.setName("�ڱ���");
		System.out.println(p.eat());
		System.out.println(p.eat("�ø�", 7000));

		Person jinban = new Person(3, 1, 1);
		jinban.setName("õ����");
		System.out.println(jinban.eat());
	}

}
