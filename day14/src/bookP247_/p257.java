package bookP247_;

public class p257 {

	public static void main(String[] args) {
		p256 p = new p256();
		
		p.setGas(5);
		
		boolean gasState = p.isLeftGas();
		if(gasState) {
			System.out.println("출발");
			p.run();
		}
		if(p.isLeftGas()) {
			System.out.println("gas주입필요없음");
		}else {
			System.out.println("가스주입필요");
		}

	}

}
