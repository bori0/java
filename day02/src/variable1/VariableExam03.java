package variable1;

public class VariableExam03 {

	public static void main(String[] args) {
		String name = "홍길동"; //이름
		int kor = 80;//국어
		int eng = 70;//영어
		int mat = 90;//수학
		int sum = 0; //합계, 선언과 동시에 초기화
		             //int sum= kor+eng+mat; 바로 밑에 써도 되긴 함
		int avg = 0;//평균
		
		sum = kor+eng+mat;
		//int kor=80, eng=70, mat=90, sum=0, avg=0;
		avg = (kor+eng+mat)/3;//avg=sum/3
		
		System.out.println("**"+ name +"의 중간고사 성적**");
		System.out.println("=====================================================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("=====================================================");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+sum+"\t"+avg);
		System.out.println("=====================================================");
		
		

	}

}
