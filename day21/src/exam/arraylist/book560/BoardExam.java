package exam.arraylist.book560;

import java.util.ArrayList;
import java.util.List;

public class BoardExam {

	public static void main(String[] args) {
		List<Board> list= new ArrayList<>();//공간확보를 안 했지만 객체를 만들 예정이라는..

//		List<Integer> listInt=new ArrayList<>();
//		listInt.add(5);
//		List<double> listInt=new ArrayList<>();
//		listdouble.add(4.5);
//		List<String> listInt=new ArrayList<>();
//		listString.add("홍");
//		List<Car> listCar = new ArrayList<>();
//		listCar.add(new Car());
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		
//		for (int i = 0; i <list.size(); i++) {
//			System.out.println(list.get(i).getSubject()+", "
//		+list.get(i).getContent()+", "+list.get(i).getWriter());
//		}
		
		for (int i = 0; i <list.size(); i++) {
			Board b = list.get(i);//i번째의 주소를 가져와서 b에 담아놈
			System.out.println(b.getSubject()+", "
					+b.getContent()+", "+b.getWriter());
		}
		System.out.println("--------------------------");
		//향상된 for문
		for(Board bo : list) {
			//print나 println 메소드는 매개값으로 객체나 배열, 참조변수를 넣으면
			//toString을 호출함
			System.out.println(bo);//bo객체가 가리키는 toString으로 보내 결과출력
								//toString 없으면 저장된 주소값나옴
		}
	}

}
