package abstract1;

public class AnimalChildMain {

	public static void main(String[] args) {
				
		Dog dog = new Dog();
		Animal anim = new Dog();//자식은 부모타입에 대입가능(부모타입 될 수 있다)

//		Animal ani= new Animal(); //자식 객체가 올려주지 않았기 때문에 불가
								 //컴파일 에러 - 미완성 클래스이기 때문에
//		Cat cat = new Cat("멍멍쓰"); //	   	   - 추상클래스(=미완성클래스)
		
		CatChild catChild = new CatChild("이괄괄");
		
		Animal aniChild = new CatChild("안댕댕");
		Cat cat = new CatChild("바둑이");
		
		if(aniChild instanceof CatChild) {
			//부모타입을 자식타입으로 변환 : 자식 >> 부모 >> 자식
			CatChild ch = (CatChild)aniChild;
			System.out.println("CatChild로 타입변환 완료");//실행문
		}
		
		//타입변환 - jdk12버전부터
		if(aniChild instanceof CatChild catCh) {
			System.out.println("CatChild로 타입변환 완료");//형변환 따로 적지 않고 바로 실행
		}
		
		if(cat instanceof CatChild) {
			CatChild catChid = (CatChild)cat;
			System.out.println("Cat타입을 CatChild 타입으로 변환 완료");
		}
		
		Animal[] aniArr = {
				new Dog(),
				new CatChild("캣초딩"),
//				new Bird(),
//				new Cow()//여러개 쓰기 가능가능
		};
	}//end of main

}//end of class
