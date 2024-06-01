package bookExam;

public class HankookTire342 extends Tire340 {
	//필드
	//생성자
	public HankookTire342(String location, int maxRotation) {
		super(location, maxRotation);//부모 Tire 객체를 호출, 매개값을 가져감
	}
	
	//메소드
	@Override
	public boolean roll() {//다른 내용을 출력하기 위해 재정의한 roll()메소드 의 리턴타입 : boolean
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"HankookTire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" HankookTire 펑크 ***");
			return false;
		}
	}
}
