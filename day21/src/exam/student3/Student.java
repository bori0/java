package exam.student3;

import java.util.ArrayList;

public class Student {
	/*ArrayList
	 * 메모 공간을 동적으로 확보
	 * 배열은 한 번 공간 확보하면 바꿀 수 없음
	 * 메소드
	   + add(요소) : 주어진 객체를 맨 끝에 추가
	   + get(int index) : 주어진 인덱스에 저장된 객체를 리턴
	   + size() : 저장되어 있는 전체 객체 수(=.length)
	   + remove(int index) : 주어진 인덱스의 객체를 삭제
	   */
	
	
	//#1.필드
	String name;//이름
	String sn;//학번
	
	//과목별 점수 저장 공간을 ArrayList
//	ArrayList<E> subject;
	//의미 : 동적인 배열공간을 설정할 것이고, 이곳에는 subject객체가 저장될 것임
	ArrayList<Subject> subject;
	
//	List<subject> subject;//이렇게 써도 된다는디 ERRORㅠㅠ
	
		   //제네릭 
		  //무슨 타입을 쓰는지 알려주게 되어잇다. arrayList를 활용해서 <>에 있는 타입을 담아
		 //부모타입을 쓰기도 하고 Object라고 쓰면 다 써도 되는데 맞취야할 경우도 있기 때문
//	ArrayList<String> subject;
//	ArrayList<int> subject;
		//String, int 등을 쓰면 타입을 맞춰줌
//	ArrayList<integer> subject;
	  //integer은 객체화(주소를 담은 타입으로 인식) : 내포 클래스
	 //기본타입(값)을 담는 것은 올 수 없음
	
	
	//#2.생성자
	public Student(String name, String sn) {
		this.name=name;
		this.sn =sn;
		this.subject = new ArrayList<Subject>();
	}
	
	
	//#3.메소드
	void addSubject(String subjectName, int subjectScore) {
		//수강과목 객체 생성
		Subject newSubject = new Subject();
//      newSubject.subjectName = subjectName; private이니까 외부에서 호출 안됨
		newSubject.setSubjectName(subjectName);
		newSubject.setSubjectScore(subjectScore);
		
		//ArrayList로 생성된 배열에 저장
		subject.add(newSubject);//student에 작성된 배열들이 하나씩 있을 때마다 하나씩 추가해서 쓰면 됨
		subject.add(3,newSubject);//3번 인덱스에 추가를 하나 하라는 의미
								 //하나씩 뒤로 미뤄지기 때문에 속도가 늦어질 수 있다.
//		subject.clear(); //저장된 모든 객체를 삭제
	}//end of addSubject
	
	int sum=0;
	double avg = 0.0;
	private void calc() {	
		for (int i = 0; i < subject.size(); i++) {
//	         sum +=subject[i].getSubjectScore();
			sum +=subject.get(i).getSubjectScore();
		}
		avg=(double)sum/subject.size();
							//ArrayList 크기 : size
							//배열 : length
							//문자열 : length()	
	}//end of calc
	
	
	void showInfo() {
		calc();//먼저 계산
		
		//출력
		System.out.println("*** "+name+"님 성적 ***");
		System.out.println("학 번 :"+sn);
		System.out.println("총 점 :"+sum);
		System.out.printf("평균 : %.2f\n",avg);
	}//end of showInfo
	
	void checkScore() {
		System.out.println("*** "+name+"님 수강과목과 점수 확인 ***");
		for(Subject sub : subject) {
			sub.subjectInfo();
		}
	}//end of checkScore
	
}//end of class
