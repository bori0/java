package bookExam01;

public class Exam161_4 {
	public static void main(String[] args) {
//	중첩 for문을 이용하여 방정식 4x+5y=60 의 모든 해를 구해서 (x, y) 형태로 출력해보세요	
//	단, x와 y는 10이하의 자연수입니다	
//  수학4x = 컴 4*x	
//	x=1~10	 x=1 >> y=1, 2, 3, 4, 5, 6, ...  >> 중복 for문
//		while보다는 for문을 쓰는게 더 좋음
		
		
		for(int x=1; x<=10; x++) {
//			System.out.print("x는 " + x + " >> ");
			
			for(int y=1; y<=10; y++) {
//				System.out.print("y는 " + y + "/  ");
				int result = (4*x)+(5*y);
				if(result ==60) {
					System.out.printf("( %d, %d )\n", x, y);
				}//if의 끝
			}//안쪽 for y의 끝
//			System.out.println();//y for문이 끝나야 한줄 내려가는 것
		}//바깥쪽 for x의 끝
	
	}

}
