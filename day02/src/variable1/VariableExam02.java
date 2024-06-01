package variable1;

public class VariableExam02 {

	public static void main(String[] args) {
		String name="홍길동";
		int score = 70; //변수선언, 초기화
		
		System.out.println("이름 :" +name);
		System.out.println("점수 :" +score);
		System.out.println(); // 한줄 띄우기 위해 사용
		
		/*
		 * name = 80;
		 * score = 3.5;
		+에러 원인 : name은 문자열을 담는 변수로 선언되어 있음
		             score는 정수를 담는 변수로 선언되어 있음
		변수는 처음 선언한 자료형 (=타입, 형)만 저장할 수 있음
		*/  
		
		/*
		자바는 한번 선언된 이름으로 다시 변수명을 선언할 수 없음
		String name1 = "김자바";          +변수로 한번 쓴 이름은 반복해서 쓸 수 없다
		int score1 = 90;                  +뒤에 이름을 바꾸면 사용가능
	    double score = 5.3;
		*/
		
		name = "김자바";
		score = 90;
		
		/*
		String name1 = "김디비"; //쓰이는 곳이 없으면 삭제해야하지 않나 하고 경고줌
		int score1 = 90;
	    double score2 = 5.3;
	    */
	    
	    //★
	    System.out.println("score1 : " + 3 + 5);    //score1 : 35
	    System.out.println("score1 : " + (3 + 5));  //score1 : 8
	    System.out.println(3 + 5 + "score1");       //8score1
	    
	    


	}

}
