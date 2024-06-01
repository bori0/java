package exam1;

public class Bus extends Vehicle{
	//필드
	int busNum;
	int sonomCount;
	
	public Bus(String name, int count, int busNum, int sonomCount) {
		super(name, count);//차종, 차 대수
		this.busNum=busNum;//버스번호
		this.sonomCount=sonomCount;//손님 수
	}

	void run() {
		System.out.println(busNum+"번 버스가 승객 "+sonomCount+"명을 태우고 달립니다.");
		System.out.println(busNum+"번 버스는 서울지역에만 "+count+"대가 운행 중");
		System.out.println("=============");
	}
			
}
