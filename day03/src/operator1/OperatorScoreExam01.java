package operator1;

public class OperatorScoreExam01 {

	public static void main(String[] args) {
		
		//#1.변수선언
		String name="홍길동";
		int koreaScore=80;
		int englishScore=65;
		int mathScore=70;
		String result="";//통과, 탈락을 받을 변수라 문자열로 처리
		
		//#2.삼항 연산자를 이용하여 판단
		result=(koreaScore>=60 && englishScore>=60 && mathScore>=60)? "통과" : "탈락";
		
		//#3.결과를 출력
		System.out.println(name+"의 결과 "+ result);

	}

}
