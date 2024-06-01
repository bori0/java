package exam.student;

public class Student {
	//#1.필드
	String sn;//학번
	String name;//이름
	//과목을 받아서 배열에 저장 - 과목타입의 배열 생성
	//과목과 점수를 담고 있는 배열은 여럿에서 사용할 것, 필드
	//과목 수는 객체를 생성해서 따로 공간을 확보
	Subject[] subject;//subject타입의 객체 주소를 담는 배열
					//배열을 담을 변수 선언만
	
	//#2.생성자
	public Student(String name, String sn) {//수강과목 수
		this.name =name;
		this.sn=sn;
		//수강과목 수를 넘겨받아 배열 공간을 확보, 배열 초기화시키기
//		this.subject =new Subject[subjectCount];//int[] a =new int[4];//공간 확보가 따로 필요없어서 빼기로 함
	}
	
	//#3.메소드
	int sum=0;
	double avg = 0.0;
	private void calc() {//과목과 과목점수
		
		//합계
		for (int i = 0; i < subject.length; i++) {
			sum+= subject[i].subjectScore;
		}//end of for
		
		//평균
		avg = (double)sum/subject.length;
		
	}	
	void showInfo() {
		calc();//먼저 계산
		
		//출력
		System.out.println("*** "+name+"님 성적 ***");
		System.out.println("학 번 :"+sn);
		System.out.println("총 점 :"+sum);
		System.out.printf("평균 : %.2f\n",avg);
		
	}
	
	// *** ~님 수강과목과 점수 확인 ***
	void checkScore() {
		System.out.println("*** "+name+"님 수강과목과 점수 확인 ***");
		
//		for (int i = 0; i < subject.length; i++) {
//			System.out.println(subject[i].subjectName+" : "+subject[i].subjectScore);
//		}//end of for
		
		for(Subject sub : subject) {
			sub.subjectInfo();
		}
		
	}//end of checkScore
}
