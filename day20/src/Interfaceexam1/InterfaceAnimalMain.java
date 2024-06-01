package Interfaceexam1;

public class InterfaceAnimalMain {

	public static void main(String[] args) {
//		InterfaceAnimal iani - new InterfaceAnimal() {//객체 생성 불가, 미완성이라
		
		InterfacedCat cat = new InterfacedCat();
		InterfaceDog dog = new InterfaceDog();
		
		cat.cry();
		dog.cry();
		
		InterfaceAnimal[] iani = {//자식이 부모에 담긴다. //다형성
				new InterfacedCat(),
				new InterfaceDog()
		};
	}

}
