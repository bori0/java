package homework;

public class Exam1 {

	public static void main(String[] args) {
		int score=75;
		String result ="";
		
		if(score>=80) {
			result = "통과";
		}else {
			result = "재수강";
		}
		System.out.println(result);
		
		result = (score>=80)? "통과":"재수강";
		System.out.println(result);
		
	}


}
