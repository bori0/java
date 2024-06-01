package exam1;

import exam1.ShapeInter;

public class PointInter implements ShapeInter{
	String name="";

	public PointInter(String name) {
		this.name=name;
	}
	
	@Override
	public void draw() {
		System.out.println(".");
	}

	@Override
	public void showInfo() {
		System.out.println(name+"을 그립니다.");
	}

}
