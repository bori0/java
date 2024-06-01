package conditional;

import java.util.Scanner;
import java.text.DecimalFormat;//Ctrl + Space bar를 누르면 자동으로 들어옴!! 주의!!

public class SwitchExam02_1 {

	public static void main(String[] args) {
		//#1. Scanner 객체 생성 - 입력을 받기
//      Scanner scan = new Scanner(System.in);
//      
//      //#2. 변수 선언
//      String beverage = "";  //음료 이름
//      int beverageChoiceNo=0;  // 주문 음료 번호
//      int beveragePrice = 0; // 가격
//      int salesAmount = 0; // 금액
//      int orderAmount = 0; // 주문수량
//      final int COFFEE_PRICE = 3500;
//      
//      //#3. 안내문구
//      System.out.println("1. 주문할 음료를 선택하세요>>\n[1. 커피, 2. 라떼, 3. 콜라, 4. 녹차]");
//      beverageChoiceNo = scan.nextInt();
//      
//      System.out.print("2. 주문 수량을 입력하세요>> ");
//      orderAmount = scan.nextInt();
//         
//      //#4. 처리
//       DecimalFormat f = new DecimalFormat("#,##0원");  //패턴, 결제 금액을 표시하기 위해
//       
//       switch(beverageChoiceNo) {
//       case 1 :
//             beverage = "커피";
//             beveragePrice = 3500;
//             break;
//       case 2 :
//             beverage = "라떼";
//             beveragePrice = 5500;
//             break;
//       case 3 :
//             beverage = "콜라";
//             beveragePrice = 1500;
//             break;
//       case 4 :
//             beverage = "녹차";
//             beveragePrice = 3500;
//             break;
//       }
//       
//       salesAmount = orderAmount * beveragePrice;  // 금액 = 주문수량 * 가격
//       
//       //#4. 출력
//       System.out.println();
//       System.out.println("** 음료 주문 현황 **");
//       System.out.println("주문한 음료 : " + beverage);
//       System.out.println("주문 수량 : " + orderAmount);
//       System.out.println("결제 금액 : " + f.format(salesAmount));
//       
       
       //#1. Scanner 객체 생성 - 입력을 받기
       Scanner scan = new Scanner(System.in);
       
       //#2. 변수 선언
       String beverage = "";  //음료 이름
       int beverageChoiceNo=0;  // 주문 음료 번호
       int beveragePrice = 0; // 가격
       int salesAmount = 0; // 금액
       int orderAmount = 0; // 주문수량
       final int COFFEE_PRICE = 3500;
       final int LATTE_PRICE = 5500;
       final int COKE_PRICE = 1500;
       final int GREEN_TEA_PRICE = 3500;

       
       //#3. 안내문구
       System.out.println("1. 주문할 음료를 선택하세요>>\n[1. 커피, 2. 라떼, 3. 콜라, 4. 녹차]");
       beverageChoiceNo = scan.nextInt();
       
       System.out.print("2. 주문 수량을 입력하세요>> ");
       orderAmount = scan.nextInt();
       
       //#4. 처리
       DecimalFormat f = new DecimalFormat("#,##0원");  //패턴, 결제 금액을 표시하기 위해
       
       switch(beverageChoiceNo) {
       case 1 :
          beverage = "커피";
          beveragePrice = COFFEE_PRICE;
          break;
       case 2 :
          beverage = "라떼";
          beveragePrice = LATTE_PRICE;
          break;
       case 3 :
          beverage = "콜라";
          beveragePrice = COKE_PRICE;
          break;
       case 4 :
          beverage = "녹차";
          beveragePrice = GREEN_TEA_PRICE;
          break;
       }
       
       salesAmount = orderAmount * beveragePrice;  // 금액 = 주문수량 * 가격
       
       //#4. 출력
       System.out.println();
       System.out.println("** 음료 주문 현황 **");
       System.out.println("주문한 음료 : " + beverage);
       System.out.println("주문 수량 : " + orderAmount);
       System.out.println("결제 금액 : " + f.format(salesAmount));

   }
}