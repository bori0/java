package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();//자식은 부모가 될 수 있다. : 다형성
		
//		HashSet<String> childSet = (HashSet<String>)set;
		//부모를 다시 자식으로, 부모메소드 뿐만 아니라 자식 메소드를 쓰고 싶은 경우
		set.add("java");//new String("java")
		set.add("jdbc");
		set.add("jsp/servlet");
		set.add("java");//equals, hashcode 재정의 되어있기 때문
		set.add("jdbc");//hashcode >(같음)> equals>(다름)>
//		set.add(new Car());//String만 오는 걸로 적어서 적을 수 없다.
		
		System.out.println(set.size());
		//set은 중복을 허용하지 않음 =3
		//기존의 java랑 jdbc를 지우고 그 위에 쓰임
		
		Set<Integer> setInt = new HashSet<>();
		setInt.add(30);
		setInt.add(40);
		setInt.add(30);
		
		System.out.println(setInt.size());//2
		Set<Car> car = new HashSet<>();
		car.add(new Car("노랑"));
		car.add(new Car("파랑"));
		car.add(new Car("노랑"));
		car.add(new Car("파랑"));
		
		System.out.println(car.size());//4 - 객체를 생성하기 때문에 주소가 다름
	}

}
class Car{
	//필드
	String color;
	
	//생성자
	Car(String color){
		this.color = color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//클래스 정보를 가져옴
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color);
		//여기 color랑 다른 color랑 비교해서 같으면 true,
	}
	
}