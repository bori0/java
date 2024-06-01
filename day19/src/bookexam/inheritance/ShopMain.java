package bookexam.inheritance;

import java.text.DecimalFormat;

public class ShopMain {

	public static void main(String[] args) {
		  int sum = 0;  //당일 판매 금액 총액
		  String nameTotal =""; // 당일 판매 상품 이름
		
	      Cosmetics cos = new Cosmetics("립스틱", 25000, "아모레퍼시픽","Red");
	      Jeans jean = new Jeans("기모청바지", 35000, 77);
	      Book book = new Book("JAVA", 35000, "홍길동", "중앙정보");
	      
	      cos.print();
	      jean.print();
	      book.print();
	      
	      DecimalFormat f= new DecimalFormat("#,###원");
	      System.out.println("==========================================");
	      //제품 총합구하기
	      sum = cos.getPrice()+jean.getPrice()+book.getPrice();
	      System.out.println("오늘 전체 판매 금액 : "+f.format(sum));

	      System.out.println("==========================================");
	      //제품의 이름 나열하기
	      nameTotal=cos.getName()+", "+jean.getName()+", "+book.getName();
	      System.out.println("판매 제품 이름 : "+nameTotal);

	}

}
