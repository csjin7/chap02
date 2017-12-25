package chap05;

public class ThrowsEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		findClass();
//		try {
//			findClass();
//		} 
//		catch(ClassNotFoundException e) {
//			System.out.println("클래스가 존재하지 않습니다.");
//		} catch(Exception e) {
//			System.out.println("Exception.");
//		}
	}
	
	public static void findClass() throws ClassNotFoundException{
	//public static void findClass() throws Exception {
		Class clazz = Class.forName("java.lang.String2");
	}

}
