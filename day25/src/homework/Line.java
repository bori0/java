package homework;

public abstract class Line extends Shape{
	private int length;

	public Line(String name, int length) {//자식한테 길이 넘겨받기
		super(name);
		this.length = length;
	}
	
	//선의 길이 : 0 >>그릴게 없음 // 선의 길이 >=1 >> 그리기
	public void setLength(int length) {//set : 자식에게서 길이 넘겨받기
		if(length >0) {
			this.length = length;
		}else {
			System.out.println("길이는 0보다 큰 값을 입력해야 합니다.");
			this.length = 0;
		}
	}

	public int getLength() {//자식에게 선의 길이 주기
		return length;
	}
	
	

}
