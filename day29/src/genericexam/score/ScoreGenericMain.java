package genericexam.score;

public class ScoreGenericMain {
	//Generic 메소드를 이용
	//[접근제한자]<타입>반환타입 메소드명(매개변수,,,){}
	//						compareTo를 쓰기 위해 부모타입을 제한
	//Comparable은 EnglishScore와 MathScore구현하고 있음
									//<T>가 없어도 됨
				//T로 받을 수 있는 타입을 제한해주는 컴파일이 검토해주는 
				//부모타입을 구현한 타입이든 상속받은 타입이든
	public static <T extends Comparable<T>> T findBest(T[] score) {
		T max = score[0];
		
		for (int i = 0; i < score.length; i++) {
			if(max.compareTo(score[i])<0) {
				max=score[i];
			}//end of if
		}//end of for
		return max;
	}
	
	public static void main(String[] args) {
		EnglishScore[] engArr = {
				new EnglishScore("홍길동", 70),
				new EnglishScore("우영우", 45),
				new EnglishScore("최수연", 64),
				new EnglishScore("이준호", 43),
				new EnglishScore("김자바", 64)
		};
		MathScore[] mathArr = {
				new MathScore("홍길동", 50),
				new MathScore("우영우", 89),
				new MathScore("최수연", 69),
				new MathScore("이준호", 76),
				new MathScore("김자바", 73)
		};
		
		System.out.println("영어 최고 점수 : "+findBest(engArr));
		System.out.println("수학 최고 점수 : "+findBest(mathArr));
		
	}

}
