package day1102;

/**
 * Marker class를 생성하고 사용하기 위한 class
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
		 * black.setColor("검정"); black.setCap(1); black.setBody(1);
		 */
		System.out.println("Marker-pen의 Cap : " + black.getCap());
		System.out.println("Marker-pen의 Body : " + black.getBody());
		System.out.println("Marker-pen의 Color : " + black.getColor());

		/*
		 * red.setColor("빨강"); red.setCap(1); red.setBody(1);
		 */
		Marker red = new Marker(1, 1, "빨강");
		System.out.println(red.write("zzz"));
		
		System.out.println("Marker-pen의 Cap : " + red.getCap());
		System.out.println("Marker-pen의 Body : " + red.getBody());
		System.out.println("Marker-pen의 Color : " + red.getColor());
	}

}
