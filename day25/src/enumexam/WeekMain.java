package enumexam;

import java.util.Calendar;

public class WeekMain {

	public static void main(String[] args) {
		Week w=Week.월요일;
		Week w1=Week.월요일;
		
		System.out.println(w);
		System.out.println(Week.FRIDAY);
		System.out.println(Week.SUNDAY.equals("SUNDAY"));//false
		//				enum(Week) 타입   !=  String 타입
		System.out.println(w==Week.월요일);//true
		System.out.println(w==w1);//true
		//							enum은 상수이기 때문에 같은 공간에 저장되어 있음
								//String은 new가 없을 경우 다른 곳에 저장됨
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.월요일;
			break;
		case 3:
			today = Week.화요일;
			break;
		case 4:
			today = Week.수요일;
			break;
		case 5:
			today = Week.THUERSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}//end of switch
		
		System.out.println("오늘 요일 : "+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("축구");
		}else {
			System.out.println("공부");
		}
	}//end of main

}
