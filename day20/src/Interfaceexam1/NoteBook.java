package Interfaceexam1;

public class NoteBook implements Controllable{

	@Override
	public void turnOn() {
		System.out.println("노트북켬");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북끔");
	}

}
