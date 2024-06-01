package exam.bank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankApplication {
    private static Scanner scan = new Scanner(System.in);
   
    //계좌를 담을 배열 - 모든 메소드에서 공통으로 사용
    private static Account[] arrayAccount = new Account[100];
    
   public static void main(String[] args) {
      
      while(true) {
         int listSelectNo = 0;
         
         System.out.println("----------------------------------------------------");
         System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
         System.out.println("----------------------------------------------------");
         System.out.print("선택>");
         listSelectNo = Integer.parseInt(scan.nextLine());
         
         if(listSelectNo == 5) {
            System.out.println("종료를 선택");
            break;
         }//end of if
   
         switch(listSelectNo) {
         case 1: //계좌생성
        	createAccount(); 
            break;
            
         case 2://계좌목록
        	accountList();
            break;
            
         case 3://예금
        	deposit();
            break;
            
         case 4://출금
        	withdraw();
            break;
   
         }//end of switch
            
      }//end of while
      
   }//end of main
   
   //1.계좌생성
   private static void createAccount() {
	   //#1-1입력받을 계좌번호, 계좌주, 초기금액을 담을 변수
	   String accNo = null;
	   String ownerName = null;
	   int initBalance=0;
	   
      System.out.println("---------");
      System.out.println("계좌생성");
      System.out.println("---------");
      
      System.out.print("계좌번호 : ");
      accNo=scan.nextLine();
      
      System.out.print("계좌주 : ");
      ownerName=scan.nextLine();
      
      System.out.print("초기입금액 : ");
      initBalance=Integer.parseInt(scan.nextLine());
            
      //1)입력된 내용을 이용해서 Account 배열에 저장하기 위해서는 객체 생성이 필요
//      Account newAccount = new Account(accNo, ownerName, initBalance);//한 사람의 자료
//      arrayAccount[0] = newAccount;
      //2)비어있는 배열 공간을 찾아서 위 1)에서 만든 객체 담기 - for, if, break(한사람의 자료만 저장하면 되어서)
      for (int i = 0; i < arrayAccount.length; i++) {
		//빈공간을 찾으면 입력받은 객체를 생성해서 저장
    	  if(arrayAccount[i]==null) {
    		  arrayAccount[i] = new Account(accNo, ownerName, initBalance);
    		  System.out.println("결과 : "+ownerName+"님 계좌생성 성공");
    		  System.out.println();
    		  
    		  //이미 객체를 생성해서 담았으니 반복문을 빠져나가야 함
    		  //더이상 빈 공간 찾기 필요 없음
    		  //빈 공간을 찾았으면 그 곳에 새로 생성된 계좌 객체를 담고 계좌 찾기 작업을 끝내기
    		  break;
    	  }//end of if
	}//end of for
      
      
      //ArrayList를 썼다면
      //list.add(new Account(accNo, ownerName, initBalance));이렇게 쓰면 간단
      
   }//계좌생성 끝
   
   //2. 계좌리스트
   private static void  accountList() {
	      System.out.println("---------");
	      System.out.println("계좌목록");
	      System.out.println("---------");
	      DecimalFormat f=new DecimalFormat("#,###원");
	      
	      //Account 배열에 담겨 있는 모든 객체의 정보를 가져다 출력
	      //for문, 값이 담겨있는(계좌가 있는) 것만 출력 - if(i=null)
	      for (int i = 0; i < arrayAccount.length; i++) {
//			if(arrayAccount[i] !=null) {
//				System.out.printf("%s\t %s\t %s\n", arrayAccount[i].getAccountNo(),
//						arrayAccount[i].getOwner(),
//						f.format(arrayAccount[i].getBalance()));
//			}//end of if
	    	  
	    	  Account a = arrayAccount[i];
	    	  if(a!=null) {//null을 설정 안 하면 : java.lang.NullPointerException
	    		  		//배열에 저장된 것이 없는데 사용하려니까 생기는 에러
	    		  System.out.printf("%s\t %s\t %s\n", a.getAccountNo(),
							a.getOwner(), f.format(a.getBalance()));
	    	  }//end of if
	      }//end of for
	      System.out.println();//줄바꿈
	      
   }//계좌리스트 끝
   
   //3. 예금
    private static void deposit() {
    	//#3-1.계좌있는지 확인 >> 없으면 계좌 생성 >> "계좌번호가 없음" 출력
    	//					>> 있으면 (찾는 계좌에 대한 정보 가져오기)누적
    	//계좌번호를 찾기 위해 매개값(=인자)으로 계좌번호를 넘겨주기
    	
    	//#3-2.계좌찾기 위해서는 계좌번호 입력받기
    	//입금액 입력받기
    	
    	//변수선언
    	String accNo = "";//입력받을 계좌번호
    	int inputBalance = 0;//입력되는 예금액
    	
        System.out.println("---------");
        System.out.println("예    금");
        System.out.println("---------");
        
        //계좌번호와 예금액 입력받기
        System.out.println("계좌번호 : ");
        accNo=scan.nextLine();
        
        System.out.println("예금 액 : ");
        inputBalance = Integer.parseInt(scan.nextLine()); 
        
        //계좌찾기
        Account account = findAccount(accNo);
        
        //반환된 계좌가 있으면 기존 예금액에 현재 입력된 예금액 더하기
        if(account !=null) {
        	account.setBalance(account.getBalance()+inputBalance);
        	System.out.println(account.getOwner()+"님 "+ inputBalance+"더 예금되었습니다.");
        }else {
        	System.out.println("입력한 계좌번호가 없음");
        	System.out.println();
        	return;//메소드를 종료, 생략가능, 생략하면 컴파일러가 컴파일시 넣어줌
        }//end of if
        
    }//예금의 끝
    
    //4. 출금
    private static void withdraw() {
    	//변수선언
    	String accNo = "";//입력받을 계좌번호
    	int drawBalance = 0;//입력되는 출금액
    	
        System.out.println("---------");
        System.out.println("출    금");
        System.out.println("---------");
        
        //계좌번호와 예금액 입력받기
        System.out.print("계좌번호: " );
        accNo = scan.nextLine();
        
        System.out.print("출금 액: ");
        drawBalance = Integer.parseInt(scan.nextLine());

        //계좌찾기
        Account account = findAccount(accNo);
        
        //반환된 계좌가 있으면 기존 예금액에 현재 입력된 출금액 빼기
        if(account !=null) {
        	account.setBalance(account.getBalance()-drawBalance);
        	System.out.println(account.getOwner()+"님 "+ drawBalance+"출금되었습니다.");
        	System.out.println("잔액 : " + account.getBalance() + "원");
        }else {
        	System.out.println("입력한 계좌번호가 없음");
        	System.out.println();
        	return;
        }
        
    } //출금의 끝
    
    //5. 계좌번호 찾기
    private static Account findAccount(String accountNO) {
       //찾는 계좌 객체를 담을 변수
    	Account account = null;
    	
       //계좌찾기 - 배열 전체를 살펴보기(for)
    	//			계좌가 생성되어있는 배열만 찾기(!=null), if
    	//			계좌 있으면 지금 찾는 것과 같은지 비교 - equals
    	for (int i = 0; i < arrayAccount.length; i++) {
			//계좌 있는 부분만 찾기
    		if(arrayAccount!=null) {
    			if(arrayAccount[i].getAccountNo().equals(accountNO)) {
    				account = arrayAccount[i];
    				break;
    			}//end of if안
    			
    		}//end of if밖
		}//end of for
    	return account;//계좌번호 리턴
    	
    }//계좌번호 찾기 끝
    
    
    
}
