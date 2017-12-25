package chap02;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("GAS가 남았습니다.");
		} else {
			System.out.println("GAS를 주입해 주세요.");
		}
		
		
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		} 
		
		if(myCar.isLeftGas()) {
			System.out.println("GAS가 남았습니다.");
		} else {
			System.out.println("GAS를 주입해 주세요.");
		}
		
		
	}

}
