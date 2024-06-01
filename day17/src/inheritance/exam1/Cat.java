package inheritance.exam1;

//		자식클래스 extends 부모클래스명{}
public class Cat extends Animal{
//	public Cat() {//생략되어 있지만 안 써놔도 적용시켜 부모쪽 생성자로 가서 초기화됨
//		super();	
//	}
	
	public void jump() {
		System.out.println("고양이가 높이 뛴다.");
	}
}
