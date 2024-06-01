package bookExam;

public class Tire340 {
	//필드
	public int maxRotation;//최대회전수(타이어 수명), 최대 회전수에 도달하면 타이어 펑크
	public int accumulatedRotation;//누적 회전 수, 타이어가 1회전시 1씩 증가
	public String location;//타이어의 위치
	
	//생성자 - 타이어 위치와 최대 회전수 매개값
	public Tire340(String location, int maxRotation) {
		this.location = location;
		this.maxRotation= maxRotation;
	}
	
	//메소드
	//roll() : 타이어를 1회전 시키는 메소드 >>1회전시 1씩 증가
	public boolean roll() {
		++accumulatedRotation;//혼자이기 때문에 ++이 앞에 쓰든 뒤에 쓰든 상관없음
		if(accumulatedRotation<maxRotation) {//정상회전(누적<최대)일 경우 실행
			System.out.println(location+"Tire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {//펑크(누적=최대)일 경우 실행
			System.out.println("*** "+location+" Tire 펑크 ***");
			return false;
		}
	}
}
