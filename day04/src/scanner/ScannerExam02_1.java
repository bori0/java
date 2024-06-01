package scanner;

import java.util.Scanner;

public class ScannerExam02_1 {

	public static void main(String[] args) {
		//#1. Scanner 객체 생성
		Scanner scan= new Scanner(System.in);
		
		//#2. 변수선언
		String name =""; //이름을 담을 변수
		int kor, eng, mat=0;
//		sum =0;
//		double avg =0.0; //세 과목 평균
		
//		int sum=kor+eng+mat; //얘는 초기화 안 되서 오류뜸
//		double avg=sum/3.;	
		
		//#3. 사용자에게 안내하는 문구
		System.out.println("이름, 국어, 영어, 수학 점수 입력 >> ");
		name = scan.next();//탭, 공란, 엔터로 구분
		//next : 스페이스바 또는 엔터를 치면 각각 다른 걸로 인식
		
//		String name = scan.nextLine(); //가능, 코드길이가 짧을 때는 상관없는데
		                               //길어지게 되면 복잡해질 수 있다.
		                               //중간 블럭이 들어가야하면 쓸 경우도 있다.
		
		kor = Integer.parseInt(scan.next()); //문자열형의 숫자를 정수로 변환
		eng = Integer.parseInt(scan.next());
		mat = Integer.parseInt(scan.next());
		    //int
		int sci = Integer.parseInt(scan.next());
		
		System.out.println("sci : " + sci); //화면에 나오지 않았지만 sci값까지 성적을 적어줘야함
		                                    //안 적어주면 결과 안 나옴
		int sum=kor+eng+mat;
		double avg=sum/3.;	
//		float af = 3.5f;
//		long aa =35L;
		
		System.out.println("** "+ name + " 의 성적");
		System.out.println("이름\t 국어\t 영어\t 수학\t 합계\t 평균\n");
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %.2f\n", name, kor, eng, mat, sum, avg);

	}

}
