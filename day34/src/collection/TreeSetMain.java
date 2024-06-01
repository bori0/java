package collection;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		TreeSet<Person> personTree = new TreeSet<>();
		
		personTree.add(new Person("홍길동", 20));
		personTree.add(new Person("이강산", 27));
		personTree.add(new Person("김자바", 22));
		personTree.add(new Person("한바다", 21));
		personTree.add(new Person("홍길동", 22));//숫자로 정렬하라고 했기 때문에 하나의 값만 나옴
		personTree.add(new Person("홍길동", 42));
		personTree.add(new Person("홍길동", 72));
		
		for (Person p : personTree) {
			System.out.println(p.name+" : "+p.age);
		}

		//내림차순, 오름차순
		//comparable >> this.compareTo (외부)  a>b : 1,  a==b : 0,  a<b : -1 // 자기 자신과 외부 비교
		//				compare(a,b)										//(괄호) 안의 숫자끼리 비교
		//									큰 값부터				작은값부터 정렬
		
	}

}
