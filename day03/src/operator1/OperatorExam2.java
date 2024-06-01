package operator1;

public class OperatorExam2 {

	public static void main(String[] args) {
		//1인당 연필 개수 = 연필 수를 학생 수로 나눈 몫
		//                  연필 수 / 학생 수 
		//남은 연필 수 = 연필 수를 학생수로 나눈 수
		//               연필 수 % 학생 수
		
		//#1. 변수 선언
		int pencils=357;
		int students=13;
		int pencilsPerStudeunt=0;
		int restPencils=0;
		
		//#2.계산
		pencilsPerStudeunt =(pencils / students);
		restPencils=(pencils % students);
		
		//#3.출력
		System.out.println("** 연필 나누기 **");
		System.out.printf("총 연필의 개수 = %d \n학생수 =%d\n", pencils, students);
		System.out.println("1인당 받는 연필 개수 : " + pencilsPerStudeunt);
		System.out.println("남은 연필 개수 : " + restPencils);
		System.out.println();
		
		

	}

}
