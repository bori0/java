package Interfaceexam1;

public class Computer implements Controllable{

	@Override
	public void turnOn() {
		System.out.println("컴퓨터 켬");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터 끔");
	}
	
	@Override
	public void repair() {
		System.out.println("메모리 부품에 이상이 있음");
		System.out.println("수리 필요! 공장에 보내주세요");
	}
}
