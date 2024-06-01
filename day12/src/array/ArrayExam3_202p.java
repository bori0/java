package array;

import java.util.Scanner;

public class ArrayExam3_202p {

	public static void main(String[] args) {
		// #1.scanner 객체 생성 - 입력받기 위해
		//참조타입(설계도, 붕어빵 틀) 참조변수(주소) = 생성자(붕어빵)(매개값(=인자, 붕어빵 속)) 
		Scanner scan = new Scanner(System.in);
		
		//#2.변수 선언
		int studentCount = 0;//학생 수
		int[] scores = null;//배열은 한 번 크기를 설정하면 변경할 수 없다.
							//null: 아직 참조하는 곳이 없다. 힙영역을 참고 있지 않다.
							//new int [0];은 힙에 0으로 저장되어 공간이 없는 것
		boolean run = true; //while문의 진행 여부를 설정하기 위해 사용
							//값이 true이므로 일단 반복을 진행
							//true : 반복 , false : 반복종료
		
		//#3.while문을 실행해서 학생수, 점수입력, 점수리스트, 분석등을 진행
		 while(run) {
			 //#3-1. 메세지가 반복이므로 메세지부터 설정
				System.out.println("=======================================================");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("=======================================================");
				System.out.print("번호 선택 >> ");
				int selectNo = scan.nextInt();
				
//				switch(selectNo) { case 1: 실행; break;....}
				if(selectNo==1) {//1.학생 수
					System.out.print("학생 수 입력 >> ");
					studentCount = scan.nextInt();
					System.out.println();
				}else if(selectNo==2) {//2.점수입력
					//학생 수 만큼의 배열 공간을 만들어주기
					//위에서는 null 아직 연결을 안 한 상태이므로 여기에서 공간을 확보 필요
					scores = new int[studentCount];//점수를 담을 배열공간 생성
					
					//배열 공간에 점수 입력받고 담기 : 학생 수가 유동적이라 반복문 사용
					for(int a=0; a<scores.length; a++) {
						//안내문구
						System.out.print((a+1)+"번 학생 점수 입력 >>");
						scores[a]=scan.nextInt();//입력받은 점수 배열에 담기
					}//end of for
				}else if(selectNo==3) {//3.점수 리스트
					for(int a=0; a<scores.length; a++) {
						//안내문구
						System.out.println((a+1)+"번 학생 점수 입력 = " +scores[a]);
//						scores[a]=scan.nextInt();//입력받은 점수 배열에 담기
					}//end of for
				}else if(selectNo==4) {
					int sum=0;//합계
					int max=scores[0];//최고점수를 초기화
					int min=scores[0];//최저점수를 초기화
					double avg = 0.0;//평균
					
					//최대값, 최소값, 합계
					for(int a=0; a<scores.length; a++) {
						//최대값
						if(max<scores[a]) { //max에 담긴 값이 a번째 요소보다 작으면
							max = scores[a];//max에 더 큰 a번째 요소 값 담기
						}//end of if
						
						//최소값
						if(min>scores[a]) { //min에 담긴 값이 a번째 요소보다 크면
							min = scores[a];//min에 더 큰 a번째 요소 값 담기
						}//end of if
						
						//합계 : 평균을 구하기 위해 필요
						sum += scores[a]; //점수 누락해서 합계구하기
												
					}//end of for
					
					//평균
//					avg = (double)sum/scores.length;
					avg = (double)sum/studentCount;
					
					System.out.println("최고 점수 : "+max);
					System.out.println("최저 점수 : "+min);
					System.out.println("합계 : "+sum);
					System.out.printf("평균 : %.2f\n", avg);//소수 이하 둘째자리까지 
					
				}else if(selectNo==5) {
					//종료해야함
					run = false;
				}
				
		 }//end of while
			System.out.println("프로그램 종료");
	}//end of main

}//end of class
