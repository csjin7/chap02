package chap06;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringValueOfEx {

	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		
		double dbl = 10.35;
		boolean isbool = false;
		
		String str = "false";
		
//		System.out.println(String.valueOf(dbl));
//		System.out.println(String.valueOf(isbool).equals(str));
//		System.out.println(str.equals(false
//				));
		

		String text = "홍길동,이수홍,박연수,김자바,갈가리";
		
		StringTokenizer st = new StringTokenizer(text,",");
		int countToken = st.countTokens();

		for (int i = 0; i < countToken; i++) {
			String token = st.nextToken();
			System.out.println(token);
			
		}
		
		System.out.println("-=-=-=-=");
		st = new StringTokenizer(text,",");
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			
		}
		
		
		
		
		
	}

}
