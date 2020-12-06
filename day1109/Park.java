package day1109;

public class Park extends Person {
	private int score;

	public Park() {
		score = 90;
	}

	public String did(String did, int hour) {
		String result = null;
		if (did.equals("공부")) {
			for (int i = hour; i > 0; i--) {
				score += 2;
				if (score > 100) {
					score = 100;
				}
				result = "공부를 했습니다. (예상 점수 : " + score + ")";
			}
		} else {
			for (int i = hour; i > 0; i--) {
				score -= 4;
				if (score < 0) {
					score = 0;
				}
				result = "공부를 안했습니다. (예상 점수 : " + score + ")";
			}
		}
		return result;
	}

}