package loop;

public class ForExam06 {

	public static void main(String[] args) {
		int two = 2;
		int three = 3;
		int four = 4;
		
		for(int a=1; a<=9; a++) {//for문 안, 한 줄에서 반복 되는 것
			for(int b=2; b<=4; b++) { //for문 안, 한 줄에서 바뀌는 것
				System.out.print(b+"*"+ a +"="+(a*b) +"\t");
			}
			System.out.println();
		}

	}

}
