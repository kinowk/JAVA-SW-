package day1109;

public class Park extends Person {
	private int score;

	public Park() {
		score = 90;
	}

	public String did(String did, int hour) {
		String result = null;
		if (did.equals("����")) {
			for (int i = hour; i > 0; i--) {
				score += 2;
				if (score > 100) {
					score = 100;
				}
				result = "���θ� �߽��ϴ�. (���� ���� : " + score + ")";
			}
		} else {
			for (int i = hour; i > 0; i--) {
				score -= 4;
				if (score < 0) {
					score = 0;
				}
				result = "���θ� ���߽��ϴ�. (���� ���� : " + score + ")";
			}
		}
		return result;
	}

}