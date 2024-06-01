package inheritance.exam2;

public class AnimalMainExam2 {

	public static void main(String[] args) {
		//#1.객체 생성//배열을 묶을 수 있음
//		Animal ani = new Animal();
//		Cat cat = new Cat("김야옹", 3, "생선");
//		Dog dog = new Dog("복실이");
//		Bird bird = new Bird();
//		
//		//#2.객체를 이용
//		
//		ani.cry();
//		cat.cry();
//		dog.cry();
//		bird.cry();
//		System.out.println("dog age : " + dog.age);
		
		Animal[] animal = {//자식타입은 부모타입에 담을 수 있다.
			new Animal("매실이"),
			new Cat("김야옹", 3, "생선"),
			new Dog("복실이"),
			new Bird()
		};
		for(int a=0; a<animal.length; a++) {
			animal[a].cry();
		}
	}

}
