package homework;

import java.util.Iterator;

import genericexam.EnglishScore;
import genericexam.MathScore;

public class Exam {
	
	public static void main(String[]args) {
		EnglishScore[] engArr = {
				new EnglishScore("홍길동", 70),
				new EnglishScore("우영우", 89),
				new EnglishScore("최수연", 90),
				new EnglishScore("이준호", 67),
				new EnglishScore("김자바", 48)
				
		};
		
		MathScore[] matArr= {
				new MathScore("홍길동", 74),
				new MathScore("우영우", 69),
				new MathScore("최수연", 98),
				new MathScore("이준호", 61),
				new MathScore("김자바", 47)	
		};
		
		System.out.println("영어최고점수 :"+best(engArr));
		System.out.println("수학최고점수 :"+best(matArr));
	
	}
	
	static <T extends Comparable<T>> T best (T[] a) {
		T max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(max.compareTo(a[i])<0){
				max=a[i];
			}
		}
		return max;
	}
}
