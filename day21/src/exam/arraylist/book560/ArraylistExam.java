package exam.arraylist.book560;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExam {

	public static void main(String[] args) {
		//인터페이스라 객체생성 불가
		//ArrayList가 List를 구현하기 때문에 가능
		//부모					자식
		List<String> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();
		
		list.add("java");//문자열을 추가한다고 적어놔서 문자열적음
//		list.add(85);//컴파일 에러, 정수값이므로 
					//List<Integer> list = new ArrayList<Integer>();
		list.add("홍");
		list.add("김");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));//i번째가 나오는 것을 출력해줘
		}
		System.out.println("list.size : "+list.size());

		System.out.println("-------------");
		list.add(2, "이");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));//i번째가 나오는 것을 출력해줘
		}
		System.out.println("list.size : "+list.size());

		System.out.println("-------------");
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));//i번째가 나오는 것을 출력해줘
		}
		System.out.println("list.size : "+list.size());
		
		System.out.println("-------------");
		list.clear();
		System.out.println("list.size : "+list.size());//완전히 지우고 싶을 때
	}

}
