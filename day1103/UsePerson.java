package day1103;

/**
 * setter, getter Person class를 사용
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
		person.setName("김건부");

		System.out.println("눈 : " + person.getEye());
		System.out.println("코 : " + person.getNose());
		System.out.println("입 : " + person.getMouth());
		System.out.println(person.eat());
		System.out.println(person.eat("부대찌개", 8000));

		Person p = new Person();
		/*
		 * p.setEye(2); p.setMouth(1); p.setNose(1);
		 */
		p.setName("박권익");
		System.out.println(p.eat());
		System.out.println(p.eat("냉면", 7000));

		Person jinban = new Person(3, 1, 1);
		jinban.setName("천진반");
		System.out.println(jinban.eat());
	}

}
