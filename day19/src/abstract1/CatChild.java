package abstract1;

public class CatChild extends Cat{
	String name = "홍길동";
	
//	public CatChild() {
//		super(this.name);//내 객체가 생성도 안 됬는데 부모꺼에 생성은 더더욱 안 됨
//						//자식은 부모 먼저 객체를 만들고 자신의 객체를 만든다.
//						//부모한테 내 객체의 name을 준 것이라
//	}
	
	public CatChild(String name) {
		super(name);//매개값(String 타입의 매개변수 하나)이 있는
					//부모 생성자(외부)에서 받아서 줘야 문제 x
		
	}

	@Override
	public void cry() {
		System.out.println("손자에서 재정의");//cat과 animal의 메모리를 올려줌
		
	}

}
