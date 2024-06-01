package scanner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ScannerExam02 {

	public static void main(String[] args) {
		
		//#1. Scanner 객체 생성
		Scanner scan= new Scanner(System.in);
		
		//#2. 변수선언
		String name =""; //이름을 담을 변수
		int kor =0; //국어
		int eng =0; //영어
		int mat =0; //수학
		int sum =0; //세 과목 합계, 여기에 (kor+eng+mat)를 쓰면 0으로만 출력되므로 결과 0나옴
		double avg =0.0; //세 과목 평균
		
		
		//#3. 사용자에게 안내하는 문구
		System.out.print("이름 입력 >> ");
		name = scan.nextLine(); //scan이 가리키는 주소에 가서 문자열을 가져다
		                        //name이라는 변수에 담아줘
		
		System.out.print("국어 점수 입력 >> ");
		kor = scan.nextInt();
		
		System.out.print("영어 점수 입력 >> ");
		eng = scan.nextInt();
		
		System.out.print("수학 점수 입력 >> ");
		mat = scan.nextInt();
		
		sum=kor+eng+mat;
		avg=sum/3.;
//		avg=(double)sum/3;
//		avg=(kor+eng+mat)/3.;
				
		
//		System.out.println("** "+ name + " 의 성적");
		System.out.printf("** %s 의 성적 ** \n", name); //☆서식을 지정하는 문자, name
		                                                //처럼 콤마(,)를 쓰기로 함
//		System.out.println("이름 : " + name);
		System.out.printf("이름 : %s\n", name);
		
//		System.out.println("국어 : " + kor);
		System.out.printf("국어 : %d\n", kor);
		
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + sum);
		
//		System.out.println("평균 : " + avg);	
		System.out.printf("평균 : %.1f\n", avg);
		
		DecimalFormat f = new DecimalFormat("#, ##0.00");//패턴
											//앞에 0이 들어오면 생략, 소수점 첫째까지 표현
		                                    //##0.00 : 소수점 2자리까지 표현
		System.out.println(f.format(avg));

	}

}
