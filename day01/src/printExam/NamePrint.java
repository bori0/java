package printExam; //첫줄, 하나만

public class NamePrint { // class의 시작
	//main - 메인은 한 class에만, 하나만
	//	jvm이 제일 먼저 읽어서 프로그램을 시작하는 진입점
	//	파일러가 컴파일시 시작하는 시작점, 프로그램 진입점이라고 하기도 하고, Entry poin)


	public static void main(String[] args) {  //main 메소드의 시작

		System.out.println("Hello!! java");//실행문 //main, 메소드 안에서만 사용가능
		System.out.println();
		System.out.println();
		System.out.println("홍");
		System.out.println("길");
		System.out.println("동");
	}//main 메소드의 끝
	 //메소드 안에는 메소드를 만들 수 없다. class를 메소드 밖으로 꺼낼 수 없다

} // end of class
