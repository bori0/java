package bookexam;

public class RemoteControlExam {

	public static void main(String[] args) {
		RemoteControl rc;
		rc=new Television();
		rc=new Audio();
		
		rc.turnOn();//텔레비전부터 구현되고 나서 오디오가 구현되기 때문에 오디오 결과만 출력됨
		
		System.out.println("========");
		// 둘 다 쓰고 싶은 경우 하나씩 부여해야함
		rc=new Television();
		rc.turnOn();
		
		rc=new Audio();
		rc.turnOn();
		
		System.out.println("========");
		//배열방식으로 
		RemoteControl[] rc1= {
				new Television(),
				new Audio()
		};
		for(RemoteControl r: rc1) {
			r.turnOn();
			
			//자식 >>부모 >>자식
			if(r instanceof Television tv) {
				tv.turnOn();
			}
			//자식 >>부모 >>자식
			if(r instanceof Audio) {
				Audio audio = (Audio)r;
				audio.turnOn();
			}
		}
		

	}

}
