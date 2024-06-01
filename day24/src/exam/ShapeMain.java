package exam;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		//몇개의 도형을 그리고 싶은가?		//그리려는 도형을 선택 >> 선의 길이
		//선택한 수만큼 그리기
		//선택한 도형에 해당하는 객체 생성
		
		//#1.Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//#2.지역 변수 선언(메소드 없으면 필드라고 함)
		int num = 0; //그림을 그릴 도형의 개수
		Shape[] p = null;//입력받은 도형 객체를 저장할 배열
		//		몇개의 도형을 그릴 것인지 묻고 그 수만큼 공간을 확보
		
		//#3.그릴 도형의 개수 입력받기
		System.out.print("그리고 싶은 도형의 개수 입력>>");
		num=scan.nextInt();
		
		//#4.입력받은 수만큼의 도형을 저장할 공간 설정
		p=new Shape[num];//자식 >>부모
		// = Shape[] p =new Shape[num]; //Point point = new Point();
		
		for (int i = 0; i < p.length; i++) {
			//#5.그리려는 도형을 선택하기
			int selectType= 0;
			
			do {//조건의 참거짓과 관계없이 반드시 한 번은 실행 // do~while을 쓰거나 while 바로 밑에 if을 써서 돌림
				System.out.println("---------------------------------------");
				System.out.println("("+(i+1)+") 그리려는 도형 선택");
				System.out.println("1.점 | 2.수평선 | 3.수직선 | 4.사각형");
				System.out.println("---------------------------------------");
				System.out.print("번호 선택 >>");
				selectType = scan.nextInt();
				
			}while(selectType<1 || selectType>4);
				// !(selectType>=1 && selectType<=4);
			
			//#5.도형을 배열에 저장
			switch(selectType) {
			case 1:
				p[i] = new Point("점");
				break;
			case 2:
			case 3:
				System.out.print("선의 길이 입력 >>");
				int len = scan.nextInt();
				
				//삼항연산사 사용해서 수평선, 수직선인지 구분
				p[i] = (selectType==2)? new HorizonLine("수평선", len):new VerticalLine("수직선", len);
				break;
			case 4:
				System.out.print("사각형의 가로 길이 입력 >>");
				int width = scan.nextInt();
				System.out.print("사각형의 세로 길이 입력 >>");
				int heigth = scan.nextInt();
				
				p[i] = new Rectangle("사각형", width, heigth);
				break;
			}//end of switch
		}//end of for
		System.out.println("--------------------------------------");
		
		//도형그리기
		for(Shape s: p) {
			s.printDraw();
		}
		scan.close();//스캐너 리소스(자원, 우리가 cpr을 통해서 프로그램을 돌리는) 닫기
	}//end of main

}//end of class
