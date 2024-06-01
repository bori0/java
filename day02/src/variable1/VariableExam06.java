package variable1;

public class VariableExam06 {

	public static void main(String[] args) {
		//#1.변수 선언
		int firstNum=5;
		int secondNum=7;
		int temp=0;

		//#2. 변경 전 내용 출력
		System.out.println("변경전 firstNum : " + firstNum + " secondNum : " + secondNum);
		
		temp=firstNum;
		firstNum=secondNum;
		secondNum=temp;
		
		System.out.println("변경 후 firstNum :" + firstNum + " secondNum : " + secondNum);

	}

}
