package homework;

import java.util.Scanner;

public class Exam8 {
	//int test;//필드, 인스턴스 필드-객체가 생성되어야 쓸 수 있기 때문
				//메모리에 올라와 있지 않아서 쓸 수 없음
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // System.in.read();

		while(true) {
			//변수 선언
			int num =0;// 지역변수
			
			//자기 자신을 호출하면 show를 부를 수 잇다.
			Exam8 ex = new Exam8();
			ex.show();
			
//			test=7; //못 부름
//			ex.test=4;// 부를 수 있긴 함
			
			System.out.println("그릴 도형 선택 >>");
			System.out.println("-------------------------------------------------");
			System.out.println("1.점 | 2.수평선 | 3.수직선 | 4.사각형 | 0.종료");
			System.out.println("-------------------------------------------------");
			System.out.println("번호 선택 >>");
			num=Integer.parseInt(scan.nextLine());
				//wrapper class.메소드(매개값)
						//static
			if(num==0) {
				System.out.println("0번 선택, 종료합니다.");
//				break;//while문 종료
				System.exit(0);//시스템 종료
				return;//호출한 곳으로 빠져 나가는
			}//if끝
			
//			if(num<0 || num>4) {
//				System.out.println(num+"없는 번호 입니다.");
//				continue;
//			}
			if(!(num>=1 && num<=4)) {
				System.out.println(num+"없는 번호 입니다.");
				continue;// while문 일 때 조건문, for문이면 증감문으로 감
			}
			
			switch(num) {
			case 1:
				System.out.println(num+"번 점 그리기 선택하셨습니다.");
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
//			default ://default로 들어가는 것 보다 위에 if 처럼 쓰는게 더 정확해서 선호
//				System.out.println(num+"없는 번호 입니다.");
//				break;
			}//end of switch
			
			System.out.println("--------------");
			System.out.println("1.진행 | 0.멈춤");
			System.out.println("--------------");
			System.out.println("번호 선택 >>");
			int selectNum = Integer.parseInt(scan.nextLine());
			
			if(selectNum==1){
				continue;// 진행이니까 위로 다시
						//여기가 마지막이라 괄호만나면 continue 안 써도 돌아감
						//밑에 글이 있거나 할 때 안 거치고 다시 돌아가고 싶을 경우
			}else if(selectNum==0) {
				System.exit(0);//시스템 종료
			}//if 종료
		}//end of while
	}//end of main
	
	public void show() {//static이 없어서 못 부름, Exam8의 클래스꺼임
		System.out.println();
	}
}
