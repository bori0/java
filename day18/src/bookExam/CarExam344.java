package bookExam;

public class CarExam344 {
//		   ______class안에 들어가 있기 때문에 객체를 생성하지 않아도 됨
	public static void main(String[] args) {
		//Car객체 생성
		Car341 car = new Car341();
		
		//Car 객체의 run()메소드 5번 반복실행
		for(int a=1; a<=5; a++) {
			int problemLocation = car.run();
		
			//
			switch(problemLocation) {
			case 1://앞왼쪽 타이어가 펑크났을 때 한국 타이어로 교체
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire=new HankookTire342("앞왼쪽", 15);//(문제위치, 최대 회전 수)
				break;
			case 2://앞오른쪽 타이어가 펑크났을 때 한국 타이어로 교체
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire=new HankookTire342("앞오른쪽", 13);
				break;
			case 3://뒤 왼쪽 타이어가 펑크났을 때 한국 타이어로 교체
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire=new HankookTire342("뒤왼쪽", 14);
				break;
			case 4://뒤 오른쪽 타이어가 펑크났을 때 한국 타이어로 교체
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire=new HankookTire342("뒤오른쪽", 17);
				break;
			}//end of switch
			
		//1회전시 출력되는 내용을 구분
		System.out.println("-------------------------------------");
		}//end of for

	}

}
