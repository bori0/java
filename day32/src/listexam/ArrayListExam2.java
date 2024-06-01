package listexam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExam2 {

	public static void main(String[] args) {
//		List<Integer> arrList = new ArrayList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(3);
//		arrayList.add("김");
		arrayList.add(new Integer(3));//원래 이렇게 넣는게 맞지만 래포클래스 타입은 자동 포장됨
		arrayList.add(20);
		
		for(int num : arrayList) {//자동 언박싱이 되어서 int로 씀
			System.out.print(num+" ");
		}
		System.out.println();
		
		//		클래스(객체/인스턴스)를 타입으로
		ArrayList<Student> std = new ArrayList<>();
		//배열을 담을 경우
		//Strudent[] std = new Student{"ghd", 20,,,};
		
		std.add(new Student("빨강", 20));
		std.add(new Student("주홍", 25));
		std.add(new Student("노랑", 10));
		System.out.println();
		
		//showInfo출력
		//for 반복문
		for (int i = 0; i <std.size(); i++) {
			std.get(i).showInfo(); //get을 이용해서 얻어온 다음, 호출
		}//안 가져오면 주소가 나옴
		System.out.println();
		
		//향상된 반복문
		for(Student s : std) {
			s.showInfo();
		}
		System.out.println();
		
		//iterator - 한 번 출력하면 끝, 다시 출력하고 싶으면 객체 생성을 다시하고 출력하면 됨
		Iterator<Student> i = std.iterator();
		while(i.hasNext()) {
			i.next().showInfo();
//			System.out.println("이름 : "+i.next().getName()+" 나이 : "+i.next().getAge());
			//next는 뒤로 돌아갈 수 없기 때문에
			//1번 인덱스 이름 + 2번 인덱스 나이 + 3번 인덱스 이름 + 4번 인덱스 나이
			//이렇게 나오는데 만약 인덱스 갯수가 홀수이면 Error
		}
		System.out.println();
		
		
		ArrayList<Board> b= new ArrayList<>();
		
		b.add(new Board("젊은", "사랑하는", "베르나르"));
		b.add(new Board("베르테르의", "사람에게", "베르"));
		b.add(new Board("슬픔", "쓰는 편지", "베르"));
		
		for (int j = 0; j <b.size(); j++) {
			b.get(j).show();
		}
		System.out.println();
		
		for(Board bo: b) {
			bo.show();
		}
		System.out.println();
		
		Iterator<Board> boa = b.iterator();
		
		while(boa.hasNext()) {
			boa.next().show();
		}
	}//메인 끝
	

}
