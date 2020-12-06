package day1112;

/**
 * 상속을 하지 못하게 막는 final class
 * 
 * @author owner
 */
public class FinalSuper { // class의 접근제한자 final - 자식class 상속X
	public void methodA() { // method의 접근제한자 final - method의 Override를 할 수 없다.
		System.out.println("methodA");
	}

	public void methodB() {
		System.out.println("methodB");
	}
}
