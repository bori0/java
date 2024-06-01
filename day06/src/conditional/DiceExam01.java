package conditional;

public class DiceExam01 {

	public static void main(String[] args) {
		double r = Math.random();
		int iRan = (int)r;
		int iRan01 = (int)Math.random()*5; //0~5일거 같으나, 0만 나옴 0에 5를 곱했기 때문
		int iRan02 = (int)(Math.random()*5); //0이상 5미만(0, 1, 2, 3, 4)		                                   
		int iRan03 = (int)(Math.random()*6)+1; //1이상 7미만(1, 2, 3, 4, 5, 6), 주사위		                                   
		int iRan04 = (int)(Math.random()*10)+1; //1이상 11미만(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)		                                   
		                               //나와야할 갯수를 곱한다.
		System.out.println(r);//누를 때마다 다른 값들이 나옴
		System.out.println(iRan);//0, 
		System.out.println(iRan01);//0~5나올거 같으나 0만 나옴
		

	}

}
