package genericexam;
//위에 제네릭이 선언되어 있는게 아니라서 메소드에서 선언을 해줘야함
public class GenericMethod {
	//일반 메소드, 인스턴스 메소드
	public void printInfo() {
		
	}
	//일반 메소드- 정적 메소드(static method)
	public static void printShow() {
		
	}
	
	//제네릭 메소드
	//[접근제한자] static <제네릭타입> 반환타입 메소드명(매개변수타입 매개변수)
	public static <T> void showArrayContent(T[] arr) {
				//반환타입 앞에 씀 <다이아몬드연산>
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	//매개값으로 넘겨 받은 배열의 마지막 요소를 리턴
	//접근제한자 static <제네릭타입> 반환타입 메소드명(매개변수타입 매개변수){}
				//영문 대문자 아무거산 써도 됨
	public static <A> A getLastElement(A[] lastArr) {
				// 1  2                3
				//1번이 2번 3번에 다 영향 같아야함
		return lastArr[lastArr.length-1];
	}//길이 -1 : 마지막 요소, 길이는 1, 2,..배열요소 인덱스는 0, 1,,,
	
	public static void main(String[] args) {
//		GenericMethod gm = new GenericMethod();//이렇게 쓰면 static지우고
		// public <T> void showArrayContent(T[] arr) 이렇게 써도 됨
		//gm.showinfo();하고 호출하면 됨
		Integer[] inArr = {10, 20, 30, 40};
		Character[] chArr = {'j','a','v','a',' ','h','e','l','l','o'};
		String[] strArr = {"사과","딸기","수박"};
		
		//#1.메소드를 호출해서 배열의 내용을 확인
		//	메소드를 호출할 때 구체적인 타입을 생략 - 컴파일러가 결정
//		GenericMethod.showArrayContent(inArr);
		showArrayContent(inArr);//static이 붙어있고 같은 공간이라 그냥 써도 됨
						//구체적인 타입을 생략하면 컴파일러가 매개값을 가지고 타입을 설정
		System.out.println();
		
		showArrayContent(chArr);
		System.out.println();
		
		showArrayContent(strArr);
		System.out.println("---------------");
		
		//#2.메소드 호출시 구체적인 타입을 명시
		//제네릭메소드로 <타입>을 실행할 것이라고 알려주는 것
		GenericMethod.<Integer>showArrayContent(inArr);
		System.out.println();
		
		GenericMethod.<Character>showArrayContent(chArr);
		System.out.println();
		
		GenericMethod.<String>showArrayContent(strArr);
		System.out.println("--------------");
		
		//#3.배열의 마지막 요소를 가져와 출력
		//#3-1.구체적인 타입 생략
		//int 가 <>로 인해 박싱됨
		int num = GenericMethod.getLastElement(inArr);
		System.out.println("inArr의 마지막 요소 : "+num);
		
		String str = GenericMethod.getLastElement(strArr);
		System.out.println(str);
		System.out.println("-----------");
		
		//#3-2.구체적인 타입 명시
		int num1 = GenericMethod.<Integer>getLastElement(inArr);
		System.out.println("inArr의 마지막 요소 : "+num1);
		
		char ch = GenericMethod.<Character>getLastElement(chArr);
		System.out.println("chArr의 마지막 요소 : "+ch);
				
		String st = GenericMethod.<String>getLastElement(strArr);
		System.out.println("stArr의 마지막 요소 : "+st);
	}
}
