package polymorphism.animal;

public class AnimalMain {

	public static void main(String[] args) {
//		Animal ani=new Animal();
//		Cat cat = new Cat("김야옹", 3);
//		Dog dog = new Dog("박멍멍", 2);
//		Bird bird = new Bird("최짹짹", 4);
//		
//		ani.cry();
//		cat.cry();
//		dog.cry();
//		bird.cry();
//		System.out.println();

		//배열은 같은 타입의 자료를 저장하는 공간
		Animal[] aniArry= {
				new Animal(),
				new Cat("김야옹", 3),
				new Dog("박멍멍", 2),
				new Bird("최짹짹", 4)
		};//end of aniArry
		
		//출력하기
		for(int a=0; a<aniArry.length; a++) {
			aniArry[a].cry();
		}
		
		//향상된 for문을 이용해서 출력
//		for(넘겨받을_자료타입 넘겨받은_자료를_담을_변수 : 자료를 넘겨줄 배열 또는 컬렉션){
//			실행문
//		}
		for(Animal ani : aniArry) {
			ani.cry();
		}
	}//end of main

}
