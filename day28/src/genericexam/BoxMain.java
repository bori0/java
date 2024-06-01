package genericexam;

public class BoxMain {

	public static void main(String[] args) {
		Box b=new Box();
		
		b.set("홍길동");
		System.out.println(b.get());
//		String name = b.get();
		
		if(b.get() instanceof String) {
			String name = (String)b.get();
			System.out.println(name);
		}
		
		b.set(50);
		System.out.println(b.get());
		
		b.set(new Apple());//사과의 주소
		System.out.println(b.get());
		
		Apple a= (Apple)b.get();//자기껄 불러오고 싶을 경우 box에서 가져온 값을 형변환시켜야함
		a.showApple();
		
		b.set(new Cat());
		System.out.println(b.get());
		
		//원래 이게 맞는데 불편 
		//객체를 만들 때 내가 담고 싶은 것만 담으려고 미리 설정해주는 것 -제네릭
		if(b.get() instanceof Cat) {
			Cat c = (Cat)b.get();
			c.show();
		}
		//부모로 들어와서 자식껄 숨겨놓음
//		show, showApple못 씀
	}

}
