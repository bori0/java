package inheritance.exam1;

public class AnimalMainExam {

	public static void main(String[] args) {
		//#1.객체 생성
		Animal ani = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Bird bird = new Bird();
		
		//#2.객체를 이용
		ani.name = "동물들";
		ani.age = 5;
		ani.cry();
		System.out.println("---------------------------");
		
		cat.name = "김고양";
		cat.age = 3;
		cat.cry();
		System.out.println("---------------------------");
		
		dog.name = "이강아";
		dog.age = 6;
		dog.cry();
		System.out.println("---------------------------");	
		
		bird.name = "남궁새";
		bird.age = 4;
		bird.cry();
		System.out.println("---------------------------");
	}

}
