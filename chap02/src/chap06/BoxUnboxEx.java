package chap06;

public class BoxUnboxEx {

	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		int val1 = obj1.intValue();
		int val2 = obj2.intValue();
		int val3 = obj3.intValue();
		int val4 = Integer.valueOf("300");
		int val5 = Integer.parseInt("450");
		
		int val6 = Integer.parseInt("450");
		
		Integer obj = 100;  //자동 박싱
		
		int value1 = obj;		//자동 언박싱 	
		int value2 = obj + 100; //자동 언박싱
		
		
		

	}

}
