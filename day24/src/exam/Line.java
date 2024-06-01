package exam;
//선의 종류 : 수평선, 수직선이 있음
//			하나보다 둘로 처리하는 것이 좋음
//			기능이 다르다면 분할하는 것이 좋음

//라인-부모, 수평선/수직선- 자식
//부모의 추상메소드를 자식이 완성하지 않으면 자식도 추상클래스가 된다.
public abstract class Line extends Shape{
	//수평선과 수직선의 공통점(선의 길이) 을 부모인 Line에 잡기
	
	private int length;
	
	//static { }	//static 블록 //초기화, 미리 처리 //얘를 먼저 봐줌
	 
	public Line(String name, int length) {//name, length 는 자식들로부터 넘겨 받음
		super(name);
		this.length = length;
		
		//초기화하면서 조건을 넣어줘도 괜찮다.
		//선의 길이 : 0 >>길이 없음 // 선의 길이 >=1 >> 그리기
//		public void setLength(int length) {
//			if(length >0) {
//				this.length = length;
//			}else {
//				System.out.println("길이는 0보다 큰 값을 입력해야 합니다.");
//				this.length = 0;
//			}
//		}
	}

	//선의 길이를 외부에서 부르려면
	public int getLength() {
		return length;
	}
	
	

	
//	@Override   //자식인 Line에서 완성하지 않고 그 자식인 수평선/수직선에서 완성하도록 하려고 함
//	따라서 Line도 부모의 추상메소드를 가지게 되므로 추상클래스됨
//	수평선과 수직선은 그리는 방식이 다르기 때문에 상속받아 각자 완성하도록 함
//	public void draw() {}
	
	
}//end of class
