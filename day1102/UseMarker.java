package day1102;

/**
 * Marker class�� �����ϰ� ����ϱ� ���� class
 * 
 * @author owner
 */
public class UseMarker {

	/**
	 * Java Application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Marker black = new Marker(); // default constructor

		/*
		 * black.setColor("����"); black.setCap(1); black.setBody(1);
		 */
		System.out.println("Marker-pen�� Cap : " + black.getCap());
		System.out.println("Marker-pen�� Body : " + black.getBody());
		System.out.println("Marker-pen�� Color : " + black.getColor());

		/*
		 * red.setColor("����"); red.setCap(1); red.setBody(1);
		 */
		Marker red = new Marker(1, 1, "����");
		System.out.println(red.write("zzz"));
		
		System.out.println("Marker-pen�� Cap : " + red.getCap());
		System.out.println("Marker-pen�� Body : " + red.getBody());
		System.out.println("Marker-pen�� Color : " + red.getColor());
	}

}
