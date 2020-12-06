package day1109;

public class Array4Score {
	private final int JAVA_INDEX = 0;
	private final int ORACLE_INDEX = 1;
	private final int JSP_INDEX = 2;

	public Array4Score() {
		int[][][] groupScore = { { { 88, 87, 89 }, { 93, 77, 90 }, { 74, 70, 81 } }, { { 60, 69, 75 }, { 81, 83, 86 } },
				{ { 59, 55, 60 }, { 100, 99, 100 }, { 70, 79, 85 }, { 73, 82, 88 } } };
		String[][] name = { { "김은비", "김현규", "남혜진" }, { "도현학", "문혜원" }, { "민병권", "박권익", "박종휘", "박지원" } };
//		 행마다 열의 개수가 다른 배열 - 가변배열
		System.out.println("조의 수 : " + groupScore.length);
		for (int i = 0; i < groupScore.length; i++) {
			System.out.println((i + 1) + "조의 조원 수 : " + groupScore[i].length);
		}

		System.out.println("-------------------------------------------------------------------------------------");
		for (int i = 0; i < groupScore.length; i++) {
			System.out.println((i + 1) + "조 점수");
			System.out.printf("번호\t이름\tJava\tOracle\tJSP\t총점\n");
			for (int j = 0; j < groupScore[i].length; j++) {
				System.out.printf("%d번\t%s\t", j + 1, name[i][j]);
				for (int k = 0; k < groupScore[i][j].length; k++) {
					System.out.printf("%d\t", groupScore[i][j][k]);
				}
				System.out.printf("%d\n", studentTotalScore(groupScore[i][j]));
			}
			System.out
					.println("--------------------------------------------------------------------------------------");
			System.out.printf("Java 총점 [%d], Oracle 총점 [%d], JSP 총점 [%d], 전체 총점[%d], 전체 평균[%.2f]\n",
					subjectTotalScore(groupScore[i], JAVA_INDEX), subjectTotalScore(groupScore[i], ORACLE_INDEX),
					subjectTotalScore(groupScore[i], JSP_INDEX), groupSumScore(groupScore[i]), groupAvg(groupScore[i]));
			System.out.printf("Java의 최고점수[%d]\n", subjectMaxScore(groupScore[i], JAVA_INDEX));
			System.out
					.println("--------------------------------------------------------------------------------------");
		} // for

	}// Array4Score

	public int studentTotalScore(int[] groupScore) { // 한 학생의 총합 점수
		int sum = 0;
		for (int i = 0; i < groupScore.length; i++) {
			sum += groupScore[i];
		}
		return sum;
	}

	public int subjectTotalScore(int[][] groupScore, int subjectIndex) { // 과목별 총합 점수
		int sum = 0;
		for (int i = 0; i < groupScore.length; i++) {
			sum += groupScore[i][subjectIndex];
		}
		return sum;

	}

	public int subjectMaxScore(int[][] groupScore, int subjectIndex) { // 과목 최고 점수
		int maxValue = 0;
		for (int i = 0; i < groupScore.length; i++) {
			if (groupScore[i][subjectIndex] > maxValue) {
				maxValue = groupScore[i][subjectIndex];
			}
		}
		return maxValue;
	}

	public int groupSumScore(int[][] groupScore) { // 조 점수 합계
		int sum = 0;
		for (int i = 0; i < groupScore.length; i++) {
			for (int j = 0; j < groupScore[i].length; j++) {
				sum += groupScore[i][j];
			}
		}
		return sum;

	}

	public int countStudent(int[][] groupScore) { // 학생 수
		int count = 0;
		for (int i = 0; i < groupScore.length; i++) {
			for (int j = 0; j < groupScore[i].length; j++) {
				count++;
			}
		}
		return count;
	}

	public double groupAvg(int[][] groupScore) { // 조 평균 점수
		double avg = 0.0;
		int count = countStudent(groupScore);
		int sum = groupSumScore(groupScore);
		avg = (double) sum / count;
		return avg;
	}

	public static void main(String[] args) {
		new Array4Score();
	}

}
