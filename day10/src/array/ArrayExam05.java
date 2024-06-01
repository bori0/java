package array;

import java.util.Scanner;

public class ArrayExam05 {

	public static void main(String[] args) {
		//#1. Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//#2. 변수선언
		int studentCount = 0;//학생 수
		int[] studentNum; //학생 수 만큼 배열을 선언하겠다
		
		//#3.안내문구
		System.out.println("학생 수 입력 >>");
		studentCount = scan.nextInt();
		
		//학생 수를 입력받은 값으로 배열 공간을 확보
		studentNum = new int[studentCount];//초기화시킴, 값을 선언 안 했기 때문에 0으로 담겨 있음
		
		//#4. 배열공간에 값을 담기
		for(int i=0; i<studentNum.length; i++) {
			studentNum[i] = i+1;
			System.out.println("학생 번호: "+studentNum[i]);
		}
		
		}
		

	}
