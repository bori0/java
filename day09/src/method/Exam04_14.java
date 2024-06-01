package method;

import java.util.Scanner;

public class Exam04_14 {

	public static void main(String[] args) {
		//1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		
		//#1.Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//#2.변수 선언
		int com = 0;//컴퓨터 값을 담을 변수
		int user = 0;//사용자로부터 입력받은 값을 담을 변수
		int count = 0; //시도 횟수를 세서 담을 변수
		
		//#3. 컴퓨터가 생각하는 값 만들기(1~100)
		com = (int)(Math.random()*100)+1;
		//컴퓨터가 가지고 있는 값 확인 - 프로그램 확인 끝나면 주석 처리 또는 삭제
		System.out.println("com의 값 : "+com);
		
		do {
			count++; //게임 시작을 누적
			System.out.println();
			
			//#4.사용자로부터 값 입력받기
			System.out.print("1~100사이 정수값 중 하나를 입력 >> ");
			user = scan.nextInt();
			
			//#5.컴퓨터의 값과 사용자의 값을 비교하는 작업
			//컴 값 = 사용자 값,  컴 값 > 사용자 값, 컴 값 < 사용자 값
			//switch보다 if ~ else if ~ else 를 쓰는게 좋다
			if(com>user) {
				System.out.println("더 큰 수를 입력하세요");
			}else if(com == user) {
				System.out.println("정답입니다.");
				System.out.println(count+ "번 만에 맞춤");
				break; //맞추면 프로그램 종료
			}else {
				System.out.println("더 작은 수를 입력하세요");
			}//end of if
			
		}while(true); //다른건{ }가 있어서 끝을 알려줄 필요가 없지만
		//				{ }가 없기 때문에 ;로 끝을 알려줘야함
		//				정답을 맞추기 전까지는 계속 도돌이표
	}

}
