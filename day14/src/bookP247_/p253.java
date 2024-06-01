package bookP247_;

public class p253 {
		int sum1(int[] values) {
			int sum = 0;
			for(int a=0; a<values.length; a++) {
				sum+= values[a];
			}//for의 끝
			return sum;
		}//int끝
		
		int sum2(int ... values) {
			int sum = 0;
			for(int a=0; a<values.length; a++) {
				sum += values[a];
			}//for끝
			return sum;
		}//int끝


}//class끝
