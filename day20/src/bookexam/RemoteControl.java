package bookexam;

public interface RemoteControl {//역할만 설정되어있음, 미완성
	//상수
	public int MAX_VOLUME = 10;//public final static 이 생략
	public int MIN_VOLUME = 0;
	
	//인터페이스는 생성자를 사용할 수 없음
	
	//추상 메소드
	public void turnOn(); //{}가 없으므로 추상메소드, 즉 미완성 메소드 public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
