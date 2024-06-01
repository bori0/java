package bookexam;
//			자식클래스 implements 부모인터페이스명{}
public class Television implements RemoteControl{
	//			이건 	구현한다	이걸 받아서
	
	//필드
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override //위의 volume이 private라서 setter를 통해 바꿀 수 있음
	public void setVolume(int volume) {
		//		  public final static(상수)이면 Remote가 아니라
		//			그 밖(클래스)에 들어있는거기 때문에
		//		줄줄이 쓰기 귀찮 >> 클래스를 import를 해서 static붙여주면 됨
		if(volume>RemoteControl.MAX_VOLUME) {
			//최대값보다 크면 최대값으로 설정
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			//들어오는 값이 최소값보다 작으면 최소값으로 설정
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV 볼륨 : "+this.volume);
	}

}
