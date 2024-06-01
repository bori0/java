package loop;

public class WhileExam06 {

	public static void main(String[] args) {
		
//		int a = (int)(Math.random()*6)+1;
//		int b = (int)(Math.random()*6)+1;
		
//		System.out.println("("+a+", "+b+")");
		
//		while(a+b==5) {
//			System.out.println("("+a+", "+b+")");
//			break;
//		}
		
		
//		if(a+b==5) {
//				System.out.println("("+a+", "+b+")");
//			
//		}else {
//			System.out.println("다른거");
//		}
		
		int a=1;
		int b=2;
		
		while(true) {//while의 시작
			
			a = (int)(Math.random()*6)+1;
			b = (int)(Math.random()*6)+1;
			
			if(a+b ==5){//if 의 시작
				break;
				
			}else { //if의 끝, else의 시작
				continue;
				
			} //else 의 끝
			
		}// while의 끝
		System.out.println("("+a+", "+b+")");
		System.out.println("끝");
	}

}
