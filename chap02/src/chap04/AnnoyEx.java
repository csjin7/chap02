package chap04;

public class AnnoyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anony anony = new Anony();
		
		anony.field.turnOn();
		
		anony.method1();
		
		anony.method2(
			new RemoteControl() {
				@Override
				public void turnOn() {
					// TODO Auto-generated method stub
					System.out.println("*** 켭니다.");
				}
				@Override
				public void turnOff() {
					// TODO Auto-generated method stub
					System.out.println("***  끕니다.");
				}
				
			}
		);
	}	

}
