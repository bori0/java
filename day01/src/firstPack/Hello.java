package firstPack; //한줄 주석
//패키지명 - 주석을 제외하고는 무조건 첫 줄에 하나만 작성
/* 여러 줄 주석글 - 프로그램이 실행하지 않는 코드
 * 작성일 : 2023-12-29
 * 작성자 : 우리들
 * 내  용 : 클래스 연습
 */
//접근제한자(제어자), 모든 class에서 접근 가능, public - 누구나 써도 되는
public class Hello {   //class를 작성한다.
	                   //class 이름이 hello
	public static void main(String [] args) { //메인 메소드의 시작
		          //void 처리 후 결과를 어디에 넘기지 않아도 된다
		//자바에서는 실행문은 반드시 세미콜론(;)으로 끝낸다.
		//System.out : 표준출력장치(모니터나 콘솔에)
		//print() : ()안의 내용을 출력
		//println() : ()안의 내용을 출력하고 줄바꿈
		System.out.println("안녕 자바");
		
		System.out.println("즐거운 시간");
		
	}
}//class의 끝
