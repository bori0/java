package exceptionexam;

import java.util.Iterator;

public class ExceptionExam7__ {

	public static void main(String[] args) {
//		try {					//462p
//			findClass();
//		}catch(ClassNotFoundException e) {
//			System.out.println("존재하지 않음");
//		}
//
//	}
//	public static void findClass() throws ClassNotFoundException{
//		Class clazz = Class.forName("java.lang.String2");
		
		String[] arr= {"10", "2a"};
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			try {
				value = Integer.parseInt(arr[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환 불가");
			}finally {
				System.out.println(value);
			}
		}
	}

}
