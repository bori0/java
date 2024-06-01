package type;

public class TypeExam01 {

	public static void main(String[] args) {
		byte bValue = 50;
		short sValue = 32760;
		int iValue = 56;
		int iValue1 = 2_100_000_000; //.대신 _가능
		long lValue = 35L; //35이면 int로 인식
		float fValue = 3.5f; //3.5를 넣으면 작은 그릇에 큰 범위를 넣으면 오류
		float fValue1 = (float)3.5; //강제 형변환
		double dValue = 3.5;
		
		byte a = 3;
		byte b = 0;
		
//		a= b + bValue; //128안에 들어와서 쓸 수 있을거 같으나, 에러가 뜬다
		               //(byte, short, int) 연산 (byte, short, int) => int
         			   //byte, short로 연산하면 무조건 int
		int c = 0;
		c= b + bValue;
		
		System.out.println();
		

	}

}
