package day1117;

import java.util.Queue;
import java.util.Stack;

/**
 * Stack - LIFO를 구현한 class<br>
 * 
 * @author owner
 */
public class UseStack {

	public UseStack() {
		// 1. 생성
		Stack<String> stack = new Stack<String>(); // is a 관계의 객체화를 하지 않는다.
		// method호출 - 부모의 method를 사용X
//		push() - Pushes an item onto the top of this stack.
		stack.push("1. Java SE");
		stack.push("2. Oracle");
		stack.push("3. JDBC");
		stack.push("4. Java EE");
		System.out.println(stack);

		// empty()
		System.out.println("Stack이 비어있는가 ? : " + stack.empty());

//		pop() - Removes the object at the top of this stack and returns that object as the value of this function
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
		System.out.println("Stack이 비어있는가 ? : " + stack.empty());
	}// UseStack

	public static void main(String[] args) {
		new UseStack();
	}// main

}// class
