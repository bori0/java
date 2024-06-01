package bookP247_;

public class p256 {
	int gas;
	
	void setGas(int gas) {
		this.gas= gas;
	}
	
	boolean isLeftGas() {
		if(gas ==0) {
			System.out.println("gas없음");
			return false;
		}
		System.out.println("가스 있음");
		return true;
	}
	
	void run() {
	while(true) {
		if(gas >0) {
			System.out.println("달림(gas 잔량 : " +gas +")");
			gas--;
		}else {
			System.out.println("멈춤(gas 잔량 : " +gas +")");
		}	
		}//end of while
	}//end of void

}//end of class
