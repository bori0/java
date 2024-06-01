package bookexam;

import Interfaceexam1.Computer;
import Interfaceexam1.Controllable;
import Interfaceexam1.NoteBook;

public class ControllableExam {

	public static void main(String[] args) {
		//Controllable crl = new controllable();//컴파일 에러, 객체 생성 불가
		//interface로 추상메소드(미완성 메소드)를 가지고 있어서
		
//      Computer com = new Computer();
//      NoteBook nb = new NoteBook();
//      com.repair();
//      com.turnOn();
//      Controllable.reset();
//      
//      nb.repair();
//      nb.turnOn();
//      Controllable.reset();
      

      Controllable[] com = {
            new Computer(),
            new NoteBook()
      };
      
      for(int i=0; i<com.length; i++) {
         //부모 타입 - 부모가 가지고 있는 내용만 사용가능
         //          단, 오버라이딩 된 메소드 자식것을 쓸수 있다.
         com[i].repair();
         com[i].turnOn();
         Controllable.reset();
         System.out.println();
         
         //자식 타입으로 변환해서 부모와 자식의 내용 모두를 사용
         // 타입변환(down casting)
         
         if(com[i] instanceof Computer) {//처음부터 컴퓨터조건 맞는거 이용
            Computer comp = (Computer)com[i];
            
            comp.turnOff();
         }else if(com[i] instanceof NoteBook) {//아닌건 노트북조건 맞는거 바로 이용
            NoteBook nt = (NoteBook)com[i];	   //밑의 식보다 컴퓨터 부담이 덜하다
            
            nt.turnOff();
         }
         
//         if(com[i] instanceof Computer) {//처음~끝 컴퓨터 조건 맞는거 이용 
//            Computer comp = (Computer)com[i];
//            
//            comp.turnOff();
//         }
//         if(com[i] instanceof NoteBook) {//처음~끝 노트북 조건 맞는거 이용
//            NoteBook nt = (NoteBook)com[i];
//            
//            nt.turnOff();
//         }							//구현될 때까지 시간이 더 오래 걸림
      }
      
      for(Controllable ctl : com) {
         System.out.println("==============");
         ctl.repair();
         ctl.turnOn();
         Controllable.reset();
         System.out.println();
         System.out.println("---------------");
         
         //자식 타입으로
         if(ctl instanceof Computer co) {
              co.turnOff();   
              co.turnOn();
              co.repair();
         }else if(ctl instanceof NoteBook no)
            no.turnOff();
          }
      }
   

}
