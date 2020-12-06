package day1106;

public class Array3Score {

//	private int javaTotal, oracleTotal, jspTotal;
	private int topScore, topScoreNum;

	public static final int JAVA_INDEX = 0;
	public static final int ORACLE_INDEX = 1;
	public static final int JSP_INDEX = 2;

	public void processScore() {
		String[] name = { "장하권", "김건부", "허수", "장용준", "조건희", "이현우" };
		int[][] score = { { 91, 86, 93 }, { 83, 81, 88 }, { 77, 65, 100 }, { 67, 50, 89 }, { 97, 93, 99 },
				{ 78, 77, 88 } };
		int totalScore = 0;
		double avg = 0;

		System.out.println("번호\t이름\tJava\tOracle\tJSP\t총점\t평균\t최고점수");
		System.out.println("------------------------------------------------------------------------");

		for (int i = 0; i < score.length; i++) {
			totalScore = totalScore(score[i]);
			topScore(totalScore, i);
			avg = avg(totalScore, score[i].length);

			System.out.printf("%d\t%s\t", i + 1, name[i]);

			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
			}

//			javaTotalScore(score[i][JAVA_INDEX]);
//			oracleTotalScore(score[i][ORACLE_INDEX]);
//			jspTotalScore(score[i][JSP_INDEX]);
			System.out.printf("%d\t%.1f\t%d\n", totalScore, avg, personalTopScore(score[i]));
		}

		System.out.println("-------------------------------------------------------------------------");
		System.out.printf("응시인원 [ %d ]", name.length);
		System.out.printf("총점 Java SE [ %d ], Oracle [ %d ], JSP [ %d ]\n", subjectTotalScore(score, JAVA_INDEX),
				subjectTotalScore(score, ORACLE_INDEX), subjectTotalScore(score, JSP_INDEX));
		System.out.printf("전체 총점 [ %d ], 전체 평균 [ %.1f ]\n", allTotalScore(score), allAvg(score));
		System.out.printf("1등 학생 점수 : [ %d ], 1등 학생 번호 : [ %d ], 1등 학생의 이름 : [ %s ]\n", topScore, topScoreNum,
				name[topStudentNum()]);
		System.out.printf("Java 최고 점수 [%d], Oracle 최고 점수 [%d], JSP 최고 점수 [%d]", javaMaxValue(score, JAVA_INDEX),
				oracleMaxValue(score, ORACLE_INDEX), jspMaxValue(score, JSP_INDEX));
	}

	public int totalScore(int[] score) {
		int total = 0;
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		return total;
	}

	public double avg(int totalScore, int subjectCnt) {
		double resultAvg = 0.0;
		resultAvg = totalScore / (double) subjectCnt;
		return resultAvg;
	}

	public int subjectTotalScore(int[][] score, int index) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i][index];
		}
		return sum;
	}

	public int allTotalScore(int[][] score) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++)
				sum += score[i][j];
		}
		// sum = javaTotal + oracleTotal + jspTotal;

		return sum;
	}

	public double allAvg(int[][] score) {
		double avg = 0.0;
		int count = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				count++;
			}
		}
		avg = allTotalScore(score) / count;
		return avg;
	}

	public void topScore(int score, int num) {
		if (topScore < score) {
			topScore = score;
			topScoreNum = num + 1;
		}
	}

	public int topStudentNum() {
		return topScoreNum - 1;
	}

//	public void javaTotalScore(int score) {
//		javaTotal += score;
//	}
//
//	public void oracleTotalScore(int score) {
//		oracleTotal += score;
//	}
//
//	public void jspTotalScore(int score) {
//		jspTotal += score;
//	}

	public double allAvg(int allTotalScore, int cnt, int subjectCnt) {
		double result = 0.0;
		result = allTotalScore / (cnt * subjectCnt);
		return result;
	}

	public int javaMaxValue(int[][] score, int index) {
		int maxScore = score[0][index];
		for (int i = 0; i < score.length; i++) {
			if (score[i][index] > maxScore) {
				maxScore = score[i][index];
			}
		}
		return maxScore;
	}

	public int oracleMaxValue(int[][] score, int index) {
		int maxScore = score[0][index];
		for (int i = 0; i < score.length; i++) {
			if (score[i][index] > maxScore) {
				maxScore = score[i][index];
			}
		}
		return maxScore;
	}

	public int jspMaxValue(int[][] score, int index) {
		int maxScore = score[0][index];
		for (int i = 0; i < score.length; i++) {
			if (score[i][index] > maxScore) {
				maxScore = score[i][index];
			}
		}
		return maxScore;
	}

	/**
	 * @param score 학생의 점수를 가지고 있는 1차원 배열
	 * @return maxValue
	 */
	public int personalTopScore(int[] score) {
		int tempScore = score[0];
		for (int i = 1; i < score.length; i++) {
			if (tempScore < score[i]) {
				tempScore = score[i];
			}
		}
		return tempScore;
	}

	public static void main(String[] args) {
		Array3Score as = new Array3Score();
		as.processScore();
	}
}
