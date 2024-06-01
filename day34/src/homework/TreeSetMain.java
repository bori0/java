package homework;

import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		TreeSet<Person> personTree = new TreeSet<>();
		
		personTree.add(new Person("홍길동", 20));
		personTree.add(new Person("동장군", 50));
		personTree.add(new Person("김자바", 30));
		personTree.add(new Person("홍길동", 43));
		
		for(Person p: personTree) {
			System.out.println(p.name+p.age);
		}
	}

}
