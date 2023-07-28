package Exceptionex.User;

public class ScoreTest {
	public static void main(String[] args) {
		// int score =89;
		int score =120;
		ScoreUtil t = new ScoreUtil();
		//try{
		score = t.calcScore(score);
		System.out.println("입력한 시험점수는 " + score + "입니다.");
	}

}
