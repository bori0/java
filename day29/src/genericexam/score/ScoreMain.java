package genericexam.score;

public class ScoreMain {
//#1.최고 점수를 찾는 메소드 - findBest(EnglishScore[] es) - 일반 메소드로 작성
	public static EnglishScore findBest(EnglishScore[] engArr) {
				//반환타입 = return할 타입
		//#1) max를 찾기 위해, 배열의 처음 요소의 값을 max에 담기
		EnglishScore max = engArr[0];
		
		//#2)최고 점수 찾기
		for (int i = 0; i < engArr.length; i++) {
			if(max.compareTo(engArr[i])<0) {
				//음수가 나온다는 것은 비교값이 max가 더 작다는 것
				//max에 매개값을 담기
				max=engArr[i];
			}//end of if
		}//end of for

		return max; //최대값 가지고 있는 객체를 리턴하기
	}
	public static MathScore findBest1(MathScore[] mathArr) {
		MathScore max = mathArr[0];
		for (int i = 0; i < mathArr.length; i++) {
			if(max.compareTo(mathArr[i])<0) {
				max= mathArr[i];
			}
		}
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
		System.out.println("수학 최고 점수 : "+findBest1(mathArr));
		
		
	}//메인 끝

}
