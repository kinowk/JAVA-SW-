package day1030;

/**
 * Integer class에서 제공하는 instance method와 static method 사용<br>
 * - instance method는 객체의 instance variable을 사용하여 처리<br>
 * - static method는 parameter로 입력된 값으로만 업무처리
 * 
 * @author owner
 */
public class UseInteger {

	public static void main(String[] args) {
		// instance method
		Integer i = new Integer(30);
		System.out.println("객체 i : " + i);

		byte b = i.byteValue(); // i객체가 저장하고 있는 instance variable의 값을 instance method를 사용하여 byte형의 값으로 반환
		System.out.println("byte : " + b);

		double d = i.doubleValue();
		System.out.println("double : " + d);

		// staic method는 객체가 가진 값이 아닌 입력된 값(parameter)으로만 일시적인 처리
		Integer.parseInt("2020");
	}

}
