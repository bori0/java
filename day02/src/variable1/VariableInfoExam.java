package variable1;

public class VariableInfoExam {

	public static void main(String[] args) {
		//#1.변수선언
		//타입 변수명 = 초기값;
		String name="";// ""로 초기화, 빈문자열
		int excel=0;
		int java=0;
		int python=0;
		int total =0;
		double avg=0.0; //실수이기 때문에 0.0
		//int excel=76, java=98, python=50,	total =0;
		
		//#2.변수값의 대입
		name="김중앙";
		excel=76;
		java=98;
		python=50;
		
		total=excel+java+python;
		avg=(excel+java+python)/3.0; 
		/*
		 * avg()/3=74.0이 나오는 이유
		 * 자바는 정수/정수를 하면 결과가 정수가 됨
		 * 3. 또는 3.0 으로 치면 실수로 바뀜
		 * 정수/실수 => 실수
		 */
		
		//#3.출력
		System.out.println("-------------------------------------------------------");
		System.out.println("이름\t엑셀\t자바\t파이썬\t총점\t평균");
		System.out.println("-------------------------------------------------------");
		System.out.println(name+"\t"+excel+"\t"+java+"\t"+python+"\t"+total+"\t"+avg);
		System.out.println("-------------------------------------------------------");

	}

}
