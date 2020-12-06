package day1026;
/*
논리연산자 &&, ||, &, |, ^
*/	
class Operator5 {
	public static void main(String[] args) {
		boolean flag1 = true, flag2 = false, flag3 = true, flag4 = false;
		System.out.println(10 < 26 && 10 > 5);
		System.out.println("-----------------&&-------------------");
		System.out.println(flag1+" && " +flag3+" = "+ (flag1 && flag3));
		System.out.println(flag1+" && " +flag2+" = "+ (flag1 && flag2));
		System.out.println(flag2+" && " +flag1+" = "+ (flag2 && flag1));
		System.out.println(flag2+" && " +flag4+" = "+ (flag2 && flag4));
		//좌측 피연산자가 false이면, 우측 피연산자의 값은 평가하지 않는다. (속도) 
		System.out.println("-----------------||-------------------");
		System.out.println(flag1+" || " +flag3+" = "+ (flag1 || flag3));
		System.out.println(flag1+" || " +flag2+" = "+ (flag1 || flag2));
		System.out.println(flag2+" || " +flag1+" = "+ (flag2 || flag1));
		System.out.println(flag2+" || " +flag4+" = "+ (flag2 || flag4));
		//좌측 피연산자가 true 이면, 우측 피연산자의 값은 평가하지 않는다. (속도)

		flag1 = true;
		flag2 = true;
		flag3 = true;

		flag3 = (flag1 = 3<2) && (flag2 = 4>5);
		System.out.println("좌항 : " + flag1 + ", 우항 : " + flag2 + ", 결과 : " + flag3); //좌항이 false이므로 우항을 연산하지않아 flag2가 true로 출력

		System.out.println("---------------------------------------");

		int i = 20;
		int j = 19;
		System.out.println(i+" & "+j+" = "+ (i&j));
		i = 17;
		j = 13;
		System.out.println(i+" | "+j+" = "+ (i|j));
		System.out.println(i+" ^ "+j+" = "+ (i^j));
	}
}
