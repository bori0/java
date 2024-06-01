package objectexam;

import java.text.SimpleDateFormat;
import java.util.Date; //Ctrl + Shift + O

public class DateExam {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);

		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String strNow2 = f.format(now);
		System.out.println(strNow2);
	}

}
