package abstract1;

public class AnimalMain {

	public static void main(String[] args) {
		//컴파일 에러 - 추상메소드(미완성 메소드)를 포함한 추상클래스라 객체 생성이 불가
//		Animal ani = new Animal(); //추상클래스라서 객체생성불가
//		Cat cat = new Cat(); //추상클래스라서 객체생성불가
				
		Dog dog = new Dog();
		Animal anim = new Dog();//자식은 부모타입에 대입가능(부모타입 될 수 있다)
		dog.cry();
		dog.count = 30;
		
		System.out.println(dog.count);
		anim.count = 70;
		System.out.println(anim.count);
		anim.cry();
	}

}
