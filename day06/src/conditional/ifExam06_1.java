package conditional;

import java.util.Scanner;

public class ifExam06_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String jumin = "";
		char genderCheck = ' ';//공백과 - 모두 인식함
		String gender = "";
		
		System.out.print("주민번호를 입력\n [입력 예시 : 991212-1123123] >>");
		jumin = scan.nextLine();
//		eight = Integer.parseInt(scan.next());
		
		//주민번호에서 성별에 
		genderCheck =jumin.charAt(7); //주민번호의 8번째 자리 하나
		                              //인덱스는 0부터 시작하므로
		
		
		//switch형식으로 해볼 경우
		switch(genderCheck) {
		case '1' :
			gender ="남1";//모두 System.out.print();로 실행했고, break가 없다면 하나씩 다 실행됨
			break;        //결과만 적혀있다면 맨 마지막에 적혀있는 결과만 출력이 됨
		case '2' :
			gender ="여2";
			break;
		case '3' :
			gender ="남3";
			break;
		case '4' :
			gender ="여4";
			break;
		case '5' :
			gender ="남5";
			break;
		case '6' :
			gender ="여6";
			break;
		default :
			gender = "오류7";
			

//		case '1' :                 //이렇게 써도 됨
//		case '3' :
//		case '5' :
//			gender ="남";
//			break;
//		case '2' :
//		case '4' :
//		case '6' :
//			gender ="여6";
//			break;
			
			
		
		}//switch의 끝 //break를 만나면 중괄호 밖으로 나온다

		
		System.out.println(gender);
	}

}
