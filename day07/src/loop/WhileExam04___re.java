package loop;

public class WhileExam04___re {

	public static void main(String[] args) {//메인의 시작
		int x =1;
		int y = 0;
		int sum = 0;
		
//		x = (int)60-(5*y)*4;
//		y = (int)60-(4*x)/5;
//		sum = (4*x)+(5*y);
		
		
		while(x<=10 && y<=10) {//while의 시작
			x++;
//			x = 60-(5*y)*4;
			y = 60-(4*x)/5;
			
			System.out.println("( "+x+", "+y+")");
			
			if((4*x)+(5*y)==60) {//if의 시작
				
				break;
				
			}else{//if의 끝, else의 시작
				
				continue;
				
			}//else의 끝
			
		}//while의 끝
			System.out.println("( "+x+", "+y+")");

			
		}//for의 끝
		
//		while(x<=10) {
//
//			sum=((x*4)+(y*5));
//			System.out.println(x+", "+y);
//			
//			if(sum%60==0) {
//			
//			System.out.println("( "+x+", "+y+")");
//			
//			}
//			x++;
		
		
		}//메인의 끝




