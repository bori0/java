package abstract1;

public abstract class Animal {
	//#1.필드
	int count;
	
	//#2.생성자
	public Animal() {}
	public Animal(int count) {
		this.count=count;
	}
	
	//#3.일반 메소드
	public void intfo() {//완성 메소드
		System.out.println(count+"번 접속");
	}
	public void show() {} //완성 메소드 : 메소드에 {}있으면 완성
	
	//#4.추상메소드 - 미완성 메소드, 메소드의 바디가 없음
	//   public void cry(){} - 완성 메소드, {중괄호}가 있으면 내용이 없어도 완성
	//[접근제한자] abstract 리턴타입 메소드명(매개변수);
	
	public abstract void cry();//추상 메소드, 미완성 이라 힙에 객체를 만들 수 없음
	//클래스에도 미완성이라고 적어줘야 됨!아니면 ERROR! 미완성이 하나라도 있으면 힙에 올릴 수 없음
	//자식이 부모거 가져와서 완성시키면 됨 >> 재정의, 오버라이딩
	//★꼭 완성해야해서 >>강제성
	
}
