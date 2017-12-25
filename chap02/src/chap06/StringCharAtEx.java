package chap06;

public class StringCharAtEx {

	public static void main(String[] args) {
		String ssn = "010624-5230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("Man");
			break;
		case '2':
		case '4':
			System.out.println("Woman");
			break;
		}

		String str1 = new String("test");
		String str2 = "test";
		String str3 = "test";
		
		if (str1 != str2) System.out.println("str1 != str2 ");
		
		if (str2 == str3) System.out.println("str2 == str3 ");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str2.equals(str3));
		
		
		
	}

}
