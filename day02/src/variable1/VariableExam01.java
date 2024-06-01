package variable1;

public class VariableExam01 {// 바로 밑에 sys out 불가
	public static void main(String[] args) { // mail()메소드 시작, body라 부름
		System.out.println(); // 메소드 안에서만 사용가능
		
		/*
		 * --------------------------
		 *  이름  국어  영어  수학
		 * -------------------------- 
		 * 홍길동  70    80	   90
		 * -------------------------- 
		 */
				 
		/*System.out.println("--------------------------");
		System.out.println(" 이름   국어  영어  수학");
		System.out.println("--------------------------");
		System.out.println("홍길동   70    80    90");
		System.out.println("--------------------------");*/
		
		/*System.out.println("--------------------------");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("--------------------------");
		System.out.println("홍길동\t70\t80\t90");
		System.out.println("--------------------------");*/
		
		/*System.out.println("이름 :" + "홍길동");
		System.out.println("국어 :" + "70");*/
		
		System.out.println();
		
		//타입(=자료형, 형) 변수명;
		//변수명 = 값;
		//타입 변수명 = 값;
		
		String name ="홍길동";//변수선언, 초기화
		//String 대문자로 쓴걸 보고 문자열로 취급하겠구나, class이구나
		int kor = 70; // 변수선언, 초기화
		//문자나 문자열은 따옴표가 붙지만 숫자는 붙지 않는다
		int eng = 90;
		int mat = 85;
		int sum = 0;
		
		sum = kor + eng + mat;
		
		System.out.println("이름 :"+ name);
		System.out.println("국어 :"+ kor);
		System.out.println("영어 :"+ eng);
		System.out.println("수학 :"+ mat);
		System.out.println("총점 :"+ sum); // +문자열 연결 연산자
		
		//System.out.println("총점 :"+ kor+eng+mat); 이렇게 적으면 점수가 나열만 됨
		
	} // main의 끝
} // class의 끝
