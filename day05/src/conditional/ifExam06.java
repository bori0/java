package conditional;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ifExam06 {

	public static void main(String[] args) {
		//스캔 객체 생성
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		int kor = 0;
		int eng = 0;
		int mat = 0;
		int sum = 0;
		double avg = 0;
		String result = "";
		
		System.out.println("이름 입력 >> ");
		name = scan.nextLine();
		
		System.out.println("국어 점수 입력 >> ");
		kor = scan.nextInt();
		
		System.out.println("영어 점수 입력 >> ");
		eng = scan.nextInt();
		
		System.out.println("수학 점수 입력 >> ");
		mat = scan.nextInt();
		
		sum = kor + eng + mat;
		avg = (double)sum /3;
		
		if(avg>=80) {
			result = "합격";
		}else {
			result ="불합격";
		}
		
		DecimalFormat f= new DecimalFormat("#,##0.00"); //문자로 인식
		
		
		//출력
		System.out.println("---------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t판정");
		System.out.println("---------------------------------------------------");
//		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+sum+"\t"+avg+"\t"+result);
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %s\t %s\n", name, kor, eng, mat, sum, f.format(avg), result);
		System.out.println("---------------------------------------------------");
		
		scan.close(); //scan 닫음		

	}

}
