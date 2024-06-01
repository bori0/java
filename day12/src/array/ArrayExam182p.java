package array;

public class ArrayExam182p {

	public static void main(String[] args) {
		// 
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum1 += scores[i];
		}
		
		System.out.println(sum1);
		//			메소드 호출 >> 메소드명(매개값(=인자));
//		int sum2 = add(new int[] {83, 90, 87});
		
		int[] scores1 = new int[] {83, 90, 87};
		int sum2 = add(scores1);
		System.out.println(sum2);

	}
	//한 번 이상 사용하는데 복잡할거 같으면 메소드 사용(동작이나 기능을 담고 있음)
	//add 메소드
	//접근제한자 static(위랑 똑같이, 지우면 ERROR)
	//			  반환타입 메소드(매개변수타입 매개변수){//시그니처
	public static int add(int[] scores) {
		int sum = 0;
		for(int a=0; a<scores.length; a++) {
			sum += scores[a];
		}
		return sum;
	}

}
