package collectionexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
//		List<Board> list = new Vector<>();//멀티 쓰레드 환경에서 사용
		List<Board> list = new ArrayList<>();//단일 쓰레드 환경에서 사용
		
		//List에 객체 추가하는 작업 Thread
		Thread threadInput = new Thread() {//익명객체 생성
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					list.add(new Board("제목"+i, "내용"+i, "작성자"+i));
				}
			}
		};
		
		//List에 객체 추가하는 작업 Thread
		Thread threadInput1 = new Thread() {//익명객체 생성
			@Override
			public void run() {
				for (int i = 100; i < 200; i++) {
					list.add(new Board("제목"+i, "내용"+i, "작성자"+i));
				}
			}
		};
		
		//Thread 시작
		//쓰레드명.start()
		threadInput.start();
		threadInput1.start();
		
		//Thread가 작업을 완료할 때까지 main을 잠시 멈춤
		try {
			threadInput.join();
			threadInput1.join();
		} catch (InterruptedException e) {
			System.out.println("예외");
		}
		
		System.out.println("총 객체 수 : "+list.size());
		
	}

}
