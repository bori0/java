package homework;

public class Exam2 {
	public static void main(String[] args) {
		
		int sum=0;
		aa: while(true) {
			for (int i = 1; i <=5; i++) {
				sum+=i;
				System.out.println("수: "+i+ "합 :"+sum);
			}//for
			break aa;
			
		}
		
		}//while
	}
