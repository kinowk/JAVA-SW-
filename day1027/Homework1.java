package day1027;

class Homework1 {

	public static final int TOWN_BUS = 850;
	public static final int BUS = 1250;
	public static final int SUBWAY = 1350;
	public static final int ADD_FEE = 100;

	public static void main(String[] args) {

		int distance = Integer.parseInt(args[1]);

		int basicFee;
		int extraFee;
		int fee;

		if (distance <= 10) {
			extraFee = 0;
		} else {
			extraFee = (distance - 1) / 5 - 1;
		}

		if (args[0].equals("마을버스")) {
			basicFee = TOWN_BUS;
			fee = TOWN_BUS + ADD_FEE * extraFee;
			System.out.println("입력교통수단 : " + args[0] + ", 이동거리 : " + distance + "km, 기본요금 : " + basicFee + "원, 총 요금 : "
					+ fee + "원");
		} else if (args[0].equals("버스")) {
			basicFee = BUS;
			fee = BUS + ADD_FEE * extraFee;
			System.out.println("입력교통수단 : " + args[0] + ", 이동거리 : " + distance + "km, 기본요금 : " + basicFee + "원, 총 요금 : "
					+ fee + "원");
		} else if (args[0].equals("지하철")) {
			basicFee = SUBWAY;
			fee = SUBWAY + ADD_FEE * extraFee;
			System.out.println("입력교통수단 : " + args[0] + ", 이동거리 : " + distance + "km, 기본요금 : " + basicFee + "원, 총 요금 : "
					+ fee + "원");
		} else {
			System.out.println("대중교통수단이 아닙니다.");
		}
		System.out.println("-------------------------------------------");
	}
}