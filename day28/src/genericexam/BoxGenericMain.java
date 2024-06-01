package genericexam;

public class BoxGenericMain {

	public static void main(String[] args) {
		BoxGeneric<String> box = new BoxGeneric<>();
					//부모에서 받는 것<T>은 모두 문자열만 받음
		box.set("홍길동");
		box.show();
		
//		BoxGeneric<Integer> boxIn = new BoxGeneric<Integer>();
		BoxGeneric<Integer> boxIn = new BoxGeneric<>();
					//T에 숫자만 받을 수 있음
//		BoxGeneric<Cat> boxCat = new BoxGeneric<Cat>();
		BoxGeneric<Cat> boxCat = new BoxGeneric<>();
				//T에 Cat타입만 들어감
		boxCat.set(new Cat());
		boxCat.show();
	}

}
