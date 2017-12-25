package chap07;

import java.text.MessageFormat;
import java.util.Date;

public class DecimalEx {
	public static void main(String[] args) {
		
		double num = 1234567.89;
		Date now = new Date();
		
//		DecimalFormat df = new DecimalFormat("0");
//		System.out.println(df.format(num));
//		
//		
//		df = new DecimalFormat("0.0000");
//		System.out.println(df.format(num));
//		
//		df = new DecimalFormat("+#.0;-#.0");
//		System.out.println(df.format(num));
//		
//
//		df = new DecimalFormat("#.# %");
//		System.out.println(df.format(num));
//
//		
//		df = new DecimalFormat("\u00A4 #,###");
//		System.out.println(df.format(num));
//		
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		
//		sdf = new SimpleDateFormat("오늘은 E 요일");
//		System.out.println(sdf.format(now));
//		
//
//		
//		sdf = new SimpleDateFormat("올해의 D번째 날");
//		System.out.println(sdf.format(now));
//		
//		sdf = new SimpleDateFormat("이달의 d번째 날");
//		System.out.println(sdf.format(now));

		String id = "'java'";
		String name = "'jini Cho'";
		String tel = "'010-1234-1234'";
		
		String text = "회원 ID : {0}  회원 이름 : {1}  회원 전화 : {2} ";
		String result = MessageFormat.format(text, id, name, tel);
		
		System.out.println(result);
		
		String sql  = " INSERT INTO member VALUES( {0}, {1}, {2}) ";
		result = MessageFormat.format(sql, id, name, tel);
				
		System.out.println(result);
			
		
		
		
		
		
	}
}
