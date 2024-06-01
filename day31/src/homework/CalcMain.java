package homework;

public class CalcMain {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.start();
		
		try {
			c.join();//c 계산이 끝날 때까지 멈추는 상태
		}catch(InterruptedException e) {
			
		}
		System.out.println(c.getSum());
	}
	
}
