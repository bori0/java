package operator1;

public class OperatorScoreExam02 {
	public static void main(String[] args) {
		String name="김자바";
		int javaScore=55;
		int softwareScore=30;
		String result="";
		
		result=(javaScore>=70 || softwareScore>=70)? "통과":"재수강";
		
		System.out.println(name+"의 결과 "+result);
		
		int a=3;
		
//		a=a+7;
//		System.out.println("a=a+7 =>"+a);
		
		a+=7;
		System.out.println("a+=7; =>" +a);//10
		
		a-=2; //a=a-2
		System.out.println("a-=2; =>" +a);//8
		
		a*=2;
		System.out.println("a*=2 =>" +a);//16
		
		a/=2;
		System.out.println("a/=2; =>" +a);//8

	}

}
