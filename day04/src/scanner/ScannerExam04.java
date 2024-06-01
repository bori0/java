package scanner;

public class ScannerExam04 {

	public static void main(String[] args) {
		long var1=2L;
		float var2=1.8f;
		double var3=2.5;
		String var4="3.9";
		
		System.out.println("(int)var1 = " + (int)var1);
		System.out.println("(int)var2 = " + (int)var2);
		System.out.println("(int)var3 = " + (int)var3);
		System.out.println("Double.parseDouble(var4) = " + Double.parseDouble(var4));
		int result = (int)Double.parseDouble(var4);
		System.out.println("(int)Double.parseDouble(var4) = " + (int)Double.parseDouble(var4));
		
		int result1 = (int)var1 + (int)(var2+var3) + (int)Double.parseDouble(var4);
		
		//integer.parseInt("15") : 정수형의 문자열을 정수형으로 바꾼다
		//Double.parseDouble("3.5") :실수형을 정수형으로 바꾸려면 (int)Double.parseDouble("3.5")
		
		System.out.println(result1);
		
	}

}
