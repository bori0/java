package type;

public class TypeExam02 {

	public static void main(String[] args) {
		char cValue = ' '; //초기화시킬 때 홑따옴표 그냥 쓰면 에러, 띄어써야 함!!
		                   //스페이스가 유니코드 32
//		String sValue =""; //""만 써도 가능
		
		char a = 65;
		char a1 = 'A';
		cValue = 'A' + 1; //문자에 정수를 더하라고 해서 'B'를 담으라고 하는 것이고
//		char b = a1 + 1; //char 형도 정수형일 때 연산을 하게 될 때 정수형으로 받아들임
		                 //문자에 숫자를 더하라고 해서 안 됨
		
		System.out.println(a); //A
		System.out.println(a1); //A
		System.out.println(cValue); //B
		                 

	}

}
