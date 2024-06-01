package variable2;

public class VariableScoreFormat {

	public static void main(String[] args) {
		//#1.변수 선언, 변수 초기화
		//타입 변수명 = 초기값;
		String name ="홍길동";
		int kor=83; //국어점수
		int eng=70; //영어점수
		int mat=92; //수학점수
		int sum= kor+eng+mat; //세 과목의 합계
		double avg =(kor+eng+mat) / 3.; //세 과목의 평균
		//double avg = sum / 3.;
		//double avg = (double)sum / 3;
		//              강제 형변환
		
		//java에서 정수/정수 => 결과가 정수
		//         정수/실수 =>        실수
		//         실수/정수 =>        실수
		//         실수/실수 =>        실수
				
//		System.out.println("합계 : " + sum); //245
//		System.out.println("평균 : " + avg); //81.0
		
		System.out.println("** "+name+"의 중간고사 성적 **");
		System.out.println("1.정수 자리 지정");
		System.out.println("-----------------------------------------------");
//		                  "출력서식"                    "출력할 값"
		System.out.printf("%5s %4s %4s %4s %5s %5s\n", "이름","국어","영어","수학","합계","평균");
		System.out.println("-----------------------------------------------");
		System.out.printf("%5s %4d %6d %6d %8d %8.2f\n", name, kor, eng, mat, sum, avg);
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		System.out.println("2.정수 자리 미지정, \t사용");
		System.out.println("-----------------------------------------------");
		System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t\n", "이름","국어","영어","수학","합계","평균");
		System.out.println("-----------------------------------------------");
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %.2f\t\n", name, kor, eng, mat, sum, avg);
		System.out.println("-----------------------------------------------");

	}

}
