package bookExam;

public class KumhoTire343 extends Tire340{
	//필드
	//생성자
	public KumhoTire343(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {//다른 내용을 출력하기 위해 재정의한 roll()메소드
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"KumhoTire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+"KumhoTire 펑크 ***");
			return false;
		}
	}

}
