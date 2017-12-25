package chap06;

import java.io.UnsupportedEncodingException;

public class StringGetByteEx {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 =str.getBytes();
		System.out.println("byte1.length : " + bytes1.length);
		
		String str1 = new String(bytes1);
		System.out.println(str1);
		
		
		
		byte[] bytes2;
		try {
			bytes2 = str.getBytes("EUC-KR");
			System.out.println("byte2.length : " + bytes2.length);
			
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println(str2);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println(str.length());
		
		
		String new_str = str.replace("안녕", "Hola");
		
		System.out.println(new_str);
		
		String ssn = "721031-1111111";
		
		System.out.println(ssn.substring(0,6));
		System.out.println(ssn.substring(7));
		
		String oriStr = "   Java Hola    "  ;
		System.out.println(oriStr.toLowerCase());
		System.out.println(oriStr.toUpperCase());

		
		System.out.println(oriStr.trim());
		
		
		
	}

}
