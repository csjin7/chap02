package chap06;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		//regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "www@naver.com";
		
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
	}

}
