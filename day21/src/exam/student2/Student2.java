package exam.student2;

public class Student2 {
	//#1.필드
	String sn;//학번
	String name;//이름
	//과목을 받아서 배열에 저장 - 과목타입의 배열 생성
	//과목과 점수를 담고 있는 배열은 여럿에서 사용할 것, 필드
	//과목 수는 객체를 생성해서 따로 공간을 확보
	Subject[] subject;//subject타입의 객체 주소를 담는 배열
					//배열을 담을 변수 선언만
	
	//#2.생성자
	public Student2(String name, String sn, int subjectCount) {//수강과목 수
		this.name =name;
		this.sn=sn;
		//수강과목 수를 넘겨받아 배열 공간을 확보
		this.subject =new Subject[subjectCount];
	}
	
	void addSubject(String subjectName, int subjectScore) {
		//외부에서 넘겨받은 과목과 점수를 이용해서 객체 생성 - 메소드를 호출할 때마다 생성
		Subject newSubject = new Subject(subjectName, subjectScore);
		
		//생성된 객체를 this.subject = new subject[subjectCount]; 생성한 공간에 누적
		//subject 배열에 빈 공간이 있는지 확인하고
		//없으면 끝//있으면 새로 생성된 객체주소담기
		
		//배열 공간만큼 체트하는 작업 반복 >> for문이용
		//배열 공간이 null인지 아닌지 >> if
	
		//빈공간이 있다면 이 빈 공간에 새로 입력된 과목과 점수를 담고 있는 객체를 저장
		for (int i = 0; i < subject.length; i++) {
			if(subject[i] ==null) {//아직 가리키는 객체가 없으면 이 공간에 객체저장
				subject[i] = newSubject;
				//이미 생성한 객체 하나를 빈 공간에 담았으면 더이상 for문을 돌 필요 없음
				break;
			}//end of if
		}//end of for	
	}//end of addSubject	
	
	
	// *** ~님 수강과목과 점수 확인 ***
	void checkScore() {
		System.out.println("*** "+name+"님 수강과목과 점수 확인 ***");
		for(Subject sub : subject) {
			sub.subjectInfo();
		}
	}
	
	public void show() {
		int sum=0;
		double avg = 0.0;
		
		for (int i = 0; i < subject.length; i++) {
			sum+=subject[i].subjectScore;
		}
		
		avg = (double)sum/subject.length;
		
		System.out.println("*** "+name+"님 성적 ***");
		System.out.println("학 번 :"+sn);
		System.out.println("총 점 :"+sum);
		System.out.printf("평균 : %.2f\n",avg);
	}
	//출력
}
