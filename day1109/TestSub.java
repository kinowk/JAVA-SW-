package day1109;

/**
 * �ڽ�Ŭ������ �����ϸ� �θ�Ŭ������ ���� �����ȴ�.
 * 
 * @author owner
 */
public class TestSub extends TestSuper {

	public TestSub() {
		System.out.println("�ڽ�Ŭ������ ������");
	}// TestSub

	public static void main(String[] args) {
		TestSub ts = new TestSub();
		// �ڵ� ���뼺 - �θ�Ŭ������ variable, method�� �ڽ�Ŭ�������� �ڽ��� instance�� ���
		System.out.println("public variable : " + ts.a); // �θ�Ŭ������ public variable
		System.out.println("protected variable : " + ts.b); // �θ�Ŭ������ protected variable
		System.out.println("default variable : " + ts.c); // �θ�Ŭ������ default variable(���� package ��밡��, �ٸ� package ���Ұ�)
		// private variable - class ���ο����� ���
		ts.methodSuper(); // �θ�Ŭ������ method
	}// main

}// class
