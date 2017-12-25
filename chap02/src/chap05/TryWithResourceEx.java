package chap05;

public class TryWithResourceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 처리코드가 실행되었습니다.");
		}
	}

}
