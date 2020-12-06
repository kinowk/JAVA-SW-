package day1111;

//Ctrl + Shift + o - import 단축키
import java.util.Calendar;
import java.util.Date;
//import java.sql.Date; // 다른 package의 같은 이름의 class를 import  할 수 없다. - full-path 사용
import java.util.List;

// '*'을 사용하면, 컴파일러는 해당 패키지에서 일치하는 클래스이름을 찾아야 하는 수고를 더 해야 할 것이다. 단지 그 뿐이다.
// 실행 시 성능상의 차이는 전혀 없다.

/**
 * import - 외부패키지에 존재하는 클래스를 사용하는 방법
 * 
 * @author owner
 */
public class TestImport {

	public static void main(String[] args) {
		Date d = new Date(); // java.util.Date
		Calendar cal = null;
		List list = null;
		java.sql.Date da = null; // java.sql.Date
	}

}
