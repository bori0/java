package collectionexam;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		//객체 생성
//		List list = new ArrayList();//<>타입이 없으면 모든 자료형들을 저장한다.
									//나중에 자료 쓰기 어렵기 때문에 써주는게 좋다
		//Board 객체를 저장할 공간을 만들기, 배열
		//ArrayList 컬렉션 생성
		List<Board> list = new ArrayList<>();
		
		//공간에 객체를 담기(추가)
		list.add(new Board("제목1", "내용1", "작성자1"));
		list.add(new Board("컬렉션", "ArrayList", "작성자2"));
		list.add(new Board("배열", "배열 생성", "작성자3"));
		list.add(new Board("속보", "손흥민, 이강인 주먹다짐", "작성자4"));
		list.add(new Board("어쩌려고 저러나..", "손흥민 부상", "작성자5"));
		
		showPrint(list);
		list.add(new Board("두둥", "소리가 나", "작성자6"));
		showPrint(list);
	}//end of main
	
	public static void showPrint(List list) {//List가 메인 안에 있어서 넘겨 받아야 함
											//메인 밖에 있으면 안 받아도 괜찮다
		System.out.println("총 객체 수 : " +list.size());
		System.out.println(list);// list = list.toString
	}

}
