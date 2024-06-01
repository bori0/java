package bookexam.inheritance;

import java.text.DecimalFormat;

public class Item {
	//#1.필드 - 외부에 노출하지 않으려 함
	private String name;
	private int price;
	
	//#2.생성자
	//생성자를 통해 가격과 이름을 초기화시키기
	//상속을 시킬 부모이기에 자식에서 생성자를 호출하면서 name, price넘겨 받을 수 있도록 처리
	//자식 - super(name, price);
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	//#3.메소드 - private로 설정된 필드의 값을 읽어 외부에 전달, getter
	//					 은 자신의 클래스 내에서만 사용, 외부로 못 부름
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	DecimalFormat d= new DecimalFormat("#,###원");
	//#4.출력용 메소드 - 전체가 아닌 부모인 item이 가진 필드만 출력할 수 있는 프린트 메소드
	public void print() {
		System.out.println("이름 : "+this.name);//this. 지역변수와 필드를 구분할 수 없을 때 붙인다.
		System.out.println("가격 : "+d.format(getPrice()));
		
	}
}
