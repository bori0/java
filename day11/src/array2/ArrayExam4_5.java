package array2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayExam4_5 {

	public static void main(String[] args) {
		//0~9까지의 숫자를 임으로 출력하는 프로그램 작성(shuffle)하시오
		//#1. 임의로 - Math.random()
		
		//#1.변수선언
		int num = (int)(Math.random()*10);
		
		//#2.출력
		System.out.println(num);
		
		//num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}을 임의로 섞어서 출력하는 프로그램 작성(shuffle)하시오
		
		//1.변수선언
		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//변경 전 배열 요소 값 출력
		System.out.println("변경 전 : "+Arrays.toString(number));

		for(int i = 0; i<=100; i++) {
			//임의로 변경되는 0~9사이의 인덱스 번호 만들기
			int n = (int)(Math.random()*10);//임의의 인덱스 번호이기 때문에 0~9
			int temp = 0;
			
			//#방법1) 0번째 요소의 값과 n번째 요소의 값 바꾸기
			temp = number[0];
			number[0] = number[n];
			number[n] = temp;
			
			//# 자리바꿈의 과정을 확인해보기
			for(int a=0; a<number.length; a++) {
				System.out.print(number[a]+", ");
			}//안쪽 for문 끝
			System.out.println();
		}//바깥 for문 끝
		
		//변경 후 배열 요소 값 출력
		System.out.println("변경 후 : "+Arrays.toString(number));
		
	}//end of main

}//end
