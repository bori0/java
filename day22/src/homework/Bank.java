package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

import exam.bank.Account;

public class Bank {
	
private static Scanner sc = new Scanner(System.in);
DecimalFormat f= new DecimalFormat("#,###원");
static Account[] arrayAccount = new Account[100];

	public static void main(String[] args) {
		while(true) {
			int listSelectNo = 0;
			System.out.println("----------------------------------------------------");
	         System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
	         System.out.println("----------------------------------------------------");
	         System.out.print("선택>");
	         listSelectNo = Integer.parseInt(sc.nextLine());
	         
	         if(listSelectNo==5) {
	        	 System.out.println("종료");
	         }//end of if
	         
	         switch(listSelectNo){
	         case 1:
	        	 createAccount();
	        	 break;
	         case 2:
	        	 accountList();
	        	 break;
	         case 3:
	        	 deposit();
	        	 break;
	         case 4:
	        	 withdraw();
	        	 break;
	         }//end of switch
		}//end of while
	}//end of main

	
	//계좌생성
	public static void createAccount() {
		//입력받을 계좌번호, 계좌주, 초기금액
		String accNo = null;
		String ownerName = null;
		int initBalance = 0;
		
		System.out.println("---------");
	    System.out.println("계좌생성");
	    System.out.println("---------");
	      
	    System.out.print("계좌번호 : ");
	    accNo=sc.nextLine();
	      
	    System.out.print("계좌주 : ");
	    ownerName=sc.nextLine();
	      
	    System.out.print("초기입금액 : ");
	    initBalance = Integer.parseInt(sc.nextLine());
	    
	    for (int i = 0; i < arrayAccount.length; i++) {
			if(arrayAccount[i]==null) {
				arrayAccount[i]=new Account(accNo, ownerName, initBalance);
	    		System.out.println("결과 : "+ownerName+"님 계좌생성 성공");
	    		System.out.println();
	    		
	    		break;
			}//end of if
		}//end of for
	}//end of createAccount 계좌생성 끝
	
	
	//계좌리스트
	public static void accountList() {
	      System.out.println("---------");
	      System.out.println("계좌목록");
	      System.out.println("---------");
		
	      for (int i = 0; i < arrayAccount.length; i++) {
			Account a = arrayAccount[i];
			if(a!=null) {
				System.out.printf("%s\t%s\t%s\n",a.getAccountNo(),a.getOwner(),a.getBalance());
			}//end of if
		}//end of for
	      System.out.println();//줄바꿈
	}//end of accountList 계좌리스트 끝
	
	
	//예금
	public static void deposit() {
		String accNo = "";
		int inputBalance = 0;
		
        System.out.println("---------");
        System.out.println("예    금");
        System.out.println("---------");
        
        //계좌번호와 예금액 입력받기
        System.out.println("계좌번호 : ");
        accNo=sc.nextLine();
        
        System.out.println("예금 액 : ");
        inputBalance = Integer.parseInt(sc.nextLine());
        
        //계좌찾기
        Account account = findAccount(accNo); 
        
        //반환된 계좌가 있다면, 기존 예금액에 현재 입력된 예금액 더하기
        if(account !=null) {
        	account.setBalance(account.getBalance()+inputBalance);
        	System.out.println(account.getOwner()+"님 "+ inputBalance+"더 예금되었습니다.");
        }else {
        	System.out.println("입력한 계좌번호가 없음");
        	System.out.println();
        	return;        	
        }//end of if
	}//end of deposit 예금 끝
		
	
	//출금
	public static void withdraw() {
    	//변수선언
    	String accNo = "";//입력받을 계좌번호
    	int drawBalance = 0;//입력되는 출금액
    	
    	System.out.println("---------");
        System.out.println("출    금");
        System.out.println("---------");
        
        //계좌번호와 예금액 입력받기
        System.out.print("계좌번호: " );
        accNo = sc.nextLine();
        
        System.out.print("출금 액: ");
        drawBalance=Integer.parseInt(sc.nextLine());

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
        
	}//출금 끝
	
	public static Account findAccount(String accountNo) {
		//찾는 계좌 객체를 담을 변수
		Account account =null;
		
		//계좌 찾기 - 배열 전체 살펴보기 - for
		//			계좌가 생성되어 있는 배열만 찾기 -if
		//			계좌있으면 찾는거랑 같은지 비교 -equals
		for (int i = 0; i < arrayAccount.length; i++) {
			//계좌 있는 부분만 찾기
			if(arrayAccount!=null) {
				if(arrayAccount[i].getAccountNo().equals(accountNo)) {
					account = arrayAccount[i];
					break;
				}//end of if,안
			}//end of if, 밖
		}//end of for
		return account;//계좌번호 리턴
	}//end of findAccount, 계좌대조 끝
}
