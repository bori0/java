package loop;

public class WhileExam05 {

	public static void main(String[] args) {
		
//		int a = (int)(Math.random()*6)+1;
//		int b = (int)(Math.random()*6)+1;
//		int num =1;
//		
//		while(num<=5) {
//		System.out.println("("+a+", "+b+")");
//		
//		num++;
//		}
		
		for(int c=1; c<=5; c++) { //for의 시작
			while(true) { //while의 시작
				int a = (int)(Math.random()*6)+1;
				int b = (int)(Math.random()*6)+1;
			
				System.out.println(a+", "+b);
				break;			
			} //while의 끝
		}//for의 끝

	}

}
