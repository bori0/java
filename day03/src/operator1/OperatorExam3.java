package operator1;

public class OperatorExam3 {

	public static void main(String[] args) {
		
		//#1.변수 선언
		int num=756; //숫자
		int share=0; //숫자를 10으로 나눈 몫을 담을 변수
		int result=0; //최종 경과를 담을 변수
		
		//#2.계산 처리
		share=num/10;
		result=share*10;
		
		//#3.출력		
		System.out.println("숫자 : "+num);
		System.out.println("숫자/10 : "+share);
		System.out.println("최종 결과 : "+result);


	}

}
