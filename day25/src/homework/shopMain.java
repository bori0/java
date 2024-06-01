package homework;

public class shopMain {

	public static void main(String[] args) {
		Cosmetics cos = new Cosmetics("립스틱", 25000, "아모레퍼시픽", "red");
		Jeans j = new Jeans("기모청바지", 80000, 77);
		Book b = new Book("DB", 25000, "누구", "한빛");
		
		cos.show();
		System.out.println("---------");
		j.show();
		System.out.println("---------");
		b.show();
		System.out.println("---------");
		
		int sum =0;//총 판매금액
		String store = "";//판매한 제품들
		
		sum=j.getPrice()+b.getPrice()+cos.getPrice();
		store=(j.getName()+", "+b.getName()+", "+cos.getName());
		
		System.out.println("오늘 총 판매액 : "+ sum);
		System.out.println("판매 제품 이름 : "+ store);
	}

}
