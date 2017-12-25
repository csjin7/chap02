package chap05;

public class TryCatchFinallyRuntimeExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = null;
		String data2 = null;
		
//		try {
//			data1 = args[0];
//			data2 = args[1];
//		} catch ( ArrayIndexOutOfBoundsException e) {
//			System.out.println("실행 매개변수가 부족합니다.");
//			return;
//		} 
		
		try {
			
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException  e) {
			System.out.println("실행 매개변수가 부족합니다. 또는 숫자로 변환할 수 없습니다");
		//} catch(NumberFormatException e) {
		} catch(Exception e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요");
		}
		
	}

}
