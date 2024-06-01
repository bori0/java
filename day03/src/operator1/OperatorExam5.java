package operator1;

public class OperatorExam5 {
	public static void main(String[] args) {
		int x=1;
		int y=1;
		int a=1;
		int b=1;
		
		int result1 = ++x +10;
		int result2 = y++ +10;
		
		int result3 = a-- + 10;
		int result4 = --b + 10;
		
		System.out.println("result1 = "+ result1);//12 = 1+1+10
		System.out.println("result2 = "+ result2);//11 = 1+10로 결과내고 y+1
		System.out.println("result3 = "+ result3);//11 = 1+10로 결과내고 a-1
		System.out.println("result4 = "+ result4);//10 = 1-1+10
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
