package exam1;

public class AnimalMain {

	public static void main(String[] args) {
		Animal ani = new Animal("코코",3);
		ani.cry();
		System.out.println("---------");
		
		Dog dog = new Dog("멈머미",5);
		dog.cry();
		dog.name="삽살시";
		dog.run();
		System.out.println("---------");
		
		Cat cat = new Cat("조령이",4);
		cat.cry();
		cat.dive();
		System.out.println("---------");
		
		Bird bird = new Bird("찌그지장지지지지",2);
		bird.cry();
		bird.fly();
		
//		Animal ani = {
//				new Cat("고먐미", 1),
//				new Dog("핑크퐁", 7),
//				new Bird("벌벌", 3)
//		};
		
//		for(Animal a: ani) {
//			a.cry();
//		}
		
//		for (int i = 0; i < ani.length; i++) {
//			ani[i].cry();
//			ani[i].run();
//			if(ani[i] instanceof Cat cat) {
//				cat.cry();
//			}//end of if
//		}//end of for

	}//end of main

}
