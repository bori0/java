package homework;

public class ScoreMain {
	public static <T extends Comparable> T findBest(T[] score) {
		T max = score[0];
		
		for (int i = 0; i < score.length; i++) {
			if(max.compareTo(score[i])<0) {
				max=score[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
	}

}
