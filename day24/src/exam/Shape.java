package exam;

public abstract class Shape {
	private String name;//도형의 종류
	
	public Shape(String name) {
		this.name=name;
	}
	
	//어떤 도형을 그리는지 안내하는 문구//인스턴스 메소드
	private void showInfo() {//자식(외부)에서 부를 수 없음, 숨겨져 있(=캡슐화되어있음)
		System.out.println(name+"을 그립니다");
	}
	
	
	//자식에서는 마음대로 불러서 사용할 수 있되 재정의(오버라이딩)를 못하게 하기
	//		수정을 못하게 하고 싶은 경우
//	public final void ShowInfo() {
//		System.out.println(name+"을 그립니다");
//	}
	
	
	//그리기 작업 - 각 도형마다 알아서 그리도록 설정, 추상 메소드
	public abstract void draw();//{중괄호,body}가 없는 것, 미완성 메소드
	
	//도형을 그리는 작업이 없음, 무엇을 그리는지 알려주면서 그리는걸 한꺼번에 하고 싶음
	public void printDraw() {
		showInfo();//private라 같은 클래스에서는 자유롭게 호출, 외부에서는 호출 못 하기 때문에 여기서 호출
		draw();//추상메소드를 부르게 되면 자식메소드에서 재정의한 것이 호출됨
	};
}
