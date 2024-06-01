package objectexam;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String str01 = "java/html/python/css";											
		
		StringTokenizer strToken = new StringTokenizer(str01, "/"); //import 생성해야 오류 안 뜸											
		while(strToken.hasMoreTokens()) { //꺼내올 문자열이 있으면											
//			String token = strToken.nextToken();										
//			System.out.println(token);										
													
		 System.out.println(strToken.nextToken());
		}								
		
		String str02 = "안녕/java/즐거운 시간";
		String[] arrayStr = str02.split("/| ");

		System.out.println();
		for (int i = 0; i < arrayStr.length; i++) {
			System.out.println(arrayStr[i]);
		}
		System.out.println();
		for(String s : arrayStr) {
			System.out.println(s);
		}
		System.out.println();
		
		//배열을 문자열로 출력
		System.out.println(Arrays.toString(arrayStr));
		System.out.println();
		
		String str03 = "hello java";
		//문자열의 일부만을 출력
		String subStr = str03.substring(3, 5);//마지막 인덱스 : 꺼내오고 싶은 인덱스+1
		System.out.println(subStr);
		System.out.println();
		
		//문자열의 앞/뒤에 있는 공백제거
		String str04="                 hello java               ";
		System.out.print(str04);
		System.out.println("즐거운 시간");
		System.out.print(str04.trim());
		System.out.println("즐거운 시간");
		
	}

}
