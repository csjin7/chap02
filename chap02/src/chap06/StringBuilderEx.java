package chap06;

public class StringBuilderEx {
	private String str;

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		
		System.out.println(sb);

		sb.insert(4, "2");
		System.out.println(sb);
		
		sb.setCharAt(4, 'T');
		System.out.println(sb);
		
		sb.replace(6, 13, "TEST");
		System.out.println(sb);
		
		sb.delete(4, 10);
		System.out.println(sb);
		
		int length = sb.length();
		System.out.println(" total Length : " + length);
		
		String res = sb.toString();
		System.out.println(res);
		System.out.println(res.equals(sb.toString()));
	}

}
