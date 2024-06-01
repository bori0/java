package bookP247_;

public class p262 {
	int speed;
	
	int getSpeed() {
		return speed;
		
	}
	void keyTurnOn() {
		System.out.println("키 돌림");
	}
	
	void run() {
		for(int a=10; a<=50; a+=10) {
			speed =a;
			System.out.println("달림 (시속 : "+speed +"km/h)");
		}
	}

}
