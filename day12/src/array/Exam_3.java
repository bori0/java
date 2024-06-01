package array;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_3 {

	public static void main(String[] args) {
		//
		int[] num = new int[45];
		
		for(int b=0; b<1000; b++) {
			num[b] = b+1; 
		
			for(int a=0; a<1000; a++) {
				int n=(int)(Math.random()*45)+1;
				int temp=0;
			
				temp = num[0];
				num[0] = num[n];
				num[n] = temp;
				
			}
		}
		System.out.println(Arrays.toString(num));
	}//main

}
