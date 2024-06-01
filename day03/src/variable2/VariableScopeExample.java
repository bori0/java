package variable2;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1=15; //지역변수, {}안에서만 사용,
		           //{}벗어나면 메모리에서 지워짐
		
//		if(v1>10) {
//			int v2; //지역변수
//			v2=v1-10;//처음에 값을 부여하지 않았지만 계산식을 부여하는 순간 값이 부여됨
//		} //선언된 중괄호 안에서만 사용가능 
//		  //v2는 여기서 소멸됨
		
		int v2=0; //지역변수
		          
		if(v1>10) {
			v2=v1-10;
		} 
		
		int v3=v1+v2+5;
		System.out.println(v3);
		
	}//v1,2,3 메모리에서 삭제

}
