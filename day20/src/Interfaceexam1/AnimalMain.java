package Interfaceexam1;

import java.util.Iterator;

public class AnimalMain {

	public static void main(String[] args) {
//		Animal ani = new Animal("뽀삐", 3);//추상메소드를 가지고 있어서 만들 수 없다.
		Cat cat = new Cat("까망이",2);
		Dog dog = new Dog("대니얼",5);
		
		cat.showInfo();//부모(animal)
		dog.showInfo();//자식(재정의 했으니까)
		
		cat.cry();//자식이 완성했으니까, 부모는 미완성이라 객체생성불가라 못 가져옴
		dog.cry();//자식
		cat.name = "야옹이";
		
		Animal[] ani = {//내껀데 나는 부모가 될 수 있기 때문에 부모 타입에 묶일 수 있다.
						//다형성
				new Cat("까망이",2),
				new Dog("대니얼",5)
		};
		
//		ani[0].showInfo();
		
		
		for (int i = 0; i < ani.length; i++) {
			ani[i].showInfo();
			ani[i].cry();
			
			if(ani[i] instanceof Cat) {
				//자식 >> 부모, 부모 타입에 자식을 담아서 부모부분 사용할 수 있음
				//단, 재정의된 메소드 제외
				Cat cat1 = (Cat)ani[i];// 자식 >>부모 >> 자식, 자신의 타입으로 돌아옴
				//자식이 숨겨진 자신 객체의 자료를 사용하기 위해
				cat1.cry();
				cat1.showInfo();
			}
			if(ani[i] instanceof Dog dog1) {
				dog.cry();
				dog.showInfo();
			}//if끝
		}//for끝
		
		
		for(Animal array : ani) {
			array.showInfo();
			array.cry();
		}//for끝
	}

}
