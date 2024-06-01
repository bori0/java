package homework;

public class Exam5 {

	public static void main(String[] args) {
		/*
	5.  구구단을 구하는 프로그램을 작성
   		홀수단만 구하기(3, 5, 7, 9 단만)
    	1)  for문만 사용
    	2) for문과 if문 사용
    	3) for문과 if문, continue 활용
*/
		
		for (int i = 3; i <=9; i++) {
			int dan=0;
			int sum=0;
			if(i%2==1) {
				System.out.println(i+"단");
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d*%d = %d\n",i,j,(i*j));
				}
			}
		}
		
		//for문, if문, continue 사용
//		for (int i =3; i <10; i++) {
//			int dan = i;
//			if(i%2==0) {
//				continue;// 증감 i++ 있는 곳으로 되돌아감
//			}
//			System.out.println(i+"단");
//			for (int j =1; j <10; j++) {
//				System.out.printf("%d*%d = %d\n",i,j,(i*j));
//			}
//		}
		
		//for문만 사용
//		for (int i = 3; i <10; i=i+2) {
//			System.out.println(i+"단");
//			for (int j = 1; j <10; j++) {
//				System.out.printf("%d*%d = %d\n",i,j,(i*j));
//			}
//		}
		
		
	}

}
